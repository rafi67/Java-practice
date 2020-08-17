package DateAndTime;

import java.time.LocalDate;
import java.time.Year;

public class DemoYear {
    private static void gettingYear() {
        Year year = Year.now();
        System.out.println(year);
    }

    private static void gettingDay() {
        Year year = Year.of(2017);
        LocalDate l = year.atDay(123);
        System.out.println(l);
    }

    private static void gettingLength() {
        Year year = Year.of(2017);
        System.out.println(year.length());
    }

    private static void gettingLeapYear() {
        Year year = Year.now();
        System.out.println(year.isLeap());
    }

    public static void main(String... args) {
        gettingYear();
        gettingDay();
        gettingLength();
        gettingLeapYear();
    }
}
