package ProblemSolving;

import java.util.Scanner;

public class StringTest3 {
    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String S = s.substring(k);
        if(S.compareTo(s)<0) smallest = s.substring(k);
        if(S.compareTo(s)>0) largest = s.substring(k);
        System.out.println(smallest);
        System.out.println(largest);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        getSmallestAndLargest(s, k);
    }
}
