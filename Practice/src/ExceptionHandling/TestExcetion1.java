package ExceptionHandling;

public class TestExcetion1 {
    private static void show(){
        try{
            int data = 100;
            int b = 0;
            System.out.println(data/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        show();
    }
}
