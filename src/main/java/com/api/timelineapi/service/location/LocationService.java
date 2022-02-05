package com.api.timelineapi.service.location;

import java.sql.Timestamp;

import com.api.timelineapi.models.LocationItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class LocationService implements LocationServiceInterface{
    @Autowired 
    MongoTemplate mongoTemplate;

    @Override
    public String getLocationByTimestamp(int timestamp) {
        Query query = new Query();
		query.addCriteria(Criteria.where("tst").is(timestamp));
        LocationItem result = mongoTemplate.findOne(query, LocationItem.class);
		return "Coordinates: " + result.getPoint().getCoordinates().toString();
    }

    @Override
    public String getTestString() {
        return "Hello from Location service";
    }
    
}
