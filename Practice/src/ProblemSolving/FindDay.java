package ProblemSolving;

import java.time.LocalDate;
import java.util.Scanner;

public class FindDay {
    public static String fday(int month, int day, int year){
        LocalDate dt = LocalDate.of(year,month,day);
        String Day= String.valueOf(dt.getDayOfWeek());
        return Day;
    }
    public static void main (String Rafi[]){
        int month;
        int year;
        int day;
        Scanner s = new Scanner(System.in);
        month = s.nextInt();
        year = s.nextInt();
        day = s.nextInt();
        String DayName = fday(month, day, year);
        System.out.println(DayName);
    }
}
