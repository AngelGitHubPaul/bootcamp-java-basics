package com.zuitt.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Encapsulation");

        Car myCar = new Car();
        myCar.setName("Ford Raptor");

        System.out.println(myCar.getName());

        // parameterized constructor
        Car myNewCar = new Car("Mustang", "Ford", 2020);
        System.out.println(myNewCar.getName());
        System.out.println(myNewCar.getBrand());
        System.out.println(myNewCar.getYearOfMake());

        myNewCar.drive();

        System.out.println("Composition:");
        System.out.println("This car is driven by " + myCar.getDriverName());

        System.out.println("Inheritance (Parent Class):");
        Animal myAnimal = new Animal("Dog", "white");

        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getColor());

        myAnimal.printDetails();

        System.out.println("Inheritance (Child Class");
        Dog myPet = new Dog();

        myPet.printDetails();

        myPet.setName("Buddy");
        myPet.setColor("Brown");
        myPet.setBreed("Poodle");

        myPet.printDetails();

        System.out.println(myPet.getBreed());

        myPet.speak();

        System.out.println("Abstract: ");
        Person newPerson = new Person();
        newPerson.run();
        newPerson.sleep();

        Computer newComputer = new Computer();
        newComputer.run();
        newComputer.sleep();

        System.out.println("Static Polymorphism:");

        StaticPoly poly = new StaticPoly();
        // Sum of two integer
        int result1 = poly.add(5,3);
        System.out.println("Sum of Two integer: " + result1);

        // Sum of three integer
        int result2 = poly.add(5,6,3);
        System.out.println("Sum of three integer: " + result2);

        // Sum of Two Double
        double result3 = poly.add(5.5,5.5);
        System.out.println("Sum of two double: " + result3);

        System.out.println("Dynamic Polymorphism:");
        myAnimal.walk();
        myPet.walk();
    }
}
