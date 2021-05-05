package com.openclassrooms.safetyNetAlerts.dao;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.openclassrooms.safetyNetAlerts.dao.impl.PersonDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.Person;

public class PersonDaoTest {
	private PersonDaoImpl personDaoImpl;

	@BeforeEach
	public void setUp() throws Exception {
		personDaoImpl = new PersonDaoImpl();
	}

	@Test
	public void findAll() {

		List<Person> listPerson;
		listPerson = new ArrayList<Person>();
		listPerson = personDaoImpl.listPerson();
		MatcherAssert.assertThat(listPerson.toString(), containsString("John"));
	}

}
