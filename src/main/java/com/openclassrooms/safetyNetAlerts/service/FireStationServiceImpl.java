package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.IFirestationDao;
import com.openclassrooms.safetyNetAlerts.model.Firestation;

@Service
public class FireStationServiceImpl implements IFireStationService {

	@Autowired
	private IFirestationDao FirestationDao;

	@Override
	public Firestation getFirestation(String address) {

		return FirestationDao.findById(address);
	}

	@Override
	public Firestation postFirestation(Firestation firestation) {

		return firestation;
	}

	@Override
	public Firestation putFirestation(Firestation firestation) {

		return FirestationDao.update(null, firestation);
	}

	@Override
	public Firestation deleteFirestation(String id) {

		FirestationDao.deleteById(id);
		return FirestationDao.findById(id);
	}

	@Override
	public List<Firestation> getAllFirestation() {

		return FirestationDao.findAll();
	}

	@Override
	public Firestation addFirestation(Firestation firestation) {
		return FirestationDao.addFirestation(firestation);

	}

	@Override
	public List<Firestation> listFirestation() {

		return FirestationDao.listFirestation();
	}

}
