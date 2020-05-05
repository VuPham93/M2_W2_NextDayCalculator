public class NextDayCalculator {
    public static String nextDayCalculator(int date, int month, int year) {
        if (month != 12)
            return jumpToNextMonth(date, month, year);
        else
            return jumpToNextYear(date, month, year);
    }

    private static String jumpToNextMonth(int date, int month, int year) {
        if (date == 30 || date == 31 || date == 28 || date == 29) {
            date = 1;
            month += 1;
        }
        else {
            date += 1;
        }
        return date + "-" + month + "-" + year;
    }

    private static String jumpToNextYear(int date, int month, int year) {
        if (date == 31) {
            date = 1;
            month = 1;
            year += 1;
        }
        else {
            date += 1;
        }
        return date + "-" + month + "-" + year;
    }
}
