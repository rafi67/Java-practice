package ProblemSolving;

import java.util.Scanner;

public class IPAddressChackerProgram {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String pattern = "";
}
