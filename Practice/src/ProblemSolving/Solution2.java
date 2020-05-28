package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
    public static void main(String Rafi [])
    {
        Scanner sc = new Scanner(System.in); // input scanner object
        int t=sc.nextInt(); // taking input for how many time program take input from user
        ArrayList<Long> inputdata = new ArrayList<>(); // storing input data
        ArrayList<String> errordata = new ArrayList<>(); //storing error data
        ArrayList<Integer> errordatalocation = new ArrayList<>(); //storing error data location
        ArrayList<Integer> inputdatalocation = new ArrayList<>(); //storing input data location
        for(int i=0; i<t; i++) {
            try {
                inputdata.add(sc.nextLong()); //taking input
                inputdatalocation.add(i); //taking input data location
            } catch (Exception e) {
                errordata.add(sc.next()); //taking error data as input
                errordatalocation.add(i); // taking error data location
            }
        }
        int m=0; // variable for error data location increment and decrement
        int n=0; //variable for input data location increment and decrement
        for (int j = 0; j < t; j++) {
            if(j==inputdatalocation.get(n)) { // inputdataloction == j then given below code will work
                System.out.println(inputdata.get(n) + " can be fitted in:");
                if (inputdata.get(n) >= -128 && inputdata.get(n) <= 127) System.out.println("* byte"); //byte data type range matches the inputdata then print the output
                if (inputdata.get(n) >= -32768 && inputdata.get(n) <= 32767) System.out.println("* short"); // short data type range matches the inputdata
                if (inputdata.get(n) >= -2147483648 && inputdata.get(n) <= 2147483647) System.out.println("* int"); //int data type range matcher the inputdata
                if (inputdata.get(n) >= -9223372036854775808l && inputdata.get(n) <= 9223372036854775807l) //long data type range matches the inputdata
                    System.out.println("* long");
                n++;
                if(n>inputdatalocation.size()-1)n--; // data n > input data location  total index true then it will decrease 1 in n
            }
            if (j==errordatalocation.get(m)) {
                System.out.println(errordata.get(m) + " can't be fitted anywhere.");
                m++;
                if(m>errordatalocation.size()-1)m--;// data m > error data location total index true then it will decrease 1 in m
            }
        }
    }
}

