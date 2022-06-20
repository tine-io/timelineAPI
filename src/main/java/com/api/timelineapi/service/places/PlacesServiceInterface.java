package com.api.timelineapi.service.places;

import java.util.Date;

import org.json.JSONObject;

public interface PlacesServiceInterface {
    public JSONObject  getPlacesByTimeRange(Date startTime, Date endTime);
}
