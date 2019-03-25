package calculations.task14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number 1:");
            double number1 = scanner.nextDouble();
            System.out.println("Enter number 2:");
            double number2 = scanner.nextDouble();

            System.out.println(number1 + number2);
            System.out.println(number1 * number2);


        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct number");
        }
    }
}
