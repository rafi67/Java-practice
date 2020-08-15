package DateAndTime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayDemo {
    private static void monthDay() {
        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(1997);
        System.out.println(date);
    }

    private static void testMonthValid() {
        MonthDay month = MonthDay.now();
        boolean b = month.isValidYear(2020);
        System.out.println(b);
    }

    private static void gettingMonth() {
        MonthDay month = MonthDay.now();
        long n = month.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(n);
    }

    private static void dayMonthRange() {
        MonthDay month = MonthDay.now();
        ValueRange n = month.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(n);
        ValueRange n2 = month.range(ChronoField.DAY_OF_MONTH);
        System.out.println(n2);
    }

    public static void main(String[]args) {
        monthDay();
        testMonthValid();
        gettingMonth();
        dayMonthRange();
    }
}
