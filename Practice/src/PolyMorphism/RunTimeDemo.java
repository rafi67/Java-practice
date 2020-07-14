package PolyMorphism;

class Bike{
    public void run(){
        System.out.println("running");
    }
}

class Splender extends Bike{
    @Override
    public void run() {
        System.out.println("running safely with 60km");
    }
}

public class RunTimeDemo {
    public static void main(String [] args){
        Bike b = new Splender();
        b.run();
        Bike b2 = new Bike();
        b2.run();
    }
}
