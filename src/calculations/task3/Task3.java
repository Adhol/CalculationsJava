package calculations.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter number of rows: ");
            int numberOfRows = in.nextInt();
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(0);
                }
                System.out.println();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct number of rows, try again...");
        }
    }
}
