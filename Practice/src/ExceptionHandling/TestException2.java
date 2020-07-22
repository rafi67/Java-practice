package ExceptionHandling;

public class TestException2 {
    private static void show(){
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            int [] d = {1,2,4, 6};
            System.out.println(d[10]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        show();
    }
}
