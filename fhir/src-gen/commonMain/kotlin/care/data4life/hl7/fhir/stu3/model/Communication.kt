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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.EventStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCommunication
 *
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible
 * provider, a public health agency was notified about a reportable condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Communication">Communication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Communication)
 */
interface FhirCommunication : FhirDomainResource {

    /**
     * Unique identifier.
     */
    val identifier: List<Identifier>?

    /**
     * Instantiates protocol or definition.
     */
    val definition: List<Reference>?

    /**
     * Request fulfilled by this communication.
     */
    val basedOn: List<Reference>?

    /**
     * Part of this action.
     */
    val partOf: List<Reference>?

    /**
     * The status of the transmission.
     */
    val status: EventStatus

    /**
     * Communication did not occur.
     */
    val notDone: Bool?

    /**
     * Why communication did not occur.
     */
    val notDoneReason: CodeableConcept?

    /**
     * Message category.
     */
    val category: List<CodeableConcept>?

    /**
     * A channel of communication.
     */
    val medium: List<CodeableConcept>?

    /**
     * Focus of message.
     */
    val subject: Reference?

    /**
     * Message recipient.
     */
    val recipient: List<Reference>?

    /**
     * Focal resources.
     */
    val topic: List<Reference>?

    /**
     * Encounter or episode leading to message.
     */
    val context: Reference?

    /**
     * When sent.
     */
    val sent: DateTime?

    /**
     * When received.
     */
    val received: DateTime?

    /**
     * Message sender.
     */
    val sender: Reference?

    /**
     * Indication for message.
     */
    val reasonCode: List<CodeableConcept>?

    /**
     * Why was communication done?.
     */
    val reasonReference: List<Reference>?

    /**
     * Message payload.
     */
    val payload: List<CommunicationPayload>?

    /**
     * Comments made about the communication.
     */
    val note: List<Annotation>?
}

/**
 * Communication
 *
 * SourceFileName: Communication.kt
 *
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible
 * provider, a public health agency was notified about a reportable condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Communication">Communication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Communication)
 */
@Serializable
@SerialName("Communication")
data class Communication(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("definition")
    override val definition: List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: List<Reference>? = null,

    @SerialName("status")
    override val status: EventStatus,

    @SerialName("notDone")
    override val notDone: Bool? = null,

    @SerialName("notDoneReason")
    override val notDoneReason: CodeableConcept? = null,

    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    @SerialName("medium")
    override val medium: List<CodeableConcept>? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("recipient")
    override val recipient: List<Reference>? = null,

    @SerialName("topic")
    override val topic: List<Reference>? = null,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("sent")
    override val sent: DateTime? = null,

    @SerialName("received")
    override val received: DateTime? = null,

    @SerialName("sender")
    override val sender: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    @SerialName("payload")
    override val payload: List<CommunicationPayload>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirCommunication {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Communication"
    }
}

/**
 * FhirCommunicationPayload
 *
 * Text, attachment(s), or resource(s) that was communicated to the recipient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Communication">CommunicationPayload</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Communication)
 */
interface FhirCommunicationPayload : FhirBackboneElement {

    /**
     * Message part content.
     */
    val contentString: String?

    /**
     * Message part content.
     */
    val contentAttachment: Attachment?

    /**
     * Message part content.
     */
    val contentReference: Reference?
}

/**
 * CommunicationPayload
 *
 * SourceFileName: Communication.kt
 *
 * Text, attachment(s), or resource(s) that was communicated to the recipient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Communication">CommunicationPayload</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Communication)
 */
@Serializable
@SerialName("CommunicationPayload")
data class CommunicationPayload(

    @SerialName("contentString")
    override val contentString: String? = null,

    @SerialName("contentAttachment")
    override val contentAttachment: Attachment? = null,

    @SerialName("contentReference")
    override val contentReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCommunicationPayload {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CommunicationPayload"
    }
}
