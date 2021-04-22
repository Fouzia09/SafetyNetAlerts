package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Person;

public interface PersonServiceI {
	List<Person> GetListPersons();

	Person getPerson(String firstName, String lastName);

	Person postPerson(Person person);

	Person putPerson(Person person);

	Person deletePerson(String firstName, String lastName);

}
