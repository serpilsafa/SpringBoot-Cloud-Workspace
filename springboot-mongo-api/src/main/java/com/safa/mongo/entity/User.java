package com.safa.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
public class User {
    @Id
    private String id;
    private String name;
    private String lastName;
    private HashMap features;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap getFeature() {
        return features;
    }

    public void setFeature(HashMap features) {
        this.features = features;
    }
}
