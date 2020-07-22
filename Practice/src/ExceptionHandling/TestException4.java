package ExceptionHandling;

public class TestException4 {
    private static void Do(){
        try {
            int a = 50;
            int b = 0;
            if (b == 0)
                throw new ArithmeticException("DividedByZeroException");
            int c = a / b;
            System.out.println("Result is "+c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        Do();
    }
}
