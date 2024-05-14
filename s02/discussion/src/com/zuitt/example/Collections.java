package com.zuitt.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        // Arrays
        // Fixed-size collection of elements

        // Declaration
        // dataType[] arrayName = new dataType[size];

        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));

        // Declaration with Initialization
        int[] intArray2 = {100, 200, 300, 400, 500};
        System.out.println(Arrays.toString(intArray2));

        System.out.println(intArray2[2]);

        // Multidimensional Arrays
        // A two-dimensional array then, can be described by two lengths nested within each other, like a matrix.
        // The first length can be called rows, then the second nested length can be cols.

        // dataType[][] arrayName = new dataTypep[][];
        String[][] classroom = new String[3][3];
        // first row
        classroom[0][0] = "Athos";
        classroom[0][1] = "Porthos";
        classroom[0][2] = "Aramis";
        // second row
        classroom[1][0] = "Brandon";
        classroom[1][1] = "JunJun";
        classroom[1][2] = "Robert";
        // third row
        classroom[2][0] = "Mickey";
        classroom[2][1] = "Donald";
        classroom[2][2] = "Goofy";

        System.out.println(Arrays.toString(classroom));
        System.out.println(Arrays.deepToString(classroom));

        System.out.println(classroom[2][1]);

        // ArrayLists are resizable arrays, wherein elements can be added or removed whenever it is needed.

        // Declaration
        // ArrayList<dataType> arrayName = new ArrayList<dataType>();

        ArrayList<String> students = new ArrayList<>();

        // Adding elements to an ArrayList
        students.add("John");
        students.add("Jane");
        students.add("Joe");

        System.out.println(students);

        // Getting the number of elements in an ArrayList
        System.out.println(students.size());

        // Accessing elements in an ArrayList
        System.out.println(students.get(1));

        // Updating elements in an ArrayList
        // 1 - index you want to update
        // "George" - new value
        students.set(1, "George");

        System.out.println(students);

        // Remove elements in an ArrayList
        students.remove(1);
        System.out.println(students);
        System.out.println(students.get(1));

        // Removing all elements in an ArrayList
        students.clear();
        System.out.println(students);

        // HashMaps
        // HashMaps stores values as key-value pairs, wherein the values are accessed by the keys.
        // HashMaps are stored by specifying the data type of the key and of the value.

        // Declaration
        // HashMaps<dataType, dataType> hashMapName = new HashMap<dataType, dataType>();

        HashMap<String, String> job_position  = new HashMap<String, String>();

        // Adding elements
        job_position.put("Supervisor", "Natasha Romanoff");
        job_position.put("Doctor", "Stephen Strange");
        job_position.put("Manager", "Tony Stark");

        System.out.println(job_position);

        // Accessing elements in HashMap
        System.out.println(job_position.get("Supervisor"));

        // Getting the keys of elements
        System.out.println(job_position.keySet());

        // Removing elements in HashMap
        job_position.remove("Supervisor");
        System.out.println(job_position);
        System.out.println(job_position.get("Supervisor"));

    }
}
