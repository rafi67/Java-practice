package ExceptionHandling;

public class TestExpcetion1 {
    private static void show(){
        try{
            int data = 100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        show();
    }
}
