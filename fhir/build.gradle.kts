import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlinMultiplatform()
    kotlinSerialization()

    // Android
    androidLibrary()
}

version = LibraryConfig.version
group = LibraryConfig.group


kotlin {
    android("android") {
        publishLibraryVariants("release")
    }
    jvm()

    ios {
        binaries {
            framework {
                baseName = LibraryConfig.name
            }
        }
    }

    sourceSets {
        all {
            languageSettings.apply {
                useExperimentalAnnotation("kotlinx.coroutines.ExperimentalCoroutinesApi")
            }
        }

        val commonMain by getting {
            kotlin.srcDir("src-gen/commonMain/kotlin")

            dependencies {
                implementation(Dependencies.multiplatform.kotlin.stdlibCommon)

                implementation(Dependencies.multiplatform.serialization.json)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.testCommon)
                implementation(Dependencies.multiplatform.kotlin.testCommonAnnotations)

                implementation(Dependencies.multiplatform.mockk.common)
                implementation(Dependencies.multiplatform.hamkrest.common)
            }
        }

        val androidMain by getting {
            dependencies {
                //Kotlin
                implementation(Dependencies.multiplatform.kotlin.stdlibAndroid)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.testJvm)
                implementation(Dependencies.multiplatform.kotlin.testJvmJunit)

                implementation(Dependencies.multiplatform.mockk.junit)
                implementation(Dependencies.multiplatform.hamkrest.android)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.stdlibJdk8)
            }
        }
        val jvmTest by getting {
            resources.srcDir("src-gen/jvmTest/resources")

            dependencies {
                implementation(Dependencies.multiplatform.kotlin.testJvm)
                implementation(Dependencies.multiplatform.kotlin.testJvmJunit)

                implementation(Dependencies.multiplatform.mockk.junit)
            }
        }

        val iosMain by getting {
            dependencies {
            }
        }
        val iosTest by getting
    }
}

android {
    compileSdkVersion(LibraryConfig.android.compileSdkVersion)

    defaultConfig {
        minSdkVersion(LibraryConfig.android.minSdkVersion)
        targetSdkVersion(LibraryConfig.android.targetSdkVersion)

        versionCode = LibraryConfig.android.versionCode
        versionName = LibraryConfig.android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments(
            mapOf(
                "clearPackageData" to "true"
            )
        )
    }

    resourcePrefix(LibraryConfig.android.resourcePrefix)

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            java.setSrcDirs(setOf("src/androidMain/kotlin"))
            res.setSrcDirs(setOf("src/androidMain/res"))
        }

        getByName("test") {
            java.setSrcDirs(setOf("src/androidTest/kotlin"))
            res.setSrcDirs(setOf("src/androidTest/res"))
        }
    }
}

val xcodeMode = System.getenv("CONFIGURATION") ?: "DEBUG"
val sdkName = System.getenv("SDK_NAME") ?: "iphonesimulator"
val targetName = "ios" + if (sdkName.startsWith("iphoneos")) "Arm64" else "X64"
val framework = kotlin.targets.getByName<KotlinNativeTarget>(targetName).binaries.getFramework(xcodeMode)
val frameworkFile = framework.outputFile

val xcodeFrameworksDirectory: File? = run {
    val xcodeTargetBuildDir = System.getenv("TARGET_BUILD_DIR") ?: return@run null
    val xcodeFrameworksFolderPath = System.getenv("FRAMEWORKS_FOLDER_PATH") ?: return@run null
    file("$xcodeTargetBuildDir/$xcodeFrameworksFolderPath")
}

val frameworksDirectory = File(buildDir, "xcode-frameworks")

val packForXcode by tasks.creating(Sync::class) {
    group = "build"
    dependsOn(framework.linkTask)

    inputs.property("mode", xcodeMode)

    from({ framework.outputDirectory })
    into(frameworksDirectory)
}
tasks.getByName("build").dependsOn(packForXcode)


val embedAndSignForXcode by tasks.creating(Sync::class) {
    group = "build"
    dependsOn(packForXcode)

    if (xcodeFrameworksDirectory == null) {
        enabled = false
        return@creating
    }

    destinationDir = xcodeFrameworksDirectory.resolve(frameworkFile.name)
    from(frameworksDirectory.resolve(frameworkFile.name))

    // Sign the framework.
    val codeSignIdentity = System.getenv("EXPANDED_CODE_SIGN_IDENTITY")
    inputs.property("codeSignIdentity", codeSignIdentity)

    doLast {
        if (codeSignIdentity.isNullOrEmpty()) {
            return@doLast
        }

        project.exec {
            commandLine(
                "codesign",
                "--force",
                "--sign", codeSignIdentity,
                "--",
                xcodeFrameworksDirectory
                    .resolve(frameworkFile.name)
                    .resolve(frameworkFile.nameWithoutExtension)
            )
        }
    }
}
