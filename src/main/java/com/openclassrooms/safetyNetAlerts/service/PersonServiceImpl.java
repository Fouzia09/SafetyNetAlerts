package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.PersonDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.Person;

@Service
public class PersonServiceImpl {

	@Autowired
	private PersonDaoImpl personDao;

	public List<Person> findAll() {

		return personDao.findAll();
	}

	public Person findById(String address) {

		return personDao.findById(address);
	}

	public List<Person> save(Person person) {

		personDao.save(person);

		return personDao.findAll();
	}

	public Person update(String address, Person person) {

		return personDao.update(address, person);
	}

	public List<Person> deleteById(String id) {

		personDao.deleteById(id);
		return personDao.findAll();
	}
}
