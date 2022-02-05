
package com.api.timelineapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * ActivityItem
 */
@Document("locations")
public class ActivityItem {

    @Id
    private String id;
    private String timestampMs;
    private String source;
    private int latitudeE7;
    private int longitudeE7;
    private int accuracy;
    private int deviceTag;

    public ActivityItem(String id, String timestampMs, String source, int latitudeE7,
                int longitudeE7, int accuracy, int deviceTag) {
                    super();
                    this.id = id;
                    this.timestampMs = timestampMs;
                    this.source = source;
                    this.latitudeE7 = latitudeE7;
                    this.longitudeE7 = longitudeE7;
                    this.accuracy = accuracy;
                    this.deviceTag = deviceTag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestampMs() {
        return timestampMs;
    }

    public void setTimestampMs(String timestampMs) {
        this.timestampMs = timestampMs;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getLatitudeE7() {
        return latitudeE7;
    }

    public void setLatitudeE7(int latitudeE7) {
        this.latitudeE7 = latitudeE7;
    }

    public int getLongitudeE7() {
        return longitudeE7;
    }

    public void setLongitudeE7(int longitudeE7) {
        this.longitudeE7 = longitudeE7;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(int deviceTag) {
        this.deviceTag = deviceTag;
    }
}