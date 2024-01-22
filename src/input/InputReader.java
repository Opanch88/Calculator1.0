package input;

import java.util.Scanner;

public class InputReader implements AutoCloseable {
    private final Scanner scanner;

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    public int getOperationType() {
        while (true) {
            try {
                System.out.println("Choose operation type:");
                System.out.println("1. Regular numbers");
                System.out.println("2. Complex numbers");
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                scanner.nextLine();
            }
        }
    }

    public double getOperand(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input error. Please enter a number again.");
                scanner.nextLine();
            }
        }
    }

    public int getComplexOperationChoice() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid complex operation.");
                scanner.nextLine();
            }
        }
    }

    public int getOperationChoice() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid operation.");
                scanner.nextLine();
            }
        }
    }

    @Override
    public void close() {
        scanner.close();
    }
}
