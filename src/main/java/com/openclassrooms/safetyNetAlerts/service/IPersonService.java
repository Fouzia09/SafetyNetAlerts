package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Person;

public interface IPersonService {

	public List<Person> listPerson();

	public Person findById(String address);

	public List<Person> save(Person person);

	public Person update(String address, Person person);

	public List<Person> deleteById(String id);

	public Person addPerson(Person person);

}
