package ScannerClass;

import java.util.Scanner;

public class DemoScanner2 {
    private static void scanner(){
        String srg = "Welcome to softech";
        Scanner sc = new Scanner(srg);
        System.out.println("Boolean Result: "+sc.hasNext());
        System.out.println("String: "+sc.nextLine());
        sc.close();
        System.out.println("----Enter your details----");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        System.out.println("Enter your Salary: ");
        double salary = in.nextDouble();
        System.out.println("Welcome "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your salary is "+salary);
        in.close();
    }

    public static void main(String [] args){
        scanner();
    }
}
