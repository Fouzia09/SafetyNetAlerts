package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Person;

public interface IPersonService {
	public List<Person> findAll() throws Exception;

	public Person findById(String address) throws Exception;

	public List<Person> save(Person person) throws Exception;

	public Person update(String address, Person person) throws Exception;

	public List<Person> deleteById(String id) throws Exception;

}
