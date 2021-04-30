package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.openclassrooms.safetyNetAlerts.model.Firestation;

public interface IFireStationService {

	public List<Firestation> getAllFirestation() throws Exception;

	Firestation getFirestation(String address);

	Firestation postFirestation(Firestation firestation);

	Firestation putFirestation(Firestation firestation);

	Firestation deleteFirestation(String id);

}
