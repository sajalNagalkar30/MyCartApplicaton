package com.example.mycartapplicaton;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("Vegetables.php")
    abstract public Call<Food> getFoods();


    @GET("Offers.json")
    abstract public Call<Food> getOfferssFood();

    @GET("Category.json")
    abstract public Call<Food> getCategoryFood();
}