package Regex;

import java.util.regex.*;

public class TestRegex {
    private static void show(){
        Pattern p = Pattern.compile("..s.");
        Matcher m = p.matcher("fast");
        boolean b = m.matches();
        boolean b2 = Pattern.compile("...i").matcher("Rafi").matches();
        boolean b3 = Pattern.matches(".s", "as");
        boolean b4 = Pattern.matches(".r..", "Arif");
        System.out.println(b+" "+b2+" "+b3+" "+b4);
    }
    public static void main(String [] args){
        show();
    }
}
