package Abstraction;

abstract class Bike22{
    abstract void run();
}

public class TestAbs extends Bike22 {
    @Override
    void run() {
        System.out.println("Bike is running...");
    }

    public static void main(String [] args){
        TestAbs t = new TestAbs();
        t.run();
    }
}
