package session3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    public static void validate() {
        try {
            int age = inputAge();
            if (age < 18) {
                throw new ArithmeticException("your age not validate");
            } else {
                System.out.println("Your age is validate");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input age not valid!!!");
        }
    }

    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age: ");
        int age = scanner.nextInt();
        return age;
    }
}





