package Interface;

interface Printable3{
    void print();
    default void msg(){
        r();
        System.out.println("default method");
    }
    static int cube(int x){
        return x*x*x;
    }
    private static void r(){
        System.out.println("r method");
    }
}

interface Showable2 extends Printable3{
    void show();
}

class A8 implements Showable2{
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }
}

public class TestInterface5 {
    TestInterface5(){
        Showable2 a = new A8();
        a.print();
        a.show();
        a.msg();
        System.out.println(Printable3.cube(3));
    }
    public static void main(String [] args){
        new TestInterface5();
    }
}
