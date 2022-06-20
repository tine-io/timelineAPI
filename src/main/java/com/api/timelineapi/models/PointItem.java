package com.api.timelineapi.models;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("locations")
public class PointItem{
    private GeoJsonPoint point;

    public PointItem(GeoJsonPoint point){
        this.point = point;
    }
    public GeoJsonPoint getPoint() {
        return point;
    }

    public void setPoint(GeoJsonPoint point) {
        this.point = point;
    }
}