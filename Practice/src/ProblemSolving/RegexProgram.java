package ProblemSolving;

import java.util.*;

public class RegexProgram {
    private static void test() {
        Scanner s = new Scanner(System.in);
        String s2 = s.nextLine().trim();
        s.close();
        if(s2.length()==0){
            System.out.println(0);
        }
        else{
            s2 = s2.replaceAll("[^\\p{Alpha}]+"," ").trim();
            if(s2.isEmpty()){
                System.out.println(0);
            }
            else{
                String[]str = s2.split("[\\p{Space}]+");
                for(String s3:str){
                    System.out.println(s3);
                }
            }
        }
    }

    private static void test2() {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        System.out.println(input);
        String [] str = input.split("[^\\p{Alpha}]+");
        int size = (input.isEmpty()) ? 0:str.length;
        System.out.println(size);
        for(String s1:str){
            System.out.println(s1);
        }
    }

    public static void main(String... args) {
        test();
    }
}
