package DateAndTime;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class DemoZoneOffset {
    private static void temporal() {
        ZoneOffset zone = ZoneOffset.UTC;
        Temporal temporal = zone.adjustInto(ZonedDateTime.now());
        System.out.println(temporal);
    }

    private static void gettingHours() {
        ZoneOffset zone = ZoneOffset.ofHours(5);
        System.out.println(zone);
    }

    private static void gettingHoursMinutes() {
        ZoneOffset zone = ZoneOffset.ofHoursMinutes(5, 30);
        System.out.println(zone);
    }

    private static void gettingSupportedFieldResult() {
        ZoneOffset zone = ZoneOffset.UTC;
        boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);
        System.out.println(b1);
        boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(b2);
    }

    public static void main(String... args) {
        temporal();
        gettingHours();
        gettingHoursMinutes();
        gettingSupportedFieldResult();
    }
}
