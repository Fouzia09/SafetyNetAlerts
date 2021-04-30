package com.openclassrooms.safetyNetAlerts.json;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.openclassrooms.safetyNetAlerts.model.Firestation;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;
import com.openclassrooms.safetyNetAlerts.model.Person;

public class DataReaderJson {

	private static final Logger logger = LogManager.getLogger(DataReaderJson.class);
	private List<Person> persons;
	private List<Firestation> firestations;
	private List<MedicalRecord> medicalRecords;

	private ObjectMapper objectMapper = new ObjectMapper();
	private File file = new File("src/main/resources/data.json");
	private DataReader dataReader;

	private DataReader readJSONFile() throws Exception {

		dataReader = objectMapper.readValue(file, DataReader.class);

		if (dataReader != null) {
			logger.info("Data.json file correctly loaded");
			return dataReader;
		} else {
			logger.error("error to read the Data.json file");
			return null;
		}

	}

	public DataReader getData() throws Exception {

		logger.info("Read data.json file");
		dataReader = readJSONFile();
		return dataReader;
	}

	@Override
	public String toString() {

		return "JSONDataObject [persons=" + persons + ", firestations=" + firestations + ", medicalRecords="
				+ medicalRecords + "]";
	}
}
