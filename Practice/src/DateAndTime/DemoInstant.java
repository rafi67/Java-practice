package DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DemoInstant {
    private static void gettingInstant() {
        Instant instant = Instant.parse("2020-08-18T17:40:30.00Z");
        System.out.println(instant);
    }

    private static void gettingCurrentInstant() {
        Instant instant = Instant.now();
        System.out.println(instant);
    }

    private static void gettingMinusInstant() {
        Instant instant = Instant.now();
        instant = instant.minus(Duration.ofDays(1));
        System.out.println(instant);
    }

    private static void gettingPlusInstant() {
        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plus(Duration.ofDays(1));
        System.out.println(instant2);
    }

    private static void gettingInstantResult() {
        Instant instant = Instant.now();
        System.out.println(instant.isSupported(ChronoUnit.DAYS));
        System.out.println(instant.isSupported(ChronoUnit.YEARS));
    }

    public static void main(String... args) {
        gettingInstant();
        gettingCurrentInstant();
        gettingMinusInstant();
        gettingPlusInstant();
        gettingInstantResult();
    }
}
