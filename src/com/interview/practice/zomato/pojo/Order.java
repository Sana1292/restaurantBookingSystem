package com.interview.practice.zomato.pojo;

import java.time.LocalDateTime;
import java.util.*;

public class Order {

    private final UUID orderId;
    private Customer customer;
    private LocalDateTime orderPlaced;
    private LocalDateTime orderDelivered;
    private OrderStatus status;
    private Payment payment;
    private List<OrderItem> orderItems;

    public Order(Customer customer, List<OrderItem> orderItems, Payment payment) {
        this.orderId = UUID.randomUUID();
        this.customer = customer;
        this.orderPlaced = LocalDateTime.now();
        this.status = OrderStatus.PLACED;
        this.orderItems = orderItems != null ? orderItems : new ArrayList<>();
        this.payment = payment;
    }

    // Getters and Setters

    public UUID getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(LocalDateTime orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public LocalDateTime getOrderDelivered() {
        return orderDelivered;
    }

    public void setOrderDelivered(LocalDateTime orderDelivered) {
        this.orderDelivered = orderDelivered;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", orderPlaced=" + orderPlaced +
                ", orderDelivered=" + orderDelivered +
                ", status=" + status +
                ", payment=" + payment +
                ", orderItems=" + orderItems +
                '}';
    }
}
