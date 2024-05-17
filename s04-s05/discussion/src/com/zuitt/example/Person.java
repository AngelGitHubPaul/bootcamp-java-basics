package com.zuitt.example;

// "implements" keyword is used to indicate that a class is going to implement an interface
public class Person implements Actions {

    // @Override is annotation that indicates that we are implementing a method on an interface
    @Override
    public void sleep() {
        System.out.println("Person is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Person is running");
    }
}
