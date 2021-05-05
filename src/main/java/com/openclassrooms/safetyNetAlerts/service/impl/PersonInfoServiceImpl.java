package com.openclassrooms.safetyNetAlerts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.openclassrooms.safetyNetAlerts.dao.IPersonInfoDao;
import com.openclassrooms.safetyNetAlerts.service.IPersonInfoService;

@Service
public class PersonInfoServiceImpl implements IPersonInfoService {

	@Autowired
	private IPersonInfoDao personInfoDao;

	@Override
	public JsonNode getListPersonsByStationNumber(int station) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonNode getListChildrenByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonNode getListPhoneByStation(int station) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonNode getPeopleByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonNode getPeopleByListStation(List<Integer> stations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonNode getPersonInfo(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonNode getCommunityEmail(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
