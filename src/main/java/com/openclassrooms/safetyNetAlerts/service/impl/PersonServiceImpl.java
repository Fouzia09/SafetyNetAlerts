package com.openclassrooms.safetyNetAlerts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.IPersonDao;
import com.openclassrooms.safetyNetAlerts.model.Person;
import com.openclassrooms.safetyNetAlerts.service.IPersonService;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonDao personDao;

	@Override
	public List<Person> listPerson() {

		return personDao.listPerson();
	}

	@Override
	public Person findById(String address) {

		return personDao.findById(address);
	}

	@Override
	public List<Person> save(Person person) {

		personDao.save(person);

		return personDao.listPerson();
	}

	@Override
	public Person update(String address, Person person) {

		return personDao.update(address, person);
	}

	@Override
	public List<Person> deleteById(String id) {

		personDao.deleteById(id);
		return personDao.listPerson();
	}

	@Override
	public Person addPerson(Person person) {

		return personDao.addPerson(person);
	}

}
