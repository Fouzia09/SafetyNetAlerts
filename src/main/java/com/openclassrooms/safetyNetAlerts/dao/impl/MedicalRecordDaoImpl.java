package com.openclassrooms.safetyNetAlerts.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.openclassrooms.safetyNetAlerts.dao.IMedicalRecordDao;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

@Repository
public class MedicalRecordDaoImpl implements IMedicalRecordDao {

	private List<MedicalRecord> medicalrecords = new ArrayList<MedicalRecord>();

	public MedicalRecordDaoImpl() {

	}

	@Override
	public MedicalRecord findById(String firstNameAndlastName) {
		for (MedicalRecord medicalRecord : medicalrecords) {
			if ((medicalRecord.getFirstName()).equals(firstNameAndlastName)) {
				return medicalRecord;
			}
		}
		return null;
	}

	@Override
	public MedicalRecord findByFirstName(String firstName) {
		List<MedicalRecord> listmedicalRecord = new ArrayList<MedicalRecord>();
		for (MedicalRecord medicalRecords : medicalrecords) {
			if ((medicalRecords.getLastName()).equals(firstName)) {
				listmedicalRecord.add(medicalRecords);
				return medicalRecords;
			}
		}
		return null;
	}

	@Override
	public List<MedicalRecord> findByLastName(String lastName) {
		List<MedicalRecord> listmedicalRecord = new ArrayList<MedicalRecord>();
		for (MedicalRecord medicalRecords : medicalrecords) {
			if ((medicalRecords.getLastName()).equals(lastName)) {
				listmedicalRecord.add(medicalRecords);
			}
		}
		return listmedicalRecord;
	}

	@Override
	public List<MedicalRecord> save(MedicalRecord medicalRecord) {
		List<MedicalRecord> medicalRecords = medicalrecords;
		medicalRecords.add(medicalRecord);
		return medicalRecords;
	}

	@Override
	public MedicalRecord update(String firstNameAndlastName, MedicalRecord medicalRecord) {

		for (MedicalRecord updateMedicalRecord : medicalrecords) {
			if ((updateMedicalRecord.getFirstName()).equals(firstNameAndlastName)) {
				updateMedicalRecord.setLastName(medicalRecord.getLastName());
				updateMedicalRecord.setBirthdate(medicalRecord.getBirthdate());
				updateMedicalRecord.setMedications(medicalRecord.getMedications());
				updateMedicalRecord.setAllergies(medicalRecord.getAllergies());
				;
				return updateMedicalRecord;
			}
		}
		return null;
	}

	@Override
	public void deleteById(String firstNameAndlastName) {
		List<MedicalRecord> deleteMedicalRecords = medicalrecords;
		deleteMedicalRecords.removeIf(medicalRecord -> medicalRecord.getFirstName().equals(firstNameAndlastName));

	}

	@Override
	public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord) {
		medicalrecords.add(medicalRecord);
		return new MedicalRecord();
	}

	@Override
	public List<MedicalRecord> listMedicalRecord() {

		return medicalrecords;
	}

}
