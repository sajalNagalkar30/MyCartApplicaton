package com.example.mycartapplicaton;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Food {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Vegetables_count")
    @Expose
    private Integer vegetablesCount;
    @SerializedName("Vegetables")
    @Expose
    private List<GeneralFood> vegetables = null;

    @SerializedName("Fruits_count")
    @Expose
    private Integer fruitsCount;
    @SerializedName("Fruits")
    @Expose
    private List<GeneralFood> fruits = null;

    @SerializedName("Spices_count")
    @Expose
    private Integer spicesCount;
    @SerializedName("Spices")
    @Expose
    private List<GeneralFood> spices = null;

    @SerializedName("Grains_count")
    @Expose
    private Integer grainsCount;
    @SerializedName("Grains")
    @Expose
    private List<GeneralFood> grains = null;





    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getVegetablesCount() {
        return vegetablesCount;
    }

    public void setVegetablesCount(Integer vegetablesCount) {
        this.vegetablesCount = vegetablesCount;
    }

    public List<GeneralFood> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<GeneralFood> vegetables) {
        this.vegetables = vegetables;
    }

    public Integer getFruitsCount() {
        return fruitsCount;
    }

    public void setFruitsCount(Integer fruitsCount) {
        this.fruitsCount = fruitsCount;
    }

    public List<GeneralFood> getFruits() {
        return fruits;
    }

    public void setFruits(List<GeneralFood> fruits) {
        this.fruits = fruits;
    }


    public Integer getSpicesCount() {
        return spicesCount;
    }

    public void setSpicesCount(Integer spicesCount) {
        this.spicesCount = spicesCount;
    }

    public List<GeneralFood> getSpices() {
        return spices;
    }

    public void setSpices(List<GeneralFood> spices) {
        this.spices = spices;
    }

    public Integer getGrainsCount() {
        return grainsCount;
    }

    public void setGrainsCount(Integer grainsCount) {
        this.grainsCount = grainsCount;
    }

    public List<GeneralFood> getGrains() {
        return grains;
    }

    public void setGrains(List<GeneralFood> grains) {
        this.grains = grains;
    }






}

  