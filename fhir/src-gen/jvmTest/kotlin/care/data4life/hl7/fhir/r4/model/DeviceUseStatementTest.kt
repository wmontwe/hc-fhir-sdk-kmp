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
import care.data4life.hl7.fhir.r4.codesystem.DeviceUseStatementStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DeviceUseStatementTest.java
 *
 * Record of use of a device
 *
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or another clinician.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceUseStatementTest {

    val parser = FhirR4Parser()

    @Test
    fun testDeviceUseStatement01() {
        // Given
        val sourceJson = loadAsString("r4/deviceusestatement-example.json")

        // When
        val data = parser.toFhir(DeviceUseStatement::class, sourceJson)

        // Then
        assertEquals(
            "Device/example",
            data.device?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http:goodhealth.org/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "51ebb7a9-4e3a-4360-9a05-0cc2d869086f",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Appendectomy (surgery)",
            data.reasonReference?.get(0)?.display
        )
        assertEquals(
            "Procedure/example",
            data.reasonReference?.get(0)?.reference
        )
        assertEquals(
            DeviceUseStatementStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
