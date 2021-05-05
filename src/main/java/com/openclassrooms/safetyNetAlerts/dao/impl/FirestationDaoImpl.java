package com.openclassrooms.safetyNetAlerts.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.openclassrooms.safetyNetAlerts.dao.IFirestationDao;
import com.openclassrooms.safetyNetAlerts.model.Firestation;

@Repository
public class FirestationDaoImpl implements IFirestationDao {

	private List<Firestation> firestations = new ArrayList<Firestation>();

	public FirestationDaoImpl() {

	}

	@Override
	public List<Firestation> listFirestation() {
		System.out.println(firestations);
		return firestations;
	}

	@Override
	public Firestation findById(String firestationAddress) {
		for (Firestation address : firestations) {
			if ((address.getAddress()).equals(firestationAddress)) {
				return address;
			}
		}
		return null;
	}

	@Override
	public List<Firestation> findByAddress(String address) {

		List<Firestation> listFirestation = new ArrayList<Firestation>();
		for (Firestation firestation : firestations) {
			if ((firestation.getAddress()).equals(address)) {
				listFirestation.add(firestation);
			}
		}
		return listFirestation;
	}

	@Override
	public List<Firestation> save(Firestation firestation) {
		List<Firestation> saveFirestation = firestations;
		saveFirestation.add(firestation);
		return saveFirestation;
	}

	@Override
	public Firestation addFirestation(Firestation firestation) {
		firestations.add(firestation);
		return new Firestation();

	}

	@Override
	public Firestation update(String firestationAddress, Firestation firestation) {
		for (Firestation updateFirestation : firestations) {
			if ((updateFirestation.getAddress()).equals(firestationAddress)) {
				updateFirestation.setStation(firestation.getStation());
				return updateFirestation;
			}
		}
		return null;
	}

	@Override
	public void deleteById(String adresse) {

		List<Firestation> deleteFirestation = firestations;
		deleteFirestation.removeIf(firestation -> firestation.getAddress().equals(adresse));
	}
}