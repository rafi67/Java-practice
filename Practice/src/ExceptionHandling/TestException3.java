package ExceptionHandling;

public class TestException3 {
    private static void Do(){
        try{
            try{
                int a = 100;
                int b = 0;
                System.out.println(a/b);
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }

            try{
                int [] v = {1,2,3,4,5,6};
                System.out.println(v[10]);
            }
            catch(IndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        Do();
    }
}
