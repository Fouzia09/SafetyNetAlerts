package com.openclassrooms.safetyNetAlerts.dao;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

public interface IMedicalRecordDao {

	public List<MedicalRecord> listMedicalRecord();

	public MedicalRecord findById(String firstNameAndlastName);

	public MedicalRecord findByFirstName(String firstName);

	public List<MedicalRecord> findByLastName(String lastName);

	public List<MedicalRecord> save(MedicalRecord medicalRecord);

	public MedicalRecord update(String firstNameAndlastName, MedicalRecord medicalRecord);

	public void deleteById(String firstNameAndlastName);

	public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord);

}
