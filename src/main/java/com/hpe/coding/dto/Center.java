package com.hpe.coding.dto;

import com.google.gson.annotations.SerializedName;

public class Center
{
    @SerializedName(value = "Name")
    private String name;
    @SerializedName(value = "Latitude")
    private Double latitude;
    @SerializedName(value = "Longitude")
    private Double longitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Center{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
