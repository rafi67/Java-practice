package DateAndTime;

import java.time.*;

public class DemoLocalDate3 {
    private static void date() {
        LocalDate date = LocalDate.of(2020, 2, 5);
        LocalDateTime datetime = date.atTime(2,30,32);
        System.out.println(datetime);
    }

    public static void main(String[]args) {
        date();
    }
}
