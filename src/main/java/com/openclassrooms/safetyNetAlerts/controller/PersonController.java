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
import com.openclassrooms.safetyNetAlerts.model.Person;
import com.openclassrooms.safetyNetAlerts.service.IPersonService;

@RestController

public class PersonController {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(PersonController.class);
	@Autowired
	private ObjectMapper mapper;
	@Autowired
	private IPersonService personService;

	@GetMapping(value = "/toto")
	public String getToto() {
		return "hello";
	}

	@GetMapping(value = "/person")
	public List<Person> showAllPersons() {

		return personService.listPerson();
	}

	@GetMapping(value = "/person/{firstNameAndLastName}")
	public Person showPersonById(@PathVariable String firstNameAndLastName) {

		return personService.findById(firstNameAndLastName);
	}

	@PostMapping(value = "/person")
	public List<Person> addPerson(@RequestBody Person person) {

		return personService.save(person);

	}

	@PutMapping(value = "/person/{firstNameAndLastName}")
	public Person updatePerson(@RequestBody Person person, @PathVariable String firstNameAndLastName) {

		return personService.update(firstNameAndLastName, person);
	}

	@DeleteMapping(value = "/person/{firstNameAndLastName}")
	public List<Person> deletePerson(@PathVariable String firstNameAndLastName) {

		return personService.deleteById(firstNameAndLastName);

	}

}
