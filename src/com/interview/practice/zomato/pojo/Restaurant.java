package com.interview.practice.zomato.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private final UUID restaurantId;
    private String restaurantName;
    private String address;
    private Cuisine cuisine;
    private Ratings rating;
    private List<MenuItem> menuItems;

    public Restaurant(String restaurantName, String address, Cuisine cuisine) {
        this.restaurantId = UUID.randomUUID();
        this.restaurantName = restaurantName;
        this.address = address;
        this.rating = Ratings.ONE_STAR;
        this.cuisine = cuisine;
        this.menuItems = new ArrayList<>();
    }

    public UUID getRestaurantId() {
        return restaurantId;
    }

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

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public Ratings getRating() {
        return rating;
    }

    public void setRating(Ratings rating) {
        this.rating = rating;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", name='" + restaurantName + '\'' +
                ", address='" + address + '\'' +
                ", cuisine=" + cuisine +
                ", rating=" + rating +
                ", menuItems=" + menuItems +
                '}';
    }
}
