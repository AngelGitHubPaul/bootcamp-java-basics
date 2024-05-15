package com.zuitt.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // Exception is a problem that arises during the execution of a program. It disrupts the normal flow of the program and terminates it abnormally

            // Scanner input =  new Scanner(System.in);
            // System.out.println("Input a number:");

            // int num = input.nextInt();
            // System.out.println("The number you entered is: " + num);

        // Exception handling refers to managing and catching run-time errors in order to safely run your code.
        Scanner input =  new Scanner(System.in);
        System.out.println("Input a number:");

        try {
            int num = input.nextInt();
            System.out.println("The number you entered is: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a value number.");
            input.next();
        } finally {
            System.out.println("Thank you!");
        }

    }
}
