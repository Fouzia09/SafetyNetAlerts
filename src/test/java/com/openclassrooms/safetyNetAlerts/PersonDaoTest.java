package com.openclassrooms.safetyNetAlerts;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.openclassrooms.safetyNetAlerts.dao.PersonDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.Person;

public class PersonDaoTest {
	private List<Person> listPersons;
	private PersonDaoImpl personDaoImpl;

	@BeforeEach
	public void setUp() throws Exception {
		personDaoImpl = new PersonDaoImpl(listPersons);
	}

	@Test
	public void findAll() {

		List<Person> listPerson;
		listPerson = new ArrayList<Person>();
		listPerson = personDaoImpl.findAll();
		MatcherAssert.assertThat(listPerson.toString(), containsString("John"));
	}

}
