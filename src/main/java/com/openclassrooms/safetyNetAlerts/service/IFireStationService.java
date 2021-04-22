package com.openclassrooms.safetyNetAlerts.service;

import com.openclassrooms.safetyNetAlerts.model.Firestation;

public interface IFireStationService {

	Firestation getFirestation(String address);

	Firestation postFirestation(Firestation firestation);

	Firestation putFirestation(Firestation firestation);

	Firestation deleteFirestation(String address);

}
