package com.openclassrooms.safetyNetAlerts.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public interface IPersonInfoService {

	JsonNode getListPersonsByStationNumber(int station);

	JsonNode getListChildrenByAddress(String address);

	JsonNode getListPhoneByStation(int station);

	JsonNode getPeopleByAddress(String address);

	JsonNode getPeopleByListStation(List<Integer> stations);

	JsonNode getPersonInfo(String firstName, String lastName);

	JsonNode getCommunityEmail(String city);

}
