package com.openclassrooms.safetyNetAlerts.dao;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Firestation;

public interface IFirestationDao {

	public List<Firestation> findAll();

	public Firestation findById(String firestationAddress);

	public List<Firestation> findAddressByStation(int station);

	public List<Firestation> save(Firestation firestation);

	public Firestation update(String firestationAddress, Firestation firestation);

	public void deleteById(String firestationAddress);

	public Firestation addFirestation(Firestation firestation);

	public List<Firestation> listFirestation();

}
