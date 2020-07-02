package ProblemSolving;

import java.text.*;
import java.util.*;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
       // String us;
       // String india;
      //  String china;
        String france = null;
        try {
            france = String.valueOf(France(payment));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // System.out.println("US: " + us);
       // System.out.println("India: " + india);
       // System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

  /*  public static double America(double us){
        return us;
    }

    public static double India(double us){
        double india = 75.587;
        double result = india*us;
        return result;
    }

    public static double China(double us){
        double china = 7.0782;
        double result = us*china;
        return result;
    }*/

    public static Number France(double us) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        String r = String.valueOf(us);
            Number myNumber =  nf.parse(r);
            return myNumber;
    }
}
