package com.zuitt.example;

public class StaticPoly {
    // Polymorphism is the ability of an object to take on many forms.

    // Static or compile-time polymorphism

    public int add(int a, int b) {
        return a+b;
    }

    //overloading by changing the number of arguments
    public int add(int a, int b, int c) {
        return a+b+c;
    }

    // overloading by changing data type
    public double add(double a, double b) {
        return a+b;
    }
}
