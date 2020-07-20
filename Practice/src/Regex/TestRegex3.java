package Regex;

import java.util.regex.Pattern;

public class TestRegex3 {

    private static void show(){
        System.out.println("X{n} quantifier with [a-zA-Z0-9]...");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "Fahim77"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "fahima77"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "fahim778"));
    }

    public static void main(String [] args){
        System.out.println("match characters d...");
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "12"));
        System.out.println(Pattern.matches("\\d", "a"));

        System.out.println("match characters D...");
        System.out.println(Pattern.matches("\\D", "a"));
        System.out.println(Pattern.matches("\\D", "A"));
        System.out.println(Pattern.matches("\\D", "am"));

        System.out.println("* quantifier with match characters D...");
        System.out.println(Pattern.matches("\\D*", "mak"));

        show();
    }
}
