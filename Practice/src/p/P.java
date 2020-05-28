package p;

import java.util.Scanner;

public class P {
    public static void main(String Rafi[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = s.nextInt();
        int m=0;
        for(int i=0; i<=4; i++){
                m = n * 2;
                System.out.println(m);
                n = m * 2;
                System.out.println(n);
        }
    }
}
