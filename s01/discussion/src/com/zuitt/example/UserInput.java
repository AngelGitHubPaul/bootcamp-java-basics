package com.zuitt.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Create a scanner object
        // Scanner class is used to get user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username:");

        // Read user input
        // nextLine() is a method in Java Scanner class that returns a line of text that is read from the scanner object
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
