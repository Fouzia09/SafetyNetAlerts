package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Firestation;

public interface IFireStationService {

	public Firestation addFirestation(Firestation firestation);

	public List<Firestation> listFirestation();

	public Firestation findById(String address);

	public Firestation update(String address, Firestation firestation);

	public List<Firestation> save(Firestation firestation);

	public List<Firestation> deleteById(String id);

}
