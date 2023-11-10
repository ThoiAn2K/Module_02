import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test

    @Test
    void testfindNextDate() {
       LocalDate currentDate = NextDayCalculator.findNextDay(1,1,2018);
       LocalDate expectedNextDay = LocalDate.of(2018,1,2);
       assertEquals(expectedNextDay,currentDate);
    }
}