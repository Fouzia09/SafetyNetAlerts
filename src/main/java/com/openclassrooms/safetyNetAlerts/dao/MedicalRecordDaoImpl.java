package com.openclassrooms.safetyNetAlerts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.openclassrooms.safetyNetAlerts.json.DataReaderJson;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

@Repository
public class MedicalRecordDaoImpl implements IMedicalRecordDao {

	private List<MedicalRecord> MedicalRecords;

	public MedicalRecordDaoImpl() {

	}

	@Autowired
	public MedicalRecordDaoImpl(List<MedicalRecord> medicalRecords) throws Exception {
		super();
		medicalRecords = new DataReaderJson().getData().getMedicalRecords();
		MedicalRecords = medicalRecords;
	}

	@Override
	public List<MedicalRecord> findAll() {
		return MedicalRecords;
	}

	@Override
	public MedicalRecord findById(String firstNameAndlastName) {
		for (MedicalRecord medicalRecord : MedicalRecords) {
			if ((medicalRecord.getFirstName()).equals(firstNameAndlastName)) {
				return medicalRecord;
			}
		}
		return null;
	}

	@Override
	public MedicalRecord findByFirstName(String firstName) {
		List<MedicalRecord> listmedicalRecord = new ArrayList<MedicalRecord>();
		for (MedicalRecord medicalRecords : MedicalRecords) {
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
		for (MedicalRecord medicalRecords : MedicalRecords) {
			if ((medicalRecords.getLastName()).equals(lastName)) {
				listmedicalRecord.add(medicalRecords);
			}
		}
		return listmedicalRecord;
	}

	@Override
	public List<MedicalRecord> save(MedicalRecord medicalRecord) {
		List<MedicalRecord> medicalRecords = MedicalRecords;
		medicalRecords.add(medicalRecord);
		return medicalRecords;
	}

	@Override
	public MedicalRecord update(String firstNameAndlastName, MedicalRecord medicalRecord) {

		for (MedicalRecord updateMedicalRecord : MedicalRecords) {
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
		List<MedicalRecord> deleteMedicalRecords = MedicalRecords;
		deleteMedicalRecords.removeIf(medicalRecord -> medicalRecord.getFirstName().equals(firstNameAndlastName));

	}

}
