package ExceptionHandling;

public class TestException5 {
    private static void Do() throws ArithmeticException{
        int a = 50;
        int b = 0;
        int c = a/b;
        System.out.println(c);
    }

    public static void main(String [] args){
        try {
            Do();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
