package com.zuitt;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year; // You can change this to test different years
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input year to be checked if leap year");
        year = userInput.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
