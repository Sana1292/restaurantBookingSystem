package com.interview.practice.zomato.criteria;

import com.interview.practice.zomato.pojo.Cuisine;
import com.interview.practice.zomato.pojo.Ratings;

public class RestaurantSearchCriteria {

    private String restaurantName;
    private String address;
    private Cuisine cuisine;
    private Ratings rating;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cuisine getCusine() {
        return cuisine;
    }

    public void setCusine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public Ratings getRating() {
        return rating;
    }

    public void setRating(Ratings rating) {
        this.rating = rating;
    }

    public RestaurantSearchCriteria(String restaurantName, String address, Cuisine cuisine, Ratings rating) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.cuisine = cuisine;
        this.rating = rating;
    }
}
