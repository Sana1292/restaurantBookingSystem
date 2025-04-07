package com.interview.practice.zomato.pojo;

import java.util.UUID;

public class MenuItem {

    private final UUID menuItemId;
    private String name;
    private String description;
    private float price;
    private Cuisine cuisine;

    public MenuItem(String name, String description, float price, Cuisine cuisine) {
        this.menuItemId = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
        this.cuisine = cuisine;
    }

    public UUID getMenuItemId() {
        return menuItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemId=" + menuItemId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", cuisine=" + cuisine +
                '}';
    }
}
