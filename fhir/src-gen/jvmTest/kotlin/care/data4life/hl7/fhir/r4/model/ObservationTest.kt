/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ObservationTest.java
 *
 * Measurements and simple assertions.
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ObservationTest {

    val parser = FhirR4Parser()

    @Test
    fun testObservation1() {
        val sourceJson = loadAsString("r4/observation-example-genetics-1.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("55233-1", data.code?.coding?.get(0)?.code)
        assertEquals("Genetic analysis master panel-- This is the parent OBR for the panel holding all of the associated observations that can be reported with a molecular genetics analysis result.", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("http://hl7.org/fhir/StructureDefinition/observation-geneticsGene", data.extension?.get(0)?.url)
        assertEquals("3236", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code)
        assertEquals("EGFR", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://www.genenames.org", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system)
        assertEquals("http://hl7.org/fhir/StructureDefinition/observation-geneticsDNARegionName", data.extension?.get(1)?.url)
        assertEquals("Exon 21", data.extension?.get(1)?.valueString)
        assertEquals("http://hl7.org/fhir/StructureDefinition/observation-geneticsGenomicSourceClass", data.extension?.get(2)?.url)
        assertEquals("LA6684-0", data.extension?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code)
        assertEquals("somatic", data.extension?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.extension?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system)
        assertEquals("example-genetics-1", data.id)
        assertEquals("2013-04-03T15:30:10+01:00", data.issued?.value.toString(),)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Molecular Diagnostics Laboratory", data.performer?.get(0)?.display)
        assertEquals("Practitioner/example", data.performer?.get(0)?.reference)
        assertEquals("Molecular Specimen ID: MLD45-Z4-1234", data.specimen?.display)
        assertEquals("Specimen/genetics-example1-somatic", data.specimen?.reference)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Molecular Lab Patient ID: HOSP-23456", data.subject?.display)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("10828004", data.valueCodeableConcept?.coding?.get(0)?.code)
        assertEquals("Positive", data.valueCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.valueCodeableConcept?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation2() {
        val sourceJson = loadAsString("r4/observation-example-bmd.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("71341001:272741003=7771000", data.bodySite?.coding?.get(0)?.code)
        assertEquals("http://snomed.info/sct", data.bodySite?.coding?.get(0)?.system)
        assertEquals("Left Femur", data.bodySite?.text)
        assertEquals("24701-5", data.code?.coding?.get(0)?.code)
        assertEquals("Femur DXA Bone density", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("BMD - Left Femur", data.code?.text)
        assertEquals("bmd", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Acme Imaging Diagnostics", data.performer?.get(0)?.display)
        assertEquals("Organization/1832473e-2fe0-452d-abe9-3cdb9879522f", data.performer?.get(0)?.reference)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient/pat2", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("g/cm-2", data.valueQuantity?.code)
        assertEquals("http://unitsofmeasure.org", data.valueQuantity?.system)
        assertEquals("g/cm²", data.valueQuantity?.unit)
        assertEquals("0.887".toDouble(), data.valueQuantity?.value?.value)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation3() {
        val sourceJson = loadAsString("r4/observation-example-respiratory-rate.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("vital-signs", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Vital Signs", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/observation-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Vital Signs", data.category?.get(0)?.text)
        assertEquals("9279-1", data.code?.coding?.get(0)?.code)
        assertEquals("Respiratory rate", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Respiratory rate", data.code?.text)
        assertEquals("1999-07-02", data.effectiveDateTime?.value.toString(),)
        assertEquals("respiratory-rate", data.id)
        assertEquals("http://hl7.org/fhir/StructureDefinition/vitalsigns", data.meta?.profile?.get(0))
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("/min", data.valueQuantity?.code)
        assertEquals("http://unitsofmeasure.org", data.valueQuantity?.system)
        assertEquals("breaths/minute", data.valueQuantity?.unit)
        assertEquals("26".toDouble(), data.valueQuantity?.value?.value)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation4() {
        val sourceJson = loadAsString("r4/observation-example.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("vital-signs", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Vital Signs", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/observation-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("29463-7", data.code?.coding?.get(0)?.code)
        assertEquals("Body Weight", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("3141-9", data.code?.coding?.get(1)?.code)
        assertEquals("Body weight Measured", data.code?.coding?.get(1)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(1)?.system)
        assertEquals("27113001", data.code?.coding?.get(2)?.code)
        assertEquals("Body weight", data.code?.coding?.get(2)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(2)?.system)
        assertEquals("body-weight", data.code?.coding?.get(3)?.code)
        assertEquals("Body Weight", data.code?.coding?.get(3)?.display)
        assertEquals("http://acme.org/devices/clinical-codes", data.code?.coding?.get(3)?.system)
        assertEquals("2016-03-28", data.effectiveDateTime?.value.toString(),)
        assertEquals("Encounter/example", data.encounter?.reference)
        assertEquals("example", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("[lb_av]", data.valueQuantity?.code)
        assertEquals("http://unitsofmeasure.org", data.valueQuantity?.system)
        assertEquals("lbs", data.valueQuantity?.unit)
        assertEquals("185".toDouble(), data.valueQuantity?.value?.value)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation5() {
        val sourceJson = loadAsString("r4/observation-example-haplotype2.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("55233-1", data.code?.coding?.get(0)?.code)
        assertEquals("Genetic analysis master panel-- This is the parent OBR for the panel holding all of the associated observations that can be reported with a molecular genetics analysis result.", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("MolecularSequence/example-pgx-1", data.derivedFrom?.get(0)?.reference)
        assertEquals("MolecularSequence/example-pgx-2", data.derivedFrom?.get(1)?.reference)
        assertEquals("http://hl7.org/fhir/StructureDefinition/observation-geneticsGene", data.extension?.get(0)?.url)
        assertEquals("2623", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code)
        assertEquals("CYP2C9", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://www.genenames.org", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system)
        assertEquals("example-haplotype2", data.id)
        assertEquals("2013-04-03T15:30:10+01:00", data.issued?.value.toString(),)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Molecular Specimen ID: MLD45-Z4-1234", data.specimen?.display)
        assertEquals("Specimen/genetics-example1-somatic", data.specimen?.reference)
        assertEquals(ObservationStatus.UNKNOWN, data.status)
        assertEquals("J*********** C***********", data.subject?.display)
        assertEquals("Patient/727127", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("PA16581679", data.valueCodeableConcept?.coding?.get(0)?.code)
        assertEquals("*4", data.valueCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://pharmakb.org", data.valueCodeableConcept?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation6() {
        val sourceJson = loadAsString("r4/observation-example-mbp.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("vital-signs", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Vital Signs", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/observation-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Vital Signs", data.category?.get(0)?.text)
        assertEquals("8478-0", data.code?.coding?.get(0)?.code)
        assertEquals("Mean blood pressure", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Mean blood pressure", data.code?.text)
        assertEquals("1999-07-02", data.effectiveDateTime?.value.toString(),)
        assertEquals("mbp", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("mm[Hg]", data.valueQuantity?.code)
        assertEquals("http://unitsofmeasure.org", data.valueQuantity?.system)
        assertEquals("mm[Hg]", data.valueQuantity?.unit)
        assertEquals("80".toDouble(), data.valueQuantity?.value?.value)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation7() {
        val sourceJson = loadAsString("r4/observation-example-genetics-brcapat.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("59041-4", data.code?.coding?.get(0)?.code)
        assertEquals("BRCA1+BRCA2 gene mutations tested for in Blood or Tissue by Molecular genetics method Nominal", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("http://hl7.org/fhir/StructureDefinition/observation-geneticsGene", data.extension?.get(0)?.url)
        assertEquals("KX470182.1", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code)
        assertEquals("BRCA", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display)
        assertEquals("https://www.ncbi.nlm.nih.gov/nuccore", data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system)
        assertEquals("http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity", data.extension?.get(1)?.url)
        assertEquals("413581001", data.extension?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code)
        assertEquals("Unknown racial group", data.extension?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://browser.ihtsdotools.org/", data.extension?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system)
        assertEquals("example-genetics-brcapat", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient1 with Breast Cancer FamilyHistory", data.subject?.display)
        assertEquals("Patient/brcapat", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation8() {
        val sourceJson = loadAsString("r4/observation-example-bmi.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("vital-signs", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Vital Signs", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/observation-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Vital Signs", data.category?.get(0)?.text)
        assertEquals("39156-5", data.code?.coding?.get(0)?.code)
        assertEquals("Body mass index (BMI) [Ratio]", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("BMI", data.code?.text)
        assertEquals("1999-07-02", data.effectiveDateTime?.value.toString(),)
        assertEquals("bmi", data.id)
        assertEquals("http://hl7.org/fhir/StructureDefinition/vitalsigns", data.meta?.profile?.get(0))
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("kg/m2", data.valueQuantity?.code)
        assertEquals("http://unitsofmeasure.org", data.valueQuantity?.system)
        assertEquals("kg/m2", data.valueQuantity?.unit)
        assertEquals("16.2".toDouble(), data.valueQuantity?.value?.value)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation9() {
        val sourceJson = loadAsString("r4/observation-example-body-height.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("vital-signs", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Vital Signs", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/observation-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Vital Signs", data.category?.get(0)?.text)
        assertEquals("8302-2", data.code?.coding?.get(0)?.code)
        assertEquals("Body height", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Body height", data.code?.text)
        assertEquals("1999-07-02", data.effectiveDateTime?.value.toString(),)
        assertEquals("body-height", data.id)
        assertEquals("http://hl7.org/fhir/StructureDefinition/vitalsigns", data.meta?.profile?.get(0))
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("[in_i]", data.valueQuantity?.code)
        assertEquals("http://unitsofmeasure.org", data.valueQuantity?.system)
        assertEquals("in", data.valueQuantity?.unit)
        assertEquals("66.89999999999999".toDouble(), data.valueQuantity?.value?.value)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testObservation10() {
        val sourceJson = loadAsString("r4/observation-example-eye-color.json")

        val data = parser.toFhir(Observation::class, sourceJson)

        assertEquals("eye color", data.code?.text)
        assertEquals("2016-05-18", data.effectiveDateTime?.value.toString(),)
        assertEquals("eye-color", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(ObservationStatus.FINAL, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("blue", data.valueString)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
