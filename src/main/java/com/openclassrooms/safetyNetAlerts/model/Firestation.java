package com.openclassrooms.safetyNetAlerts.model;

public class Firestation {

	private String address;
	private int station;

	public Firestation() {

	}

	public Firestation(String address, int station) {
		super();
		this.address = address;
		this.station = station;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public int getStation() {

		return station;
	}

	public void setStation(int station) {

		this.station = station;
	}

	@Override
	public String toString() {
		return getAddress() + ", " + getStation() + "\n";
	}
}
