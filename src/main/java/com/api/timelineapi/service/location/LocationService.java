package com.api.timelineapi.service.location;

import java.util.Date;
import java.util.List;

import com.api.timelineapi.models.LocationItem;
import com.api.timelineapi.models.LocationList;
import com.api.timelineapi.models.PointItem;

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
        String resultString;
        if (result == null){
            resultString = "No coordinate found";
        }else{
            resultString = "Coordinates: " + result.getPoint().getCoordinates().toString();
        }
        
		return resultString;
    }

    @Override
    public String getTestString() {
        return "Hello from Location service";
    }

    public LocationList getLocationBytiemrange(String startDate, String endDate, String user) {
        Query query = new Query();
        Date sDate = new Date(Long.parseLong(startDate));
        Date eDate = new Date(Long.parseLong(endDate));
        query.addCriteria(Criteria.where("tst").gte(new Date(Long.parseLong(startDate))).lt(new Date(Long.parseLong(endDate))));
        query.addCriteria(Criteria.where("user").is(user));
        query.fields().include("point");
        List<PointItem> queryResult = mongoTemplate.find(query, PointItem.class);

        LocationList result = new LocationList();
        result.setLocations(queryResult);
        return result;
    }
    
}
