package DateAndTime;

import java.time.LocalDate;

public class DemoLocalDate {
    private static void date(){
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("Today is "+date);
        System.out.println("Yesterday was "+yesterday);
        System.out.println("Tomorrow will be "+tomorrow);
    }

    public static void main(String[] args) {
        date();
    }
}
