
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Enter USD ");
        double USD = scaner.nextDouble();
        double VND = rate * USD;

        System.out.println("VND = " + VND);
    }
}
