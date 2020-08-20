package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoSimpleDateFormat {
    private static void gettingDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }

    private static void gettingAllFormat() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
        formatter = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss zzzz");
        strDate = formatter.format(date);
        System.out.println(strDate);
        formatter = new SimpleDateFormat("dd-MMM-yyyy z");
        strDate = formatter.format(date);
        System.out.println(strDate);
        formatter = new SimpleDateFormat("dd-M-yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println(strDate);
        formatter = new SimpleDateFormat("E, dd-MMMM-yyyy hh:mm:ss zzzz");
        strDate = formatter.format(date);
        System.out.println(strDate);
    }

    private static void gettingDate2() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = formatter.parse("20/08/2020");
            System.out.println(date);
        }
        catch(ParseException e){e.printStackTrace();}
    }

    public static void main(String... args) {
        gettingDate();
        gettingAllFormat();
        gettingDate2();
    }
}
