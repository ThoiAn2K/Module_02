import java.time.LocalDate;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Date: ");
        int day = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();

        LocalDate nextDay = NextDayCalculator.findNextDay(day, month, year);


        System.out.println("Next Date: " + nextDay.getDayOfMonth() + "/"
                + nextDay.getMonthValue() + "/" + nextDay.getYear());

        scanner.close();
    }
}
