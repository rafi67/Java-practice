package DateAndTime;

import java.time.Clock;
import java.time.Duration;

public class DemoClock {
    private static void getzone() {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
    }

    private static void getInstant() {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
    }

    private static void getOffset() {
        Clock c = Clock.systemUTC();
        Duration d = Duration.ofHours(7);
        Clock clock = Clock.offset(c, d);
        System.out.println(clock.instant());
    }

    public static void main(String[]args) {
        getzone();
        getInstant();
        getOffset();
    }
}
