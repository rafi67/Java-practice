package DateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DemoGetCurrentDateTime {
    private static void gettingCurrentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm:ss");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(dtf.format(date));
    }

    private static void gettingDateTimeBySimpleFormat() {
        SimpleDateFormat date = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
        Date date1 = new Date();
        System.out.println(date.format(date1));
    }

    private static void gettingDateMillis() {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println(date);
    }

    private static void gettingDateSql() {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
    }

    private static void gettingCalendarDate() {
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
    }

    public static void main(String... args) {
        gettingCurrentDateTime();
        gettingDateTimeBySimpleFormat();
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(java.time.Clock.systemUTC().instant());
        gettingDateMillis();
        gettingDateSql();
        gettingCalendarDate();
    }
}
