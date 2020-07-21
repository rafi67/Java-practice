package Regex;

import java.util.regex.*;

public class TestRegex6 {
    private static void show(){
        String text = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if(m.find()){
            System.out.println("Found value: "+m.group(0));
            System.out.println("Found value: "+m.group(1));
            System.out.println("Found value: "+m.group(2));
            System.out.println("Group count: "+m.groupCount());
        }
        else{
            System.out.println("No match found");
        }
    }

    public static void main(String [] args){
        show();
    }
}
