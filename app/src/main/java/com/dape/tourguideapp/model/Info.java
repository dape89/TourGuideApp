package com.dape.tourguideapp.model;

/**
 * Created by Danale on 26/02/2018.
 */

public class Info {
    private String name_description;
    private String description;

    public Info() {
    }

    public Info(String name_description, String description) {
        this.name_description = name_description;
        this.description = description;

    }

    public String getName_description() {
        return name_description;
    }

    public void setName_description(String name_description) {
        this.name_description = name_description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
