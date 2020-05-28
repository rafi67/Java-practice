package Inputoutputwithprintwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String Rafi[]) throws FileNotFoundException{
        File file = new File("C:\\EdurekaIO\\EmployeeInfo.txt");
        System.out.println("Enter the amount, how many time you want to store information: ");
        Scanner s = new Scanner(System.in);
        int times = s.nextInt();
        writeToFile(file, times);
        readFile(file);
    }

    private static void writeToFile(File file, int times) throws FileNotFoundException{
        PrintWriter p = new PrintWriter(file);
        Scanner s = new Scanner(System.in);
        String Name;
        String id;
        for(int i=0; i<times; i++){
            System.out.println("Enter your name: ");
            Name = s.nextLine();
            System.out.println("Please enter your id: ");
            id = s.nextLine();
            p.println(Name);
            p.println(id);
        }
        p.flush();
        p.close();
    }

    private static void readFile(File file) throws FileNotFoundException{
        Scanner s = new Scanner(file);
        System.out.println("Output:");
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
}
