package Regex;

import java.util.Scanner;
import java.util.regex.*;

public class TestRegex5 {
    private static void show(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter regex pattern: ");
            Pattern p = Pattern.compile(s.nextLine());
            System.out.println("Enter text: ");
            Matcher m = p.matcher(s.nextLine());
            boolean found = false;
            while(m.find()){
                System.out.println("Found the text "+m.group()+" starting index is "+
                        m.start()+" and ending index is "+m.end()+" regex pattern is"
                        +m.pattern()+" and total group count is "+m.groupCount());
                found = true;
            }
            if(!found){
                System.out.println("No match found");
            }
            else if(found){
                System.exit(0);
            }
        }
    }

    public static void main(String [] args){
        show();
    }
}
