package com.api.timelineapi.controller.location;

import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import com.api.timelineapi.models.LocationList;
import com.api.timelineapi.service.location.LocationService;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
public class LocationController {

	@Autowired
	private LocationService locationService;

	@Autowired
	private HttpServletRequest request;

	@GetMapping(value = "/timerange", produces = MediaType.APPLICATION_JSON_VALUE)
	public LocationList locationBytiemrange(@RequestParam String start, @RequestParam String end, Principal principal) {

		return locationService.getLocationBytiemrange(start, end, principal.getName());
	}

}
