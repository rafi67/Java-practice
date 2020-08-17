package DateAndTime;

import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DemoYearMonth {
    private static void gettingYearMonth() {
        YearMonth ym = YearMonth.now();
        System.out.println(ym);
    }

    private static void gettingFormattedYearMonth() {
        YearMonth ym = YearMonth.now();
        String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(s);
    }

    private static void gettingMonthOfYear() {
        YearMonth ym = YearMonth.now();
        long l1 = ym.get(ChronoField.YEAR);
        System.out.println(l1);
        long l2 = ym.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(l2);
    }

    private static void gettingPlusYear() {
        YearMonth ym = YearMonth.now();
        YearMonth ym2 = ym.plus(Period.ofYears(2));
        System.out.println(ym2);
    }

    private static void gettingMinusYear() {
        YearMonth ym = YearMonth.now();
        YearMonth ym2 = ym.minus(Period.ofYears(2));
        System.out.println(ym2);
    }

    public static void main(String... args) {
        gettingYearMonth();
        gettingFormattedYearMonth();
        gettingMonthOfYear();
        gettingPlusYear();
        gettingMinusYear();
    }
}
