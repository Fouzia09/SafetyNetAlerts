package com.openclassrooms.safetyNetAlerts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.IPersonDao;
import com.openclassrooms.safetyNetAlerts.model.Person;

@Service
public class EndpointService {

	@Autowired
	private IPersonDao personDao;
	private final List<String> email;

	public EndpointService(List<String> email) {
		super();
		this.email = email;
	}

	public List<String> getEmail() {

		return email;
	}

	public List<Person> showMailsByCity(String city) {

		return personDao.findEmailByCity(city);
	}

}
