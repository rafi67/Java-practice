package DateAndTime;

import java.time.OffsetDateTime;

public class OffsetdateTime {
    private static void getDay() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.getDayOfMonth());
    }

    private static void getDay2() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.getDayOfYear());
    }

    private static void getDay3() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.getDayOfWeek());
    }

    private static void getDate() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.toLocalDate());
    }

    private static void getMinusDays() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        OffsetDateTime m = offsetDT.minusDays(200);
        System.out.println(m);
    }

    private static void getPlusDays() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        OffsetDateTime d = offsetDT.plusDays(200);
        System.out.println(d);
    }

    public static void main(String[]args) {
        getDay();
        getDay2();
        getDay3();
        getDate();
        getMinusDays();
        getPlusDays();
    }
}
