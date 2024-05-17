package com.zuitt.example;

// "extends" keyword is used to indicate that one class is inheriting from another class
public class Dog extends Animal {
    // Dog class - this is the child class that inherits from Animal Class

    private String breed;

    public Dog() {
        // "super" keyword is used to call the constructor if the parent class from within the constructor of a child
        super();
        this.breed = "Chihuahua";
    }

    public Dog(String name, String color, String breed) {
        super(name, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // method
    public void speak() {
        super.printDetails();
        System.out.println("Bark");
    }

    // Polymorphism is the ability of an object to take on many forms.
    // Dynamic or Run-time Polymorphism
    public void walk(){
        System.out.println("The dog is walking.");
    }
}
