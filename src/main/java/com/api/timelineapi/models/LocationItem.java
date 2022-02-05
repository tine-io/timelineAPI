package com.api.timelineapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document("locations")
public class LocationItem {
    @Id private String id;
    private String _type;
    private String BSSID;
    private String SSID;
    private int acc;
    private int alt;
    private int batt;
    private int bs;
    private String conn;
    private LocalDateTime created_at;
    private String[] inregions;
    private String tid;
    private int tst;
    private int vac;
    private int vel;
    private String user;
    private String tracker;
    private GeoJsonPoint point;

    public LocationItem(
            final String _type,
            final String BSSID,
            final String SSID,
            final int acc,
            final int alt,
            final int batt,
            final int bs,
            final String conn,
            final LocalDateTime created_at,
            final String[] inregions,
            final String tid,
            final int tst,
            final int vac,
            final int vel,
            final String user,
            final String tracker,
            final GeoJsonPoint point) {

               this._type = _type;
               this.BSSID = BSSID;
                 this.SSID = SSID;
                  this.acc = acc;
                  this.alt = alt;
                  this.batt = batt;
                  this.bs = bs;
                  this.conn = conn;
                  this.created_at = created_at;
                  this.inregions = inregions;
                  this.tid = tid;
                  this.tst = tst;
                  this.vac = vac;
                  this.vel = vel;
                  this.user = user;
                  this.tracker = tracker;
                  this.point = point;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public String getBSSID() {
        return BSSID;
    }

    public void setBSSID(String bSSID) {
        BSSID = bSSID;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String sSID) {
        SSID = sSID;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getBatt() {
        return batt;
    }

    public void setBatt(int batt) {
        this.batt = batt;
    }

    public int getBs() {
        return bs;
    }

    public void setBs(int bs) {
        this.bs = bs;
    }

    public String getConn() {
        return conn;
    }

    public void setConn(String conn) {
        this.conn = conn;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public String[] getInregions() {
        return inregions;
    }

    public void setInregions(String[] inregions) {
        this.inregions = inregions;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public int getTst() {
        return tst;
    }

    public void setTst(int tst) {
        this.tst = tst;
    }

    public int getVac() {
        return vac;
    }

    public void setVac(int vac) {
        this.vac = vac;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTracker() {
        return tracker;
    }

    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    public GeoJsonPoint getPoint() {
        return point;
    }

    public void setPoint(GeoJsonPoint point) {
        this.point = point;
    }
}
