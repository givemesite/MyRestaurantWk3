package com.epicodus.myrestaurants.models;

import java.util.ArrayList;

/**
 * Created by Guest on 4/25/16.
 */
public class Restaurant {
    private String Name;
    private String Phone;
    private String Website;
    private double Rating;
    private String ImageUrl;
    private ArrayList<String> Address = new ArrayList<>();
    private double Latitude;
    private double Longitude;
    private ArrayList<String> Categories = new ArrayList<>();

    public Restaurant(String name, String phone, String website,
                      double rating, String imageUrl, ArrayList<String> address,
                      double latitude, double longitude, ArrayList<String> categories) {
        this.Name = name;
        this.Phone = phone;
        this.Website = website;
        this.Rating = rating;
        this.ImageUrl = imageUrl;
        this.Address = address;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Categories = categories;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getWebsite() {
        return Website;
    }

    public double getRating() {
        return Rating;
    }

    public String getImageUrl(){
        return ImageUrl;
    }

    public ArrayList<String> getAddress() {
        return Address;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public ArrayList<String> getCategories() {
        return Categories;
    }
}
