import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void testNextDayCalculator1() {
        int date = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-1-2018";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator2() {
        int date = 31;
        int month = 1;
        int year = 2018;
        String expected = "1-2-2018";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator2_2() {
        int date = 15;
        int month = 1;
        int year = 2018;
        String expected = "16-1-2018";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator3() {
        int date = 30;
        int month = 4;
        int year = 2018;
        String expected = "1-5-2018";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator4() {
        int date = 28;
        int month = 2;
        int year = 2018;
        String expected = "1-3-2018";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator4_2() {
        int date = 12;
        int month = 2;
        int year = 2018;
        String expected = "13-2-2018";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator5() {
        int date = 29;
        int month = 2;
        int year = 2020;
        String expected = "1-3-2020";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator6() {
        int date = 31;
        int month = 12;
        int year = 2018;
        String expected = "1-1-2019";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }

    @Test
    void testNextDayCalculator6_2() {
        int date = 11;
        int month = 12;
        int year = 2018;
        String expected = "12-12-2018";

        String result = NextDayCalculator.nextDayCalculator(date, month, year);
        assertEquals(result, expected);
    }
}