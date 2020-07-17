package Abstraction;

abstract class Bike33{
    Bike33(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}

class Honda extends Bike33{
    @Override
    void run() {
        System.out.println("running safely...");
    }
}

public class TestAbstract3 {
    public static void main(String [] args){
        Bike33 b = new Honda();
        b.run();
        b.changeGear();
    }
}
