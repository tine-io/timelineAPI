package com.api.timelineapi.controller.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.api.timelineapi.service.location.LocationService;



@RestController
public class LocationController {

    @Autowired 
    private  LocationService locationService;

	@Autowired 
	private HttpServletRequest request;

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/locationByTimestamp", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> handleCustomersRequest(@RequestParam int timestamp) {
        String item =  locationService.getLocationByTimestamp(timestamp);
        System.out.println(item);
        return Collections.singletonMap("location", item);//"Latitude: " + item.getLatitudeE7() + ", Longitude: " + item.getLongitudeE7());
	}

    @CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/testlocationservice", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> handleCustomersRequest() {
        String item =  locationService.getTestString();
        System.out.println(item);
        return Collections.singletonMap("return", item);//"Latitude: " + item.getLatitudeE7() + ", Longitude: " + item.getLongitudeE7());
	}

}
