package com.openclassrooms.safetyNetAlerts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.openclassrooms.safetyNetAlerts.model.Firestation;

@Repository
public class FirestationDaoImpl implements IFirestationDao {

	private List<Firestation> firestations = new ArrayList<Firestation>();

	public FirestationDaoImpl() {

	}

	@Override
	public List<Firestation> findAll() {
		return firestations;
	}

	@Override
	public Firestation findById(String firestationAddress) {
		for (Firestation firestations : firestations) {
			if ((firestations.getAddress()).equals(firestationAddress)) {
				return firestations;
			}
		}
		return null;
	}

	@Override
	public List<Firestation> findAddressByStation(int station) {
		for (Firestation firestations : firestations) {
			if ((firestations.getAddress()).equals(station)) {
				return findAddressByStation(0);
			}
		}
		return null;
	}

	@Override
	public List<Firestation> save(Firestation firestation) {
		List<Firestation> saveFirestation = firestations;
		saveFirestation.add(firestation);
		return saveFirestation;
	}

	@Override
	public Firestation update(String firestationAddress, Firestation firestation) {
		for (Firestation updateFirestation : firestations) {
			if ((updateFirestation.getAddress()).equals(firestationAddress)) {
				updateFirestation.setAddress(firestation.getAddress());
				updateFirestation.setStation(firestation.getStation());

				return updateFirestation;
			}
		}
		return null;
	}

	@Override
	public void deleteById(String firestationAddress) {
		List<Firestation> deleteFirestation = firestations;
		deleteFirestation.removeIf(firestation -> firestation.getAddress().equals(firestationAddress));

	}

	@Override
	public Firestation addFirestation(Firestation firestation) {
		firestations.add(firestation);
		return new Firestation();

	}

	@Override
	public List<Firestation> listFirestation() {

		return firestations;
	}

}