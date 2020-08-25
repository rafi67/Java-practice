package Assertion;

import java.util.Scanner;

public class DemoAssertion {
    private static void testProgram() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int value = s.nextInt();
        assert value>=18: "Not valid";
        System.out.println("Your age is "+value);
    }

    public static void main(String... args) {
        testProgram();
    }
}
