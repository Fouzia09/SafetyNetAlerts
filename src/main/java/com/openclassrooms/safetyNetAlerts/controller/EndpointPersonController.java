package com.openclassrooms.safetyNetAlerts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EndpointPersonController {

	@GetMapping(value = "/toto")
	public String getToto() {
		return "hello";
	}
}
