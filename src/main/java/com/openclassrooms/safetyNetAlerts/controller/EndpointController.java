package com.openclassrooms.safetyNetAlerts.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openclassrooms.safetyNetAlerts.service.IPersonInfoService;

@RestController
public class EndpointController {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(EndpointController.class);
	@Autowired
	private ObjectMapper mapper;
	@Autowired
	private IPersonInfoService personInfoService;

//	@GetMapping("/firestation")
//	public ResponseEntity<JsonNode> getPersonsByStationnumber(@RequestParam(required = true) Integer stationNumber) {
//		logger.info("GET /firestation called");
//		JsonNode jsonNode = personInfoService.getListPersonsByStationNumber(stationNumber);
//		logger.info("GET /firestation response : OK");
//		return new ResponseEntity<>(jsonNode, HttpStatus.OK);
//	}

	@GetMapping("/childAlert")
	public ResponseEntity<JsonNode> getChildrenByAddressAndListOtherFamilyMembers(
			@RequestParam(required = true) String address) {
		logger.info("GET /childAlert called");
		JsonNode jsonNode = personInfoService.getListChildrenByAddress(address);
		logger.info("GET /childAlert response : OK");
		return new ResponseEntity<>(jsonNode, HttpStatus.OK);
	}

	@GetMapping("/phoneAlert")
	public ResponseEntity<JsonNode> getPhoneNumbersForStationNumber(
			@RequestParam(required = true) Integer firestation) {
		logger.info("GET /phoneAlert called");
		JsonNode jsonNode = personInfoService.getListPhoneByStation(firestation);
		logger.info("GET /phoneAlert response : OK");
		return new ResponseEntity<>(jsonNode, HttpStatus.OK);
	}

	// http://localhost:8080/fire?address=<address>
	@GetMapping("/fire")
	public ResponseEntity<JsonNode> getPersonsFirestationAndMedicalRecordByAddress(
			@RequestParam(required = true) String address) {
		logger.info("GET /fire called");
		JsonNode jsonNode = personInfoService.getPeopleByAddress(address);
		logger.info("GET /fire response : OK");
		return new ResponseEntity<>(jsonNode, HttpStatus.OK);
	}

	// http://localhost:8080/flood/stations?stations=<a list of station_numbers>
	@GetMapping("/flood/stations")
	public ResponseEntity<JsonNode> getPersonsAndMedicalRecordByStationNumberAndAddresses(
			@RequestParam(required = true) List<Integer> stations) {
		logger.info("GET /flood/stations called");
		JsonNode jsonNode = personInfoService.getPeopleByListStation(stations);
		logger.info("GET /flood/stations response : OK");
		return new ResponseEntity<>(jsonNode, HttpStatus.OK);
	}

	// http://localhost:8080/personInfo?firstName=<firstName>&lastName=<lastName>
	@GetMapping("/personInfo")
	public ResponseEntity<JsonNode> getPersonInfoByFirstNameAndLastName(@RequestParam(required = true) String firstName,
			@RequestParam(required = true) String lastName) {
		logger.info("GET /personInfo called");
		JsonNode jsonNode = personInfoService.getPersonInfo(firstName, lastName);
		logger.info("GET /personInfo response : OK");
		return new ResponseEntity<>(jsonNode, HttpStatus.OK);
	}

	// http://localhost:8080/communityEmail?city=<city>
	@GetMapping("/communityEmail")
	public ResponseEntity<JsonNode> getPhonesInCity(@RequestParam(required = true) String city) {
		logger.info("GET /communityEmail called");
		JsonNode jsonNode = personInfoService.getCommunityEmail(city);
		logger.info("GET /communityEmail response : OK");
		return new ResponseEntity<>(jsonNode, HttpStatus.OK);
	}

}
