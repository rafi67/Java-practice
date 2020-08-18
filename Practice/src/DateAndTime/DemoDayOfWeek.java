package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DemoDayOfWeek {
    private static void gettingDayOfWeek() {
        LocalDate localDate = LocalDate.of(2020, Month.AUGUST, 18);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));
    }

    private static void gettingDay() {
        DayOfWeek day = DayOfWeek.of(5);
        System.out.println(day.name());
        System.out.println(day.ordinal());
        System.out.println(day.getValue());
    }

    private static void gettingPlusDay() {
        LocalDate date = LocalDate.of(2020, Month.AUGUST, 18);
        DayOfWeek day = DayOfWeek.from(date);
        System.out.println(day.getValue());
        day = day.plus(1);
        System.out.println(day.getValue());
    }

    private static void gettingMinusDay() {
        LocalDate date = LocalDate.now();
        DayOfWeek day = DayOfWeek.from(date);
        System.out.println(day.getValue());
        day = day.minus(1);
        System.out.println(day.getValue());
    }

    public static void main(String... args) {
        gettingDayOfWeek();
        gettingDay();
        gettingPlusDay();
        gettingMinusDay();
    }
}
