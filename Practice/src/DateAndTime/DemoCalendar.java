package DateAndTime;

import java.util.Calendar;

public class DemoCalendar {
    private static void gettingCalendarTime() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date and time is "+calendar.getTime());
        calendar.add(Calendar.DATE, 3);
        System.out.println("3 days later "+calendar.getTime());
        calendar.add(Calendar.MONTH, 2);
        System.out.println("2 months later "+calendar.getTime());
        calendar.add(Calendar.YEAR, 5);
        System.out.println("5 years later "+calendar.getTime());
    }

    private static void gettingDateAndYear() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date from calendar is "+calendar.get(Calendar.DATE));
        System.out.println("Current year from calendar is "+calendar.get(Calendar.YEAR));
    }

    private static void gettingDateAndTime() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }

    private static void gettingMaximumDayAndWeek() {
        Calendar calendar = Calendar.getInstance();
        int maximumDay = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum day in week is "+maximumDay);
        int maximumWeek = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum week in this Year is "+maximumWeek);
    }

    private static void gettingMinimumDayAndWeek() {
        Calendar calendar = Calendar.getInstance();
        int minimumDay = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum day in week is "+minimumDay);
        int minimumWeek = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum week in this year is "+minimumWeek);
    }

    public static void main(String... args) {
        gettingCalendarTime();
        gettingDateAndYear();
        gettingDateAndTime();
        gettingMaximumDayAndWeek();
        gettingMinimumDayAndWeek();
    }
}
