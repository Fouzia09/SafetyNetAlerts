package com.openclassrooms.safetyNetAlerts.dao;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Person;

public interface IPersonDao {

	public List<Person> findAll();

	public Person findById(String firstNameAndlastName);

	public List<Person> findByLastName(String lastName);

	public List<Person> findByAddress(String address);

	public List<Person> findEmailByCity(String city);

	public List<Person> save(Person person);

	public Person update(String firstNameAndlastName, Person person);

	public void deleteById(String firstNameAndlastName);

	public Person addPerson(Person person);

	public List<Person> listPerson();

}
