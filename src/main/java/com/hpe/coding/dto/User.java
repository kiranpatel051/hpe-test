package com.hpe.coding.dto;

import com.google.gson.annotations.SerializedName;

public class User implements Comparable<User>
{
    @SerializedName(value = "Name")
    private String name;
    @SerializedName(value = "Age")
    private Integer age;
    @SerializedName(value = "Latitude")
    private Double latitude;
    @SerializedName(value = "Longitude")
    private Double longitude;
    @SerializedName(value = "Center")
    private String center;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", center='" + center + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return o.getAge() - this.getAge();
    }
}
