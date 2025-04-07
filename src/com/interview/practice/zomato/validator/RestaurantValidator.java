package com.interview.practice.zomato.validator;

import com.interview.practice.zomato.pojo.Cuisine;
import com.interview.practice.zomato.pojo.Ratings;

public class RestaurantValidator implements Validator {


    @Override
    public boolean isValidName(String name) {
        return name!=null && !name.trim().isEmpty();
    }

    @Override
    public boolean isValidCuisine(String cuisine) {
        try{
             Cuisine.valueOf(cuisine.toUpperCase());
             return true;
        }
        catch (IllegalArgumentException  | NullPointerException n){
            return false;
        }
    }

    @Override
    public boolean isValidRating(String rating) {
        try{
            Ratings.valueOf(rating.toUpperCase());
            return  true;
        }
        catch (IllegalArgumentException  | NullPointerException n){
            return false;
        }
    }
}
