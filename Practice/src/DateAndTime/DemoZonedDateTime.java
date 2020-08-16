package DateAndTime;

import java.time.*;

public class DemoZonedDateTime {

    private static void zoned() {
        ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
        System.out.println(zone);
    }

    private static void sameInstant() {
        LocalDateTime ldt = LocalDateTime.of(2020, Month.JANUARY, 17, 15, 30);
        ZoneId bangladesh = ZoneId.of("Asia/Dhaka");
        ZonedDateTime zone1 = ZonedDateTime.of(ldt, bangladesh);
        System.out.println("Central time zone of Bangladesh is "+zone1);
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2 = zone1.withZoneSameInstant(tokyo);
        System.out.println("Central time zone of Tokyo is "+zone2);
    }

    private static void gettingZone() {
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone.getZone());
    }

   private static void gettingMinusDays() {
        ZonedDateTime zone = ZonedDateTime.now();
        ZonedDateTime zone2 = zone.minus(Period.ofDays(6));
        System.out.println(zone2);
   }

   private static void gettingPlusDays() {
        ZonedDateTime zone = ZonedDateTime.now();
        ZonedDateTime zone2 = zone.plus(Period.ofDays(2));
        System.out.println(zone2);
   }

    public static void main(String[]args) {
        zoned();
        sameInstant();
        gettingZone();
        gettingMinusDays();
        gettingPlusDays();
    }
}
