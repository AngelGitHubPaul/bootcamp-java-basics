package com.zuitt.example;

public class Animal {
    // Inheritance can be defined as the process where one class acquires the properties and methods of another class

    // animal class - this will be parent class

    // properties
    private String name;
    private String color;

    // constructors


    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // method
    public void printDetails() {
        System.out.println("Print Animal Details:");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}
