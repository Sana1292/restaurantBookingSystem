package com.interview.practice.zomato.pojo;

import java.util.UUID;

public class OrderItem {

    private final UUID orderItemId;
    private String orderItemName;
    private float price;
    private int orderItemQuantity;

    public OrderItem(String orderItemName, float price) {
        this.orderItemId = UUID.randomUUID();
        this.orderItemName = orderItemName;
        this.price = price;
        this.orderItemQuantity = 1;
    }

    public UUID getOrderItemId() {
        return orderItemId;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(int orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", orderItemName='" + orderItemName + '\'' +
                ", price=" + price +
                ", orderItemQuantity=" + orderItemQuantity +
                '}';
    }
}
