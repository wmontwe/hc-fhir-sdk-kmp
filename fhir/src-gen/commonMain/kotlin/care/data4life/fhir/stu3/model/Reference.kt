/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirReference : FhirElement {

    // Literal reference, Relative, internal or absolute URL.
    val reference: String?

    // Logical reference, when literal reference is not known.
    val identifier: Identifier?

    // Text alternative for the resource.
    val display: String?
}


/**
 * ClassName: Reference
 *
 * SourceFileName: Reference.kt
 *
 *
 * A reference from one resource to another
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Reference">Reference</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Reference) on 2020-10-01
 */
@Serializable
@SerialName("Reference")
data class Reference(

    // Literal reference, Relative, internal or absolute URL.
    @SerialName("reference")
    override val reference: String? = null,
    // Logical reference, when literal reference is not known.
    @SerialName("identifier")
    override val identifier: Identifier? = null,
    // Text alternative for the resource.
    @SerialName("display")
    override val display: String? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirReference {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Reference"
    }
}

