package DateAndTime;

import java.sql.Date;

public class DemoDate2 {
    private static void gettingDate() {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println(date);
    }

    private static void gettingValueOfDate() {
        String date = "2020-08-18";
        Date date2 = Date.valueOf(date);
        System.out.println(date2);
    }

    public static void main(String... args) {
        gettingDate();
        gettingValueOfDate();
    }
}
