package DateAndTime;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class DemoZoneId {
    private static void zoneTime() {
        ZoneId zoneId1 = ZoneId.of("Asia/Dhaka");
        ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
        LocalTime lt = LocalTime.now(zoneId1);
        LocalTime lt2 = LocalTime.now(zoneId2);
        System.out.println(lt);
        System.out.println(lt2);
        System.out.println(lt.isBefore(lt2));
    }

    private static void gettingSystemDefault() {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
    }

    private static void gettingId() {
        ZoneId zone = ZoneId.systemDefault();
        String id = zone.getId();
        System.out.println(id);
    }

    private static void gettingDisplayName() {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));
    }

    public static void main(String... args) {
        zoneTime();
        gettingSystemDefault();
        gettingId();
        gettingDisplayName();
    }
}
