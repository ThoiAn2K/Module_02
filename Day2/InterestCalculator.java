import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        double interestRate;
        int month;

        System.out.println("Enter money");
        money = scanner.nextDouble();

        System.out.println("Enter interestRate");
        interestRate = scanner.nextDouble();

        System.out.println("Enter month");
        month = scanner.nextInt();

        double totalInterest = 0;
        for ( int i = 0; i < month; i++ ){
            totalInterest += money * (interestRate/100)/12 * month;
        };
        System.out.println(totalInterest);
    }
}
