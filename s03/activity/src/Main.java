import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input an Integer whose factorial will be computed");

        Scanner in = new Scanner(System.in);

        try {
            int num = in.nextInt();

            int answer = 1;
            int counter = 1;

            if(num == 0) {
                System.out.println("The factorial of 0 is 1");
            } else if(num < 0) {
                System.out.println("Please enter a positive number");
            } else {
                while(counter <= num) {
                    answer = answer * counter;
                    counter ++;
                }
                System.out.println("The factorial of " + num + " is " + answer);
            }
        } catch(InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }
    }
}