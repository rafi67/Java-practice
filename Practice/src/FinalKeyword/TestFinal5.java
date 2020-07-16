package FinalKeyword;

public class TestFinal5 {
    int cube(final int n){
        // n=n+2;
        return n*n*n;
    }
    public static void main(String [] args){
        TestFinal5 t = new TestFinal5();
        t.cube(5);
    }
}
