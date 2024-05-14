package com.zuitt.example;

public class ControlStructs {
    public static void main(String[] args) {
        // Operators
        // Operators allow us to manipulate the values that we store in variables

        // Type of Operators:
        // Arithmetic
        // +, - , *, /, %
        // Comparison
        // >, <, >=, <=, ==, !=
        // Logical
        // &&, ||, !
        // Assignment
        // =

        // If statements
        // If statement manipulate the flow of the code depending on the evaluation of logic expressions.
        // If the condition is true, then the code will proceed to do what is inside the if statement

        int num = 0;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Short Circuiting
        // Short-circuiting is a technique applicable only to the AND and OR operators wherein if-statements or other control structures can exit early by ensuring either safety of operation or efficiency

        int age = 17;
        boolean isCitizen = true;

        int legalAge = 18;

        if (isCitizen && age >= legalAge) {
            System.out.println("The person is eligible to vote");
        } else {
            System.out.println("The person is NOT eligible to vote");
        }

        // Switch Case
        // Switch statements are particularly useful when dealing with small discrete (finite) sets of values

        int directionValue = 1;

        switch(directionValue) {
            case 5:
                System.out.println("North");
                break;
            case 2:
                System.out.println("South");
                break;
            case 3:
                System.out.println("East");
                break;
            case 4:
                System.out.println("West");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
