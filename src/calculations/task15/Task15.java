package calculations.task15;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number 1:");
            double number = scanner.nextDouble();


            System.out.println(Math.pow(number, 2));
            System.out.println(Math.pow(number, 3));


        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct number");
        }
    }
}
