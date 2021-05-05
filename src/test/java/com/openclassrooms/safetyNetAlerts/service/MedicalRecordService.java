package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import com.openclassrooms.safetyNetAlerts.dao.IMedicalRecordDao;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

public class MedicalRecordService {

	MedicalRecordService medicalRecordService;

	List<MedicalRecord> medicalRecordList;

	@Mock
	IMedicalRecordDao medicalRecordDao;

	@BeforeEach
	void setup() {
		medicalRecordService = new MedicalRecordService();
	}

}
