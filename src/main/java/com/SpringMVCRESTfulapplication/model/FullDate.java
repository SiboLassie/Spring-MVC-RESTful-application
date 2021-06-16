package com.SpringMVCRESTfulapplication.model;

import java.util.List;

public class FullDate {

    private int gy;
    private int gm;
    private int gd;
    private boolean afterSunset;
    private int hy;
    private String hm;
    private int hd;
    private String hebrew;
    private List<String> events;

    public FullDate(int gy, int gm, int gd, boolean afterSunset, int hy, String hm, int hd, String hebrew, List<String> events) {
        this.gy = gy;
        this.gm = gm;
        this.gd = gd;
        this.afterSunset = afterSunset;
        this.hy = hy;
        this.hm = hm;
        this.hd = hd;
        this.hebrew = hebrew;
        this.events = events;
    }

    public int getGy() {
        return gy;
    }

    public void setGy(int gy) {
        this.gy = gy;
    }

    public int getGm() {
        return gm;
    }

    public void setGm(int gm) {
        this.gm = gm;
    }

    public int getGd() {
        return gd;
    }

    public void setGd(int gd) {
        this.gd = gd;
    }

    public boolean isAfterSunset() {
        return afterSunset;
    }

    public void setAfterSunset(boolean afterSunset) {
        this.afterSunset = afterSunset;
    }

    public int getHy() {
        return hy;
    }

    public void setHy(int hy) {
        this.hy = hy;
    }

    public String getHm() {
        return hm;
    }

    public void setHm(String hm) {
        this.hm = hm;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getHebrew() {
        return hebrew;
    }

    public void setHebrew(String hebrew) {
        this.hebrew = hebrew;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "FullDate{" +
                "gy=" + gy +
                ", gm=" + gm +
                ", gd=" + gd +
                ", afterSunset=" + afterSunset +
                ", hy=" + hy +
                ", hm='" + hm + '\'' +
                ", hd=" + hd +
                ", hebrew='" + hebrew + '\'' +
                ", events=" + events +
                '}';
    }
}

