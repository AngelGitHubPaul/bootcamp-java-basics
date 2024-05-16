package com.zuitt.example;

public class Driver {

    // Composition is when a class or object is composed of other objects

    private String name;

    public Driver() {
    }

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
