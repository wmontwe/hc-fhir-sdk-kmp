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

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DeviceRequestTest.java
 *
 * Medical device request
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable
 * device, or an external assistive device, such as a walker.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testDeviceRequest01() {
        // Given
        val sourceJson = loadAsString("r4/devicerequest-example-insulinpump.json")

        // When
        val data = parser.toFhir(DeviceRequest::class, sourceJson)

        // Then
        assertDeviceRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDeviceRequest01Step01(data: DeviceRequest) {

        assertEquals(
            expected = "2013-05-08T09:33:27+07:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "Homecare - DM follow-up",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "43148-6",
            actual = data.codeCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.codeCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Insulin delivery device panel",
            actual = data.codeCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter 1",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ip_request1",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "insulinpump",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ip_request1.1",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://motivemi.com/artifacts/PlanDefinition/low-suicide-risk-order-set",
            actual = data.instantiatesCanonical?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.INSTANCE_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "this is the right device brand and model",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-08T09:33:27+07:00",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Nurse Rossignol",
            actual = data.performer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Qualified nurse",
            actual = data.performerType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nurse",
            actual = data.performerType?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CGM ambulatory",
            actual = data.priorRequest?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "gastroparesis",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Gastroparesis",
            actual = data.reasonReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Request for unspecified device",
            actual = data.relevantHistory?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr. Adam Careful",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/dicom",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Previous results",
            actual = data.supportingInfo?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDeviceRequest02() {
        // Given
        val sourceJson = loadAsString("r4/devicerequest-example.json")

        // When
        val data = parser.toFhir(DeviceRequest::class, sourceJson)

        // Then
        assertDeviceRequest02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDeviceRequest02Step01(data: DeviceRequest) {

        assertEquals(
            expected = "Device/example",
            actual = data.codeReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORIGINAL_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
