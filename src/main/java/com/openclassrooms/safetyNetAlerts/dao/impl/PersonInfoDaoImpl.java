package com.openclassrooms.safetyNetAlerts.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.openclassrooms.safetyNetAlerts.dao.IPersonInfoDao;
import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;
import com.openclassrooms.safetyNetAlerts.model.Person;

@Repository
public class PersonInfoDaoImpl implements IPersonInfoDao {

	@Override
	public List<Person> findPersonsByStationNumber(int station) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findPersonsByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicalRecord> findMedicalRecordsByListPerson(List<Person> personneByAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findPersonByFistNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicalRecord findMedicalRecordsByPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findEmailByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findPhoneByStationNumber(int station) {
		// TODO Auto-generated method stub
		return null;
	}

}
