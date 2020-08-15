package DateAndTime;

import java.time.*;

public class MonthDayDemo {
    private static void monthDay() {
        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(1997);
        System.out.println(date);
    }

    public static void main(String[]args) {
        monthDay();
    }
}
