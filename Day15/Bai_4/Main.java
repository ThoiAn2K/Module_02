import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            double side1 = inputSide("Enter side 1: ");
            double side2 = inputSide("Enter side 2: ");
            double side3 = inputSide("Enter side 3: ");

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Triangle is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double inputSide(String message) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(message);
                double side = scanner.nextDouble();
                if (side <= 0) {
                    throw new IllegalArgumentException("Side length must be positive.");
                }
                return side;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. " + e.getMessage());
                scanner.nextLine(); // Clear the input buffer
            }
        }
    }
}