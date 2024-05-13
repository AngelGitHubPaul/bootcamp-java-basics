package com.zuitt.example;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How old are you?");

        int age = userInput.nextInt();
        System.out.println(age);

        System.out.println("What is your average?");
        double average = userInput.nextDouble();
        System.out.println(average);
    }
}
