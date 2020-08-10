package ScannerClass;

import java.util.Scanner;

public class DemoScanner3 {
    private static void scanner(){
        String s = "Rafi/Fahim/Shafil";
        Scanner sc = new Scanner(s);
        System.out.println("Boolean Result: "+sc.hasNext());
        sc.useDelimiter("/");
        System.out.println("Printing tokenizes string");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        System.out.println("Delimiter used: "+sc.delimiter());
        sc.close();
    }

    public static void main(String [] args){
        scanner();
    }
}
