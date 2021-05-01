package com.openclassrooms.safetyNetAlerts;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.openclassrooms.safetyNetAlerts.dao.FirestationDaoImpl;
import com.openclassrooms.safetyNetAlerts.model.Firestation;

public class FirestationDaoTest {
	private FirestationDaoImpl firestationDaoImpl;

	@BeforeEach
	public void setUp() throws Exception {
		firestationDaoImpl = new FirestationDaoImpl();
	}

	@Test
	public void findAll() {

		List<Firestation> listFirestation;
		listFirestation = new ArrayList<Firestation>();
		listFirestation = firestationDaoImpl.findAll();
		MatcherAssert.assertThat(listFirestation.toString(), containsString("Culver"));
	}

}
