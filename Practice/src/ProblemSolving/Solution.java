package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String Rafi[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer>a = new ArrayList<>();
        ArrayList<Integer>b = new ArrayList<>();
        ArrayList<Integer>n = new ArrayList<>();
        for (int i = 0; i < t; i++) {
             a.add(in.nextInt());
             b.add(in.nextInt());
             n.add(in.nextInt());
        }
        in.close();
        for(int r=0; r<t; r++ ) {
            int x = 0;
            for (int j = 0, k = 0; j < n.get(r) && k <= n.get(r) - 1; j++, k++) {
                x = (int) Math.pow(2, k) * b.get(r) + x;
                System.out.print(a.get(r) + x + " ");
            }
            System.out.println("");
        }
    }
}
