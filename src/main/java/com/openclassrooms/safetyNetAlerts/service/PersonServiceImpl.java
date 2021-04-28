package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.PersonDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.Person;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private PersonDaoImpl personDao;

	@Override
	public List<Person> findAll() {

		return personDao.findAll();
	}

	@Override
	public Person findById(String address) {

		return personDao.findById(address);
	}

	@Override
	public List<Person> save(Person person) {

		personDao.save(person);

		return personDao.findAll();
	}

	@Override
	public Person update(String address, Person person) {

		return personDao.update(address, person);
	}

	@Override
	public List<Person> deleteById(String id) {

		personDao.deleteById(id);
		return personDao.findAll();
	}
}
