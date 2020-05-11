public class NextDayCalculator {
    public static String nextDayCalculator(int date, int month, int year) {
        if (month != 12)
            return jumpToNextMonth(date, month, year);
        else
            return jumpToNextYear(date, month, year);
    }

    private static String jumpToNextMonth(int date, int month, int year) {
        if (date == 30 && !is31Days(month) ||
            date == 31 && is31Days(month) ||
            date == 28 && !isLeapYear(year) ||
            date == 29 && isLeapYear(year)) {
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

    private static boolean isLeapYear(int year) {
        boolean isLeapYearBy4 = year % 4 == 0;
        boolean isLeapYearBy100 = year % 100 == 0;
        boolean isLeapYearBy400 = year % 400 == 0;

        if (isLeapYearBy4) {
            if (isLeapYearBy100) {
                return isLeapYearBy400;
            }
            else {
                return true;
            }
        }
        return false;
    }

    private static boolean is31Days(int month) {
        return switch (month) {
            case 4, 6, 9, 11 -> false;
            default -> true;
        };
    }

}
