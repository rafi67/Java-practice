package Regex;

import java.util.regex.*;

public class TestRegex4 {
    private static void show(){
        System.out.println("by character classes and quantifiers...");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9987566492"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "8512563634"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "123456"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "95125636344"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "658791179"));
    }

    private static void show2(){
        System.out.println("by match characters...");
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "7123456789"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "1234567895"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "712345678"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "91234567897"));
    }

    public static void main(String [] args){
        show();
        show2();
    }
}
