package com.openclassrooms.safetyNetAlerts.controller;

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
import com.openclassrooms.safetyNetAlerts.model.Firestation;
import com.openclassrooms.safetyNetAlerts.service.IFireStationService;

@RestController
public class FireStationController {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(FireStationController.class);
	@Autowired
	private ObjectMapper mapper;
	@Autowired
	private IFireStationService FireStationService;

	@GetMapping(value = "/firestations")
	public String showAllfirestation() throws Exception {

		return mapper.writeValueAsString(FireStationService.getAllFirestation());
	}

	@GetMapping(value = "/firestation/{adress}")
	public Firestation showFireStationById(@PathVariable String address) throws Exception {

		return FireStationService.getFirestation(address);
	}

	@PostMapping(value = "/firestation")
	public Firestation postFirestation(@RequestBody Firestation firestation) throws Exception {

		Firestation FirestationAdd = FireStationService.postFirestation(firestation);

		return FirestationAdd;

	}

	@PutMapping(value = "/firestation/{adress")
	public Firestation updateFireStation(@RequestBody @PathVariable Firestation adress) throws Exception {

		Firestation FirestationUpdated = FireStationService.putFirestation(adress);

		return FirestationUpdated;
	}

	@DeleteMapping(value = "/firestation/{id}")
	public Firestation deleteFireStation(@PathVariable String id) throws Exception {
		return FireStationService.deleteFirestation(id);

	}

}
