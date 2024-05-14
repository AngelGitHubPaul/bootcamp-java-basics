package com.zuitt;

import java.util.ArrayList;
import java.util.HashMap;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] primeNumbers = new int[5];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 6;
        primeNumbers[4] = 11;

        System.out.println("The first prime number is: " + primeNumbers[0]);

        ArrayList<String> friends = new ArrayList<>();
        friends.add("John");
        friends.add("Jane");
        friends.add("Zoey");
        friends.add("Chloe");

        System.out.println("My friends are: " + friends);

        HashMap<String, Integer> inventory  = new HashMap<String, Integer>();
        inventory.put("toothpaste", 15);
        inventory.put("toothbrush", 20);
        inventory.put("soap", 12);

        System.out.println("Our current inventory consists of: " + inventory);


    }
}
