package ProblemSolving;

import java.text.*;
import java.util.*;
import java.util.Locale;
import java.io.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    private static String US(double payment){
        String mystring = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        return mystring;
    }

    private static String India(double payment){
        Locale in = new Locale("EN", "in");
        String mystring = NumberFormat.getCurrencyInstance(in).format(payment);
        return mystring;
    }

    private static String China(double payment){
        String mystring = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        return mystring;
    }

    private static String France(double payment){
        String mystring = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        return mystring;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us =US(payment);
        String india = India(payment);
        String china = China(payment);
        String france = France(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
