package Interface;

class A7 implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }
}

public class TestInterface4 {
    public static void main(String [] args){
        A7 a = new A7();
        a.show();
        a.print();
    }
}
