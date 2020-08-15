package DateAndTime;

import java.time.LocalTime;

public class DemoLocalTime {
    private static void time() {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

    private static void time2() {
        LocalTime time = LocalTime.of(10, 42, 10);
        System.out.println(time);
    }

    private static void time3() {
        LocalTime time = LocalTime.of(12, 00, 20);
        LocalTime time2 = time.minusHours(2);
        LocalTime time3 = time2.minusMinutes(30);
        System.out.println(time3);
    }

    private static void time4() {
        LocalTime time = LocalTime.of(5, 06, 25);
        LocalTime time2 = time.plusHours(3);
        LocalTime time3 = time2.plusMinutes(30);
        System.out.println(time3);
    }

    public static void main(String[]args) {
        time();
        time2();
        time3();
        time4();
    }
}
