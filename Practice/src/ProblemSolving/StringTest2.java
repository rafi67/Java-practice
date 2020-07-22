package ProblemSolving;

import java.util.*;

public class StringTest2 {
    private static void Do(){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }

    public static void main(String [] args){
        Do();
    }
}
