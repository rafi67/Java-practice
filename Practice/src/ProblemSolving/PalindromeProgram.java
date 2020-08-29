package ProblemSolving;

import java.util.Scanner;

public class PalindromeProgram {
    private static void test() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[]c = str.toCharArray();
        char[]c2 = new char[c.length];
        int l=0;
        for(int i=c.length-1; i<=c.length-1 && i>-1; i--){
            c2[l]=c[i];
            l++;
            if(l>=c.length) break;
        }
        String str2 = String.valueOf(c2);
        if(str.equals(str2)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void main(String... args) {
        test();
    }
}
