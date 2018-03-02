package com.dape.tourguideapp.model;

/**
 * Created by Danale on 26/02/2018.
 */

public class Attraction {
    private String attraction_name;
    private int attraction_image;

    public Attraction() {
    }

    public Attraction(String attraction_name, int attraction_image) {
        this.attraction_name = attraction_name;
        this.attraction_image = attraction_image;
    }

    public String getAttraction_name() {
        return attraction_name;
    }

    public void setAttraction_name(String attraction_name) {
        this.attraction_name = attraction_name;
    }

    public int getAttraction_image() {
        return attraction_image;
    }

    public void setAttraction_image(int attraction_image) {
        this.attraction_image = attraction_image;
    }
}
