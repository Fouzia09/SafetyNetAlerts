package com.openclassrooms.safetyNetAlerts.dao;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Firestation;

public interface IFirestationDao {

	public List<Firestation> findAll();

	public List<Firestation> save(Firestation firestation);

	public void deleteById(String firstNameAndlastName);

	public Firestation addFirestation(Firestation firestation);

	public List<Firestation> listFirestation();

	List<Firestation> findByAddress(String address);

	public Firestation findById(String firestationAddress);

	public Firestation update(String address, Firestation firestation);

}
