package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringTest3 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String>largest2 = new ArrayList<>();
        ArrayList<String>smallest2 = new ArrayList<>();
        char[] s2 = s.toCharArray();
        int size = s2.length;
        ArrayList<String> y = new ArrayList<>();
        for(int i=0; i<size; i++){
            char [] c = new char[k];
            if(i == ((s2.length-1)-(k-2))) break;
            if(i==0) {
                for (int j = 0; j < k; j++) {
                    c[j]=s2[j];
                }
                y.add(String.valueOf(c));
            }
            if(i>0){
                int l=0;
                for(int m=i; m<=i+(k-1); m++){
                    if(m>=s2.length) break;
                    else {
                        c[l]=s2[m];
                        l++;
                    }
                }
                y.add(String.valueOf(c));
            }
        }
        int g = 1;
        for(int h=0; h<y.size()-1; h++){
            String g1 = y.get(h);
            String g2 = y.get(g);
            if (g1.compareTo(g2) < 0) {
                smallest2.add(g1);
            }
            if (g2.compareTo(g1) < 0) {
                smallest2.add(g2);
            }
            if (g1.compareTo(g2) > 0) {
                largest2.add(g1);
            }
            if (g2.compareTo(g1) > 0) {
                largest2.add(g2);
            }
            g=g+1;
        }
        Collections.sort(largest2);
        Collections.sort(smallest2);
        int size1 = (smallest2.size())-1;
        int size2 = (largest2.size())-1;
        if(largest2.size()!=0) largest = largest2.get(size2);
        if(smallest2.size()!=0) smallest = smallest2.get(0);
        if(largest2.size()==0 && smallest2.size()==0){
            largest = s;
            smallest = s;
        }
        else if(largest2.size()==0) largest = smallest2.get(size1);
        else if(smallest2.size()==0) smallest = largest2.get(0);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
