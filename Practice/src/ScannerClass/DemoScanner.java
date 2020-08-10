package ScannerClass;

import java.util.Scanner;

public class DemoScanner {
    private static void scanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Welcome "+name);
    }

    public static void main(String [] args){
        scanner();
    }
}
