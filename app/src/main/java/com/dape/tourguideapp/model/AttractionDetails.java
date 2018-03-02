package com.dape.tourguideapp.model;

/**
 * Created by Danale on 27/02/2018.
 */

public class AttractionDetails {
    private String name;
    private String address;

    public AttractionDetails() {
    }

    public AttractionDetails(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
