package ProblemSolving;

import java.util.*;
import java.util.regex.Pattern;

public class PatternChackerProgram {
    private static void test() {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        ArrayList<String>list = new ArrayList<>();
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                list.add("Valid");
            }
            catch(Exception e){
                list.add("Invalid");
            }
            testCases--;
            if(testCases == 0){
                break;
            }
        }
        for(String s:list){
            System.out.println(s);
        }
    }

    public static void main(String... args) {
        test();
    }
}
