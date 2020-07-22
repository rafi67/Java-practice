package ProblemSolving;

import java.util.*;

public class StringTest {
    private static void Do(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        char [] C = new char[10];
        C = A.toCharArray();
        String C2 = Character.toString(C[0]).toUpperCase();
        C[0] = C2.charAt(0);

        char [] D = new char[10];
        D = B.toCharArray();
        String D2 = Character.toString(D[0]).toUpperCase();
        D[0] = D2.charAt(0);

        String E = String.valueOf(C);
        String F = String.valueOf(D);
        System.out.println(E.length()+F.length());

        if(E.compareTo(F) < 0) System.out.println("No");
        else if(E.compareTo(F) == 0) System.out.println("No");
        else System.out.println("Yes");

        System.out.print(E+" "+F);
    }
    public static void main(String[] args) {
        Do();
    }
}
