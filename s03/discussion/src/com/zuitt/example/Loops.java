package com.zuitt.example;

public class Loops {
    public static void main(String[] args) {
        // Loops are control structures that allow code blocks to be executed multiple times
            // Types of Loops:
            // For Loop
            // While Loop
            // Do-while Loop

        // For Loop
        for(int i = 0; i < 10; i++) {
            System.out.println("Current count: " + i);
        }

        int[] intArray = {100, 200, 300, 400, 500};
        System.out.println(intArray[0]);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Foreach/ Enhanced For Loop
        String[] nameArray = {"John", "Paul", "George", "Ringo"};

        for(String name : nameArray) {
            System.out.println(name);
        }

        // Nested For Loop
        // For loops can also be nested together, which can be useful when traversing multidimensional arrays and similar data structures.

        String[][] classroom = new String[3][3];
        //First row
        classroom[0][0] = "Athos";
        classroom[0][1] = "Porthos";
        classroom[0][2] = "Aramis";
        //Second row
        classroom[1][0] = "Brandon";
        classroom[1][1] = "JunJun";
        classroom[1][2] = "Jobert";
        //Third row
        classroom[2][0] = "Mickey";
        classroom[2][1] = "Donald";
        classroom[2][2] = "Goofy";

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.println(classroom[row][col]);
            }
        }

        // While loops, similar to for loops, allow for repetitive execution of code. However, they are typically used in situations where the number of iterations is indefinite or unknown beforehand.

        int x = 0;

        while(x < 10) {
            System.out.println("Loop number: " + x);
            x++;
        }

        // Do-while Loops are similar to while loops however, do-while loops will always execute at least once

        int y = 10;

        do {
            System.out.println("Countdown: " + y);
            y--;
        } while (y > 10);

    }

}
