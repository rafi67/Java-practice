package DateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class DemoTimeZone {
    private static void gettingTimeZoneId() {
        String [] id = TimeZone.getAvailableIDs();
        System.out.println("In Time Zone Available id's are:");
        for(String s:id){
            System.out.println(s);
        }
    }

    private static void gettingOffsetOfTimeZone() {
        TimeZone time = TimeZone.getTimeZone("Asia/Dhaka");
        System.out.println("Offset value of Time Zone is "+
                time.getOffset(Calendar.ZONE_OFFSET));
    }

    private static void gettingTimeZoneID() {
        TimeZone time = TimeZone.getTimeZone("Asia/Dhaka");
        System.out.println("Time Zone Id is "+time.getID());
    }

    private static void gettingTimeZoneDisplayName() {
        TimeZone zone = TimeZone.getDefault();
        String name = zone.getDisplayName();
        System.out.println("Display name for default time zone: "+name);
    }

    public static void main(String... args) {
        //gettingTimeZoneId();
        gettingOffsetOfTimeZone();
        gettingTimeZoneID();
        gettingTimeZoneDisplayName();
    }
}
