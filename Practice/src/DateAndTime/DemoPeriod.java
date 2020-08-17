package DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class DemoPeriod {
    private static void addingCurrentDate() {
        Period period = Period.ofDays(1);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
    }

    private static void gettingDate() {
        Period period = Period.of(2020, 8, 17);
        System.out.println(period.toString());
    }

    private static void gettingMinusMonth() {
        Period period = Period.ofMonths(4);
        Period period2 = period.minus(Period.ofMonths(2));
        System.out.println(period2);
    }

    private static void gettingPlusMonth() {
        Period period = Period.ofMonths(4);
        Period period2 = period.plus(Period.ofMonths(2));
        System.out.println(period2);
    }

    public static void main(String... args) {
        addingCurrentDate();
        gettingDate();
        gettingMinusMonth();
        gettingPlusMonth();
    }
}
