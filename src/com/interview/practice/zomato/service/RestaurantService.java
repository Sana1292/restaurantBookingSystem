package com.interview.practice.zomato.service;

import com.interview.practice.zomato.criteria.RestaurantSearchCriteria;
import com.interview.practice.zomato.pojo.Restaurant;
import com.interview.practice.zomato.repo.RestaurantRepository;

import java.util.*;

public class RestaurantService {

    RestaurantRepository repository;


    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }

    public List<Restaurant> searchRestaurant(RestaurantSearchCriteria criteria){

        List<Restaurant> restaurants = repository.findAll();

        return restaurants.stream()
                        .filter(hotel->matchCriteria(hotel, criteria))
                .toList();


    }

    private boolean matchCriteria(Restaurant restaurant, RestaurantSearchCriteria criteria) {
        boolean matches = true;

        if (criteria.getRestaurantName() != null && !restaurant.getRestaurantName().contains(criteria.getRestaurantName())) {
            matches = false;
        }

        if (criteria.getCusine() != null && !restaurant.getCuisine().equals(criteria.getCusine())) {
            matches = false;
        }

        if (criteria.getRating() != null && restaurant.getRating() != criteria.getRating()) {
            matches = false;
        }
        return matches;

    }


}
