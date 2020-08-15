package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DemoLocalDateTime {
    private static void datetimeFormatter() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formateDateTime = ldt.format(formatter);
        System.out.println(formateDateTime);
    }

    private static void datetimedetails() {
        LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 30);
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
    }

    public static void main(String[]args) {
        datetimeFormatter();
        datetimedetails();
    }
}
