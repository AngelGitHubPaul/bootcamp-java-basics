package com.zuitt.example;

public class Computer implements Actions {
    @Override
    public void sleep() {
        System.out.println("Computer is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Computer is running");
    }
}
