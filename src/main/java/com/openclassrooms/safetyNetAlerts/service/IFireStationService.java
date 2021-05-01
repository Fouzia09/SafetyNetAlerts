package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Firestation;

public interface IFireStationService {

	public List<Firestation> getAllFirestation();

	Firestation getFirestation(String address);

	Firestation postFirestation(Firestation firestation);

	Firestation putFirestation(Firestation firestation);

	Firestation deleteFirestation(String id);

	Firestation addFirestation(Firestation firestation);

	public List<Firestation> listFirestation();

}
