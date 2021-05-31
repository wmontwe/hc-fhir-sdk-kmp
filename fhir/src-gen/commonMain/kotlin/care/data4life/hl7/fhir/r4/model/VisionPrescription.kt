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

import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.VisionBase
import care.data4life.hl7.fhir.r4.codesystem.VisionEyes
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirVisionPrescription
 *
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
interface FhirVisionPrescription : FhirDomainResource {

    /**
     * Business Identifier for vision prescription.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

    /**
     * Response creation date.
     */
    val created: DateTime

    /**
     * Who prescription is for.
     */
    val patient: Reference

    /**
     * Created during encounter / admission / stay.
     */
    val encounter: Reference?

    /**
     * When prescription was authorized.
     */
    val dateWritten: DateTime

    /**
     * Who authorized the vision prescription.
     */
    val prescriber: Reference

    /**
     * Vision lens authorization.
     */
    val lensSpecification: kotlin.collections.List<VisionPrescriptionLensSpecification>
}

/**
 * VisionPrescription
 *
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
@Serializable
@SerialName("VisionPrescription")
data class VisionPrescription(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FinancialResourceStatusCodes,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("dateWritten")
    override val dateWritten: DateTime,

    @SerialName("prescriber")
    override val prescriber: Reference,

    @SerialName("lensSpecification")
    override val lensSpecification: kotlin.collections.List<VisionPrescriptionLensSpecification>,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirVisionPrescription {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "VisionPrescription"
    }
}

/**
 * FhirVisionPrescriptionLensSpecification
 *
 * Contain the details of the individual lens specifications and serves as the authorization for the
 * fullfillment by certified professionals.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescriptionLensSpecification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
interface FhirVisionPrescriptionLensSpecification : FhirBackboneElement {

    /**
     * Product to be supplied.
     */
    val product: CodeableConcept

    /**
     * The eye for which the lens specification applies.
     */
    val eye: VisionEyes

    /**
     * Power of the lens.
     */
    val sphere: Decimal?

    /**
     * Lens power for astigmatism.
     */
    val cylinder: Decimal?

    /**
     * Lens meridian which contain no power for astigmatism.
     */
    val axis: Integer?

    /**
     * Eye alignment compensation.
     */
    val prism: kotlin.collections.List<VisionPrescriptionLensSpecificationPrism>?

    /**
     * Added power for multifocal levels.
     */
    val add: Decimal?

    /**
     * Contact lens power.
     */
    val power: Decimal?

    /**
     * Contact lens back curvature.
     */
    val backCurve: Decimal?

    /**
     * Contact lens diameter.
     */
    val diameter: Decimal?

    /**
     * Lens wear duration.
     */
    val duration: Quantity?

    /**
     * Color required.
     */
    val color: String?

    /**
     * Brand required.
     */
    val brand: String?

    /**
     * Notes for coatings.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * VisionPrescriptionLensSpecification
 *
 * Contain the details of the individual lens specifications and serves as the authorization for the
 * fullfillment by certified professionals.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescriptionLensSpecification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
@Serializable
@SerialName("VisionPrescriptionLensSpecification")
data class VisionPrescriptionLensSpecification(

    @SerialName("product")
    override val product: CodeableConcept,

    @SerialName("eye")
    override val eye: VisionEyes,

    @SerialName("sphere")
    override val sphere: Decimal? = null,

    @SerialName("cylinder")
    override val cylinder: Decimal? = null,

    @SerialName("axis")
    override val axis: Integer? = null,

    @SerialName("prism")
    override val prism: kotlin.collections.List<VisionPrescriptionLensSpecificationPrism>? = null,

    @SerialName("add")
    override val add: Decimal? = null,

    @SerialName("power")
    override val power: Decimal? = null,

    @SerialName("backCurve")
    override val backCurve: Decimal? = null,

    @SerialName("diameter")
    override val diameter: Decimal? = null,

    @SerialName("duration")
    override val duration: Quantity? = null,

    @SerialName("color")
    override val color: String? = null,

    @SerialName("brand")
    override val brand: String? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirVisionPrescriptionLensSpecification {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "VisionPrescriptionLensSpecification"
    }
}

/**
 * FhirVisionPrescriptionLensSpecificationPrism
 *
 * Allows for adjustment on two axis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescriptionLensSpecificationPrism</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
interface FhirVisionPrescriptionLensSpecificationPrism : FhirBackboneElement {

    /**
     * Amount of adjustment.
     */
    val amount: Decimal

    /**
     * The relative base, or reference lens edge, for the prism.
     */
    val base: VisionBase
}

/**
 * VisionPrescriptionLensSpecificationPrism
 *
 * Allows for adjustment on two axis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescriptionLensSpecificationPrism</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
@Serializable
@SerialName("VisionPrescriptionLensSpecificationPrism")
data class VisionPrescriptionLensSpecificationPrism(

    @SerialName("amount")
    override val amount: Decimal,

    @SerialName("base")
    override val base: VisionBase,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirVisionPrescriptionLensSpecificationPrism {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "VisionPrescriptionLensSpecificationPrism"
    }
}
