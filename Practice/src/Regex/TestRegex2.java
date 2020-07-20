package Regex;

import java.util.regex.Pattern;

public class TestRegex2 {
    public static void main(String [] args){
        System.out.println("? quantifier....");
        System.out.println(Pattern.matches("[amn]?", "a"));
        System.out.println(Pattern.matches("[amn]?", "aaa"));
        System.out.println(Pattern.matches("[amn]?", "am"));

        System.out.println("+ quantifier...");
        System.out.println(Pattern.matches("[amn]+", "ammmn"));
        System.out.println(Pattern.matches("[amn]+", "aaa"));

        System.out.println("* quantifier...");
        System.out.println(Pattern.matches("[amn]*", "ammn"));
        System.out.println(Pattern.matches("[amn]*", ""));

        System.out.println("X{n} quantifier...");
        System.out.println(Pattern.matches("[amn]{2}", "aa"));
        System.out.println(Pattern.matches("[amn]{2}", "a"));

        System.out.println("X{n, } quantifier...");
        System.out.println(Pattern.matches("[amn]{1,}", "a"));
        System.out.println(Pattern.matches("[amn]{1,}", "aa"));
        System.out.println(Pattern.matches("[amn]{1,}", ""));

        System.out.println("X{y,z} quantifier...");
        System.out.println(Pattern.matches("[amn]{1,4}", "a"));
        System.out.println(Pattern.matches("[amn]{1,4}", "aaaa"));
        System.out.println(Pattern.matches("[amn]{1,4}", "aaaaa"));
    }
}
