package DateAndTime;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class DemoOffsetTime {
    private static void offsetTime() {
        OffsetTime offset = OffsetTime.now();
        int h = offset.get(ChronoField.HOUR_OF_DAY);
        System.out.println(h);
        int m = offset.get(ChronoField.MINUTE_OF_DAY);
        System.out.println(m);
        int s = offset.get(ChronoField.SECOND_OF_DAY);
        System.out.println(s);
    }

    private static void gettingHour() {
        OffsetTime offset = OffsetTime.now();
        int h = offset.getHour();
        System.out.println(h);
    }

    private static void gettingMinute() {
        OffsetTime offset = OffsetTime.now();
        int m = offset.getMinute();
        System.out.println(m);
    }

    private static void gettingSecond() {
        OffsetTime offset = OffsetTime.now();
        int s = offset.getSecond();
        System.out.println(s);
    }

    public static void main(String[]args) {
        offsetTime();
        gettingHour();
        gettingMinute();
        gettingSecond();
    }
}
