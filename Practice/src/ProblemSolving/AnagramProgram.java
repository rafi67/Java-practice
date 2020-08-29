package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnagramProgram {
    private static boolean isAnagram(String a, String b) {
        String e = a.toLowerCase();
        String f = b.toLowerCase();
        boolean d;
        char[]c1 = e.toCharArray();
        char[]c2 = f.toCharArray();
        ArrayList<String>s1 = new ArrayList<>();
        ArrayList<String>s2 = new ArrayList<>();
        ArrayList<Boolean>b2 = new ArrayList<>();
        for(int i=0; i<c1.length; i++){
            s1.add(String.valueOf(c1[i]));
        }
        for(int i=0; i<c2.length; i++){
            s2.add(String.valueOf(c2[i]));
        }
        Collections.sort(s1);
        Collections.sort(s2);
        if(c1.length<c2.length || c2.length<c1.length) d = false;
        else {
            for (int j = 0; j <= s1.size() - 1; j++) {
                String s3 = s1.get(j);
                String s4 = s2.get(j);
                int m = s3.compareTo(s4);
                if (m != 0) {
                    b2.add(false);
                }
            }

            if (b2.contains(false)) d = false;
            else d = true;
        }

        return d;
    }

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
