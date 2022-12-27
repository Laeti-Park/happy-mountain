package com.example.happy_mountain.item;

public class LocationItem {
    private double longitude;
    private double latitude;

    public LocationItem(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
