package com.api.timelineapi.models;

import java.util.List;

public class LocationList {

    private List<PointItem> locations;
    private boolean success = true;

    public List<PointItem> getLocations() {
        return locations;
    }

    public void setLocations(List<PointItem> locations) {
        this.locations = locations;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}