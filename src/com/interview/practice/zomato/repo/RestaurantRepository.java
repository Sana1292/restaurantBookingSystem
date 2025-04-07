package com.interview.practice.zomato.repo;

import com.interview.practice.zomato.pojo.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    public List<Restaurant> findAll();
}
