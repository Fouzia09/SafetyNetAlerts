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
import com.openclassrooms.safetyNetAlerts.model.Firestation;
import com.openclassrooms.safetyNetAlerts.service.IFireStationService;

@RestController
public class FireStationController {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(FireStationController.class);
	@Autowired
	private ObjectMapper mapper;
	@Autowired
	private IFireStationService FireStationService;

	@GetMapping(value = "/firestation")
	public List<Firestation> showAllFirestations() {

		return FireStationService.listFirestation();
	}

	@GetMapping(value = "/firestation/{address}")
	public Firestation showFirestationById(@PathVariable String address) {

		return FireStationService.findById(address);
	}

	@PostMapping(value = "/firestation")
	public List<Firestation> addFirestation(@RequestBody Firestation firestation) {

		return FireStationService.save(firestation);
	}

	@PutMapping(value = "/firestation/{address}")
	public Firestation updateFirestation(@RequestBody Firestation firestation, @PathVariable String address) {

		return FireStationService.update(address, firestation);
	}

	@DeleteMapping(value = "/firestation/{address}")
	public void deleteFirestation(@PathVariable String address) {
		FireStationService.deleteById(address);
	}

}
