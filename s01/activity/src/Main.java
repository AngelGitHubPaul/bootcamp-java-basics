import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        double firstSubject;
        double secondSubject;
        double thirdSubject;
        Scanner userInput = new Scanner(System.in);

        System.out.println("First Name:");
        firstName = userInput.nextLine();
        System.out.println(firstName);

        System.out.println("Last Name:");
        lastName = userInput.nextLine();
        System.out.println(lastName);

        System.out.println("First Subject Grade:");
        firstSubject = userInput.nextDouble();
        System.out.println(firstSubject);

        System.out.println("Second Subject Grade:");
        secondSubject = userInput.nextDouble();
        System.out.println(secondSubject);

        System.out.println("Third Subject Grade:");
        thirdSubject = userInput.nextDouble();
        System.out.println(thirdSubject);

        double average = (firstSubject + secondSubject + thirdSubject)/3;

        System.out.println("Good day, " + firstName + lastName);
        System.out.println("Your grade average is: " + average);
    }
}