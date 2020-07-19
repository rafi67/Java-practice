package Recursion;

public class TestRecursion3 {
    static int number = 5;
    static int factorial(int n){
        if(n==1) return 1;
        else return (n*factorial(n-1));
    }

    public static void main(String[] args) {
        int n = factorial(number);
        System.out.println("Factorial of "+number+" is "+n);
    }
}
