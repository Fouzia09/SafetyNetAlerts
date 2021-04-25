package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.IPersonDao;
import com.openclassrooms.safetyNetAlerts.dao.PersonDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.Person;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonDao personDAO;

	@Override
	public List<Person> findAll() throws Exception {
		List<Person> listPersons = null;

		personDAO = new PersonDaoImpl(listPersons);
		listPersons = personDAO.findAll();

		return listPersons;
	}

	@Override
	public Person findById(String address) throws Exception {
		Person person = new Person();
		List<Person> listPersons = null;
		personDAO = new PersonDaoImpl(listPersons);
		person = personDAO.findById(address);

		return person;
	}

	@Override
	public List<Person> save(Person person) throws Exception {

		List<Person> listPerson = null;
		personDAO = new PersonDaoImpl(listPerson);
		listPerson = personDAO.save(person);
		return listPerson;
	}

	@Override
	public Person update(String address, Person person) throws Exception {
		List<Person> listPerson = null;
		personDAO = new PersonDaoImpl(listPerson);
		return personDAO.update(address, person);
	}

	@Override
	public List<Person> deleteById(String id) throws Exception {
		List<Person> listPerson = null;
		personDAO = new PersonDaoImpl(listPerson);
		personDAO.deleteById(id);
		return personDAO.findAll();
	}
}
