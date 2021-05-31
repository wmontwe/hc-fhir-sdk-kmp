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
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.ImagingStudyStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ImagingStudyTest.java
 *
 * A set of images produced in single study (one or more series of references images)
 *
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series,
 * each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data)
 * acquired or produced in a common context. A series is of only one modality (e.g. X-ray, CT, MR,
 * ultrasound), but a study may have multiple series of different modalities.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImagingStudyFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testImagingStudy01() {
        // Given
        val sourceJson = loadAsString("r4/imagingstudy-example-xr.json")

        // When
        val data = parser.toFhir(ImagingStudy::class, sourceJson)

        // Then
        assertImagingStudy01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImagingStudy01Step01(data: ImagingStudy) {

        assertEquals(
            expected = "ServiceRequest/example",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example-wadors",
            actual = data.endpoint?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-xr",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:dicom:uid",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.1154777499.30246.19789.3503430046",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/dicom-organization",
            actual = data.identifier?.get(1)?.assigner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACSN",
            actual = data.identifier?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0203",
            actual = data.identifier?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "W12342398",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/dicom-organization",
            actual = data.identifier?.get(2)?.assigner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.SECONDARY,
            actual = data.identifier?.get(2)?.use
        )

        assertEquals(
            expected = "55551234",
            actual = data.identifier?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.interpreter?.get(0)?.reference
                ?.replace("\\n", " ")
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
            expected = "DX",
            actual = data.modality?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.modality?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XR Wrist 3+ Views",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.numberOfInstances?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.numberOfSeries?.value
        )

        assertEquals(
            expected = "RPID2589",
            actual = data.procedureCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XR Wrist 3+ Views",
            actual = data.procedureCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.radlex.org",
            actual = data.procedureCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XR Wrist 3+ Views",
            actual = data.procedureCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Procedure/example",
            actual = data.procedureReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "357009",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Closed fracture of trapezoidal bone of wrist",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.referrer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T-15460",
            actual = data.series?.get(0)?.bodySite?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Wrist Joint",
            actual = data.series?.get(0)?.bodySite?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.series?.get(0)?.bodySite?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XR Wrist 3+ Views",
            actual = data.series?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example-wadors",
            actual = data.series?.get(0)?.endpoint?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.series?.get(0)?.instance?.get(0)?.number?.value
        )

        assertEquals(
            expected = "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            actual = data.series?.get(0)?.instance?.get(0)?.sopClass?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.series?.get(0)?.instance?.get(0)?.sopClass?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PA VIEW",
            actual = data.series?.get(0)?.instance?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.124.113543.6003.1154777499.30246.19789.3503430045.1.1",
            actual = data.series?.get(0)?.instance?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.series?.get(0)?.instance?.get(1)?.number?.value
        )

        assertEquals(
            expected = "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            actual = data.series?.get(0)?.instance?.get(1)?.sopClass?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.series?.get(0)?.instance?.get(1)?.sopClass?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL VIEW",
            actual = data.series?.get(0)?.instance?.get(1)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.124.113543.6003.1154777499.30246.19789.3503430045.1.2",
            actual = data.series?.get(0)?.instance?.get(1)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "419161000",
            actual = data.series?.get(0)?.laterality?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Unilateral left",
            actual = data.series?.get(0)?.laterality?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.series?.get(0)?.laterality?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DX",
            actual = data.series?.get(0)?.modality?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.series?.get(0)?.modality?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.series?.get(0)?.number?.value
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.series?.get(0)?.numberOfInstances?.value
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.series?.get(0)?.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRF",
            actual = data.series?.get(0)?.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.series?.get(0)?.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-01-01T11:01:20+03:00",
            actual = data.series?.get(0)?.started?.value.toString()
        )

        assertEquals(
            expected = "2.16.124.113543.6003.1154777499.30246.19789.3503430045.1",
            actual = data.series?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-01T11:01:20+03:00",
            actual = data.started?.value.toString()
        )

        assertEquals(
            expected = ImagingStudyStatus.AVAILABLE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/dicom",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">XR Wrist 3+ Views. John Smith (MRN: 09236). Accession: W12342398. Performed: 2017-01-01. 1 series, 2 images.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testImagingStudy02() {
        // Given
        val sourceJson = loadAsString("r4/imagingstudy-example.json")

        // When
        val data = parser.toFhir(ImagingStudy::class, sourceJson)

        // Then
        assertImagingStudy02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImagingStudy02Step01(data: ImagingStudy) {

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:dicom:uid",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.1154777499.30246.19789.3503430045",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "1".toLong(),
            actual = data.numberOfInstances?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.numberOfSeries?.value
        )

        assertEquals(
            expected = "67734004",
            actual = data.series?.get(0)?.bodySite?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Upper Trunk Structure",
            actual = data.series?.get(0)?.bodySite?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.series?.get(0)?.bodySite?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CT Surview 180",
            actual = data.series?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.series?.get(0)?.instance?.get(0)?.number?.value
        )

        assertEquals(
            expected = "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            actual = data.series?.get(0)?.instance?.get(0)?.sopClass?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.series?.get(0)?.instance?.get(0)?.sopClass?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.124.113543.6003.189642796.63084.16748.2599092903",
            actual = data.series?.get(0)?.instance?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CT",
            actual = data.series?.get(0)?.modality?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.series?.get(0)?.modality?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.series?.get(0)?.number?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.series?.get(0)?.numberOfInstances?.value
        )

        assertEquals(
            expected = "2.16.124.113543.6003.2588828330.45298.17418.2723805630",
            actual = data.series?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-01-01T11:01:20+03:00",
            actual = data.started?.value.toString()
        )

        assertEquals(
            expected = ImagingStudyStatus.AVAILABLE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/dicom",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">CT Chest.  John Smith (MRN: 09236). Accession: W12342398. Performed: 2011-01-01. 3 series, 12 images.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
