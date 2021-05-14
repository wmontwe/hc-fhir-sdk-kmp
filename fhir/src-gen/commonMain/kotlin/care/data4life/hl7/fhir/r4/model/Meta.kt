/*
 * Copyright (c) 2021 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirMeta : FhirElement {

    // Version specific identifier.
    val versionId: String?

    // When the resource version last changed.
    val lastUpdated: Instant?

    // Identifies where the resource comes from.
    val source: String?

    // Profiles this resource claims to conform to.
    val profile: List<String>?

    // Security Labels applied to this resource.
    val security: List<Coding>?

    // Tags applied to this resource.
    val tag: List<Coding>?
}

/**
 * ClassName: Meta
 *
 * SourceFileName: Meta.kt
 *
 *
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Meta">Meta</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Meta)
 */
@Serializable
@SerialName("Meta")
data class Meta(

    // Version specific identifier.
    @SerialName("versionId")
    override val versionId: String? = null,
    // When the resource version last changed.
    @SerialName("lastUpdated")
    override val lastUpdated: Instant? = null,
    // Identifies where the resource comes from.
    @SerialName("source")
    override val source: String? = null,
    // Profiles this resource claims to conform to.
    @SerialName("profile")
    override val profile: List<String>? = null,
    // Security Labels applied to this resource.
    @SerialName("security")
    override val security: List<Coding>? = null,
    // Tags applied to this resource.
    @SerialName("tag")
    override val tag: List<Coding>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMeta {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Meta"
    }
}
