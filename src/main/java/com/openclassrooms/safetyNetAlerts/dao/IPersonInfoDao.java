package com.openclassrooms.safetyNetAlerts.dao;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;
import com.openclassrooms.safetyNetAlerts.model.Person;

public interface IPersonInfoDao {

	public List<Person> findPersonsByStationNumber(int station);

	public List<Person> findPersonsByAddress(String address);

	public List<MedicalRecord> findMedicalRecordsByListPerson(List<Person> personneByAddress);

	public List<Person> findPersonByFistNameAndLastName(String firstName, String lastName);

	public MedicalRecord findMedicalRecordsByPerson(Person person);

	public List<String> findEmailByCity(String city);

	public List<String> findPhoneByStationNumber(int station);

}
