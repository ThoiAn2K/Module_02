import java.time.LocalDate;

public class NextDayCalculator {
    public static LocalDate findNextDay( int day, int month, int year){

            LocalDate currentDate = LocalDate.of(year,month, day);
            return currentDate.plusDays(1);



    }
}
