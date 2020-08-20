package DateAndTime;

import java.util.Date;
import java.text.DateFormat;

public class DemoDateFormat {
    private static void gettingDateFormat() {
        Date currentDate = new Date();
        System.out.println("Current date is "+currentDate);
        String date = DateFormat.getInstance().format(currentDate);
        System.out.println("Formatted current date using getInstance() "+date);
    }

    private static void gettingAllInstance() {
        Date currentDate = new Date();
        System.out.println("Current date is "+currentDate);
        String dateToString = DateFormat.getInstance().format(currentDate);
        System.out.println("Formatting date with getInstance(): "+dateToString);
        dateToString = DateFormat.getDateInstance().format(currentDate);
        System.out.println("Formatting date with getDateInstance(): "+dateToString);
        dateToString = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("Formatting current date using getTimeInstance(): "+dateToString);
        dateToString = DateFormat.getDateTimeInstance().format(currentDate);
        System.out.println("Formatting current date using getDateTimeInstance(): "+dateToString);
        dateToString = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
        System.out.println("Formatting current date using getTimeInstance(DateFormat.SHORT): "+
                dateToString);
        dateToString = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
        System.out.println("Formatting current date using getTimeInstance(DateFormat.MEDIUM): "+
                dateToString);
        dateToString = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
        System.out.println("Formatting current date using getTimeInstance(DateFormat.LONG): "+
                dateToString);
        dateToString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).
                format(currentDate);
        System.out.println("Formatting current date using getDateTimeInstance(DateFormat.LONG," +
                "DateFormat.SHORT): "+dateToString);
    }

    private static void gettingDate() {
        try {
            Date d = DateFormat.getDateInstance().parse("20 Mar, 2020");
            System.out.println("Date is: "+d);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String... args) {
        gettingDateFormat();
        gettingAllInstance();
        gettingDate();
    }
}
