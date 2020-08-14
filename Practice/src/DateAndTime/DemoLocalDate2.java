package DateAndTime;

import java.time.LocalDate;

public class DemoLocalDate2 {
    private static void date() {
        LocalDate date1 = LocalDate.of(2020, 2, 1);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2019, 2, 1);
        System.out.println(date2.isLeapYear());
    }

    public static void main(String[]args) {
        date();
    }
}
