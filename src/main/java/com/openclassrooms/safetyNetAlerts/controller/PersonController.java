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
import com.openclassrooms.safetyNetAlerts.service.PersonServiceImpl;

@RestController

public class PersonController {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(PersonController.class);
	@Autowired
	private ObjectMapper mapper;
	@Autowired
	private PersonServiceImpl personService;

	@GetMapping(value = "/toto")
	public String getToto() {
		return "hello";
	}

	@GetMapping(value = "/person")
	public String showAllPersons() throws Exception {

		return mapper.writeValueAsString(personService.findAll());
	}

	@GetMapping(value = "/person/{firstNameAndlastName}")
	public Person showPersonById(@PathVariable String firstNameAndlastName) throws Exception {

		return personService.findById(firstNameAndlastName);
	}

	@PostMapping(value = "/person")
	public List<Person> addPerson(@RequestBody Person person) throws Exception {

		List<Person> personList = personService.save(person);

		return personList;

	}

	@PutMapping(value = "/person/{firstNameAndlastName}")
	public Person updatePerson(@RequestBody Person person, @PathVariable String firstNameAndlastName) throws Exception {

		Person personUpdated = personService.update(firstNameAndlastName, person);

		return personUpdated;
	}

	@DeleteMapping(value = "/person/{firstNameAndlastName}")
	public List<Person> deletePerson(@PathVariable String firstNameAndlastName) throws Exception {
		return personService.deleteById(firstNameAndlastName);

	}
}
