package DateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo2 {
    private static void timeZone() {
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
        LocalTime time1 = LocalTime.now(zoneId);
        LocalTime time2 = LocalTime.now(zoneId2);
        long hour = ChronoUnit.HOURS.between(time1, time2);
        long minute = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(hour);
        System.out.println(minute);
    }

    public static void main(String[]args) {
        timeZone();
    }
}
