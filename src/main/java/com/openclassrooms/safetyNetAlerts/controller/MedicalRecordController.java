package com.openclassrooms.safetyNetAlerts.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;
import com.openclassrooms.safetyNetAlerts.model.Person;
import com.openclassrooms.safetyNetAlerts.service.IMedicalRecordService;

@RestController
public class MedicalRecordController {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MedicalRecordController.class);
	@Autowired
	private ObjectMapper mapper;
	@Autowired
	private IMedicalRecordService MedicalRecordService;

	@GetMapping(value = "/medicalrecord")
	public List<MedicalRecord> showAllmedicalrecord() throws Exception {

		return MedicalRecordService.listMedicalrecord();
	}

	@GetMapping(value = "/medicalRecord/{adress}")
	public MedicalRecord showFireStationById(@PathVariable String address) throws Exception {

		return MedicalRecordService.getMedicalRecord(address, address);
	}

	@PostMapping(value = "/medicalRecord")
	public MedicalRecord postMedicalRecord(@RequestBody MedicalRecord medicalrecord) throws Exception {

		MedicalRecord MedicalRecordAdd = MedicalRecordService.postMedicalRecord(medicalrecord);

		return MedicalRecordAdd;

	}

	@PutMapping(value = "/medicalRecord/{firstNameAndlastName}")
	public MedicalRecord updateMedicalRecord(@RequestBody Person person, @PathVariable MedicalRecord medicalrecord)
			throws Exception {

		MedicalRecord MedicalRecordUpdated = MedicalRecordService.putMedicalRecord(medicalrecord);

		return MedicalRecordUpdated;
	}

	@DeleteMapping(value = "/medicalRecord/{id}")
	public MedicalRecord deleteMedicalRecord(@PathVariable String id) throws Exception {
		return MedicalRecordService.deleteMedicalRecord(id, id);

	}

}
