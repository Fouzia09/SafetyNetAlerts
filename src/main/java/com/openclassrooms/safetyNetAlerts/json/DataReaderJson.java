package com.openclassrooms.safetyNetAlerts.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openclassrooms.safetyNetAlerts.model.Firestation;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;
import com.openclassrooms.safetyNetAlerts.model.Person;
import com.openclassrooms.safetyNetAlerts.service.IFireStationService;
import com.openclassrooms.safetyNetAlerts.service.IMedicalRecordService;
import com.openclassrooms.safetyNetAlerts.service.IPersonService;

@Service
public class DataReaderJson {

	private static final Logger logger = LogManager.getLogger(DataReaderJson.class);

	@Autowired
	private IPersonService personService;
	private IFireStationService fireStationService;
	private IMedicalRecordService medicalRecordService;

	private File file = new File("src/main/resources/data.json");
	private JsonNode node;

	@PostConstruct
	private void readJSONFile() throws Exception {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			this.node = objectMapper.readTree(file);
		} catch (FileNotFoundException e) {
			logger.error("file not found");
		}
		System.out.println(this.node);

		initializePerson();
		// initializeFirestation();
		// initializeMedicalRecord();
	}

	public void initializePerson() {
		JsonNode nodePerson = this.node.path("persons");
		Iterator<JsonNode> listPerson = nodePerson.elements();
		Person person;
		int personNumber = 0;
		ObjectMapper objectMapper = new ObjectMapper();

		while (listPerson.hasNext()) {
			try {
				person = objectMapper.treeToValue(nodePerson.get(personNumber), Person.class);
				// person.setFirstName(nodePerson.get(personNumber).get("firstName"));//
				personService.addPerson(person);
				personNumber++;
				listPerson.next();
			} catch (JsonProcessingException e) {
				e.printStackTrace();

			}

		}
		List<Person> persons = personService.listPerson();
		System.out.println(persons);
	}

	public void initializeFirestation() {
		JsonNode nodeFirestation = this.node.path("firestations");
		Iterator<JsonNode> listFirestation = nodeFirestation.elements();
		Firestation firestation;
		int firestationNumber = 0;
		ObjectMapper objectMapper = new ObjectMapper();

		while (listFirestation.hasNext()) {
			try {
				firestation = objectMapper.treeToValue(nodeFirestation.get(firestationNumber), Firestation.class);
				// person.setFirstName(nodePerson.get(personNumber).get("firstName"));//
				fireStationService.addFirestation(firestation);
				firestationNumber++;
				listFirestation.next();
			} catch (JsonProcessingException e) {
				e.printStackTrace();

			}

		}
		List<Firestation> firestations = fireStationService.listFirestation();
		System.out.println(firestations);
	}

	public void initializeMedicalRecord() {
		JsonNode nodeMedicalRecord = this.node.path("medicalrecords");
		Iterator<JsonNode> listMedicalRecord = nodeMedicalRecord.elements();
		MedicalRecord medicalrecord;
		int medicalRecordNumber = 0;
		ObjectMapper objectMapper = new ObjectMapper();

		while (listMedicalRecord.hasNext()) {
			try {
				medicalrecord = objectMapper.treeToValue(nodeMedicalRecord.get(medicalRecordNumber),
						MedicalRecord.class);
				// person.setFirstName(nodePerson.get(personNumber).get("firstName"));//
				medicalRecordService.addMedicalRecord(medicalrecord);
				medicalRecordNumber++;
				listMedicalRecord.next();
			} catch (JsonProcessingException e) {
				e.printStackTrace();

			}

		}
		List<MedicalRecord> medicalrecords = medicalRecordService.listMedicalrecord();
		System.out.println(medicalrecords);
	}

}
