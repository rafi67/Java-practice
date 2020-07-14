package FinalKeyword;

class Bike{
    void run(){
        System.out.println("running..");
    }
}

public class TestFinal2 extends Bike {
    public static void main(String [] args){
        Bike b = new Bike();
        b.run();
    }
}
