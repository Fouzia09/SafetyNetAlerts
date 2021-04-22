package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

public interface MedicalRecordServiceI {

	List<MedicalRecord> getListMedicalRecords();

	MedicalRecord getMedicalRecord(String firstName, String lastName);

	MedicalRecord deleteMedicalRecord(String firstName, String lastName);

	MedicalRecord putMedicalRecord(MedicalRecord medicalRecordToPut);

	MedicalRecord postMedicalRecord(MedicalRecord medicalRecordToPost);

}
