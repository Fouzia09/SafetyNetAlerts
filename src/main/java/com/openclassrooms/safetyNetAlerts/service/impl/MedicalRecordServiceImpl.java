package com.openclassrooms.safetyNetAlerts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.IMedicalRecordDao;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;
import com.openclassrooms.safetyNetAlerts.service.IMedicalRecordService;

@Service
public class MedicalRecordServiceImpl implements IMedicalRecordService {

	@Autowired
	private IMedicalRecordDao medicalRecordDao;

	@Override
	public MedicalRecord getMedicalRecord(String firstName, String lastName) {

		return medicalRecordDao.findById(lastName);
	}

	@Override
	public MedicalRecord deleteMedicalRecord(String firstName, String lastName) {

		medicalRecordDao.deleteById(firstName);
		return medicalRecordDao.findById(firstName);
	}

	@Override
	public MedicalRecord putMedicalRecord(MedicalRecord medicalRecordToPut) {

		return medicalRecordDao.update(null, medicalRecordToPut);
	}

	@Override
	public MedicalRecord postMedicalRecord(MedicalRecord medicalRecordToPost) {

		return medicalRecordToPost;
	}

	@Override
	public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord) {

		return medicalRecordDao.addMedicalRecord(medicalRecord);

	}

	@Override
	public List<MedicalRecord> listMedicalrecord() {

		return medicalRecordDao.listMedicalRecord();
	}

}
