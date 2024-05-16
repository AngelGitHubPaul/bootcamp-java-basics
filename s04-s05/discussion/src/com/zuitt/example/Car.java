package com.zuitt.example;

public class Car {

    // Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
    // The variables of a class will be hidden from other classes and can be accessed only through getters and setters (data hiding)
    // Encapsulation is achieved by declaration variables of classes as private by adding getters and setters

    // properties
    // characteristics or attributes that describe the object or state of an object
    private String name;
    private String brand;
    private int yearOfMake;

    private Driver driver;

    // Constructors
        // are used to initialize a new object of a class

    // empty constructor
    public Car() {
        this.driver = new Driver("Alejandro");
    }

    // parameterized constructor
    public Car(String name, String brand, int yearOfMake) {
        // "this" keyword refers to the current object
        this.name = name;
        this.brand = brand;
        this.yearOfMake = yearOfMake;
    }

    // getters and setters
    // getter method is a function within a class that retrieves the value of a private field
    public String getName() {
      return name;
    };

    // setter method is a function within a class that modifies the value of private field
    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    // method
    public String getDriverName(){
        return this.driver.getName();
    }
        // function within an instance or object
    public void drive() {
        System.out.println("The car is running.");
    }
}