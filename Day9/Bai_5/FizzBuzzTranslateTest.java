import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();

    @Test
    public void testFizzBuzzTranslate() {
        assertEquals("mot", fizzBuzzTranslate.translate(1));
    }
    @Test
    public void testFizzBuzzTranslate1() {
        assertEquals("Fizz", fizzBuzzTranslate.translate(3));
    }
    @Test
    public void testFizzBuzzTranslate2() {
        assertEquals("Buzz", fizzBuzzTranslate.translate(5));
    }
    @Test
    public void testFizzBuzzTranslate3() {
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(15));
    }
    @Test
    public void testFizzBuzzTranslate4() {
        assertEquals("hai", fizzBuzzTranslate.translate(2));
    }

    @Test
    public void testFizzBuzzTranslate5() {
        assertEquals("Fizz", fizzBuzzTranslate.translate(23));
    }
    @Test
    public void testFizzBuzzTranslate6() {
        assertEquals("hai muoi sau", fizzBuzzTranslate.translate(26));
    }
}