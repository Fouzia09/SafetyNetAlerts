package com.openclassrooms.safetyNetAlerts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetyNetAlerts.dao.IFirestationDao;
import com.openclassrooms.safetyNetAlerts.model.Firestation;
import com.openclassrooms.safetyNetAlerts.service.IFireStationService;

@Service
public class FireStationServiceImpl implements IFireStationService {

	@Autowired
	private IFirestationDao firestationDao;

	@Override
	public List<Firestation> findAll() {

		return firestationDao.findAll();
	}

	@Override
	public List<Firestation> save(Firestation firestation) {

		firestationDao.save(firestation);

		return firestationDao.findAll();
	}

	@Override
	public List<Firestation> deleteById(String id) {

		firestationDao.deleteById(id);
		return firestationDao.findAll();
	}

	@Override
	public Firestation addFirestation(Firestation firestation) {

		return firestationDao.addFirestation(firestation);
	}

	@Override
	public List<Firestation> listFirestation() {

		return firestationDao.listFirestation();
	}

	@Override
	public Firestation findById(String address) {

		return firestationDao.findById(address);
	}

	@Override
	public Firestation update(String address, Firestation firestation) {
		return firestationDao.update(address, firestation);
	}

}
