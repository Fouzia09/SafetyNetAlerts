package com.openclassrooms.safetyNetAlerts;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.openclassrooms.safetyNetAlerts.service.PersonServiceImpl;

public class PersonServiceTest {

	private PersonServiceImpl personService;

	@BeforeEach
	public void setUp() throws Exception {
		setPersonService(new PersonServiceImpl());

	}

	@Test
	public void findAllServiceTest() {

		/*
		 * List<Person> listPerson; listPerson = new ArrayList<Person>(); listPerson =
		 * (List<Person>) this.personService.findAll();
		 * Assertions.assertThat(listPerson).isEqualTo(null);
		 */
	}

	public PersonServiceImpl getPersonService() {
		return personService;
	}

	public void setPersonService(PersonServiceImpl personService) {
		this.personService = personService;
	}
}
