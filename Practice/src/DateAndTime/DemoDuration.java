package DateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DemoDuration {
    private static void gettingDuration() {
        Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d.get(ChronoUnit.SECONDS));
    }

    private static void gettingDurationResult() {
        Duration d = Duration.between(LocalTime.MAX, LocalTime.NOON);
        System.out.println(d.isNegative());
        Duration d2 = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d2.isNegative());
    }

    private static void gettingMinusDuration() {
        Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d.getSeconds());
        Duration d2 = d.minus(d);
        System.out.println(d2.getSeconds());
    }

    private static void gettingPlusDuration() {
        Duration d1 = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d1.getSeconds());
        Duration d2 = d1.plus(d1);
        System.out.println(d2.getSeconds());
    }

    public static void main(String... args) {
        gettingDuration();
        gettingDurationResult();
        gettingMinusDuration();
        gettingPlusDuration();
    }
}
