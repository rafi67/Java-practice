package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class DemoMonthEnum {
    private static void gettingEverySunday() {
        Month month = Month.valueOf("August".toUpperCase());
        System.out.printf("For the month of %s all Sunday are: %n", month);
        LocalDate localDate = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        Month mi = localDate.getMonth();
        while(mi == month){
            System.out.printf("%s%n", localDate);
            localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
            mi = localDate.getMonth();
        }
    }

    private static void gettingMonthValue() {
        Month month = Month.from(LocalDate.now());
        System.out.println(month.getValue());
        System.out.println(month.name());
    }

    private static void gettingMinusMonth() {
        Month month = Month.from(LocalDate.now());
        System.out.println(month.minus(1));
    }

    private static void gettingPlusMonth() {
        Month month = Month.from(LocalDate.now());
        System.out.println(month.plus(1));
    }

    private static void gettingMonthLength() {
        Month month = Month.from(LocalDate.now());
        System.out.println("Total day in this month is "+month.length(true));
    }

    public static void main(String... args) {
        gettingEverySunday();
        gettingMonthValue();
        gettingMinusMonth();
        gettingPlusMonth();
        gettingMonthLength();
    }
}
