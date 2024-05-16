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
    }
}
