package com.openclassrooms.safetyNetAlerts;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.openclassrooms.safetyNetAlerts.dao.MedicalRecordDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

public class MedicalRecordDAOTest {
	private List<MedicalRecord> listMedicalrecord;
	private MedicalRecordDaoImpl medicalRecordDaoImpl;

	@BeforeEach
	public void setUp() throws Exception {
		medicalRecordDaoImpl = new MedicalRecordDaoImpl(listMedicalrecord);
	}

	@Test
	public void findAll() {

		List<MedicalRecord> listMedicalrecord;
		listMedicalrecord = new ArrayList<MedicalRecord>();
		listMedicalrecord = medicalRecordDaoImpl.findAll();
		MatcherAssert.assertThat(listMedicalrecord.toString(), containsString("allergies"));
	}
}
