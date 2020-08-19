package DateAndTime;

import java.util.Date;

public class DemoDate {
    private static void gettingDate() {
        Date date = new Date();
        System.out.println(date);
    }

    private static void gettingDate2() {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println(date);
    }

    public static void main(String... args) {
        gettingDate();
        gettingDate2();
    }
}
