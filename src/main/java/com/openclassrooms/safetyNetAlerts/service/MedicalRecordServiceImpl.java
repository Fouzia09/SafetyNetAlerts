package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.MedicalRecordDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

@Service
public class MedicalRecordServiceImpl implements IMedicalRecordService {

	@Autowired
	private MedicalRecordDaoImpl MedicalRecordDao;

	@Override
	public List<MedicalRecord> getListMedicalRecords() {

		MedicalRecordDao.findByLastName(null);

		return MedicalRecordDao.findAll();
	}

	@Override
	public MedicalRecord getMedicalRecord(String firstName, String lastName) {

		return MedicalRecordDao.findById(lastName);
	}

	@Override
	public MedicalRecord deleteMedicalRecord(String firstName, String lastName) {

		MedicalRecordDao.deleteById(firstName);
		return MedicalRecordDao.findById(firstName);
	}

	@Override
	public MedicalRecord putMedicalRecord(MedicalRecord medicalRecordToPut) {

		return MedicalRecordDao.update(null, medicalRecordToPut);
	}

	@Override
	public MedicalRecord postMedicalRecord(MedicalRecord medicalRecordToPost) {

		return medicalRecordToPost;
	}

}
