package Abstraction;

abstract class Bank{
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

public class TestBank {
    public static void main(String [] args){
        Bank b = new SBI();
        System.out.println("Rate of Interest is "+b.getRateOfInterest());
        b = new PNB();
        System.out.println("Rate of Interest is "+b.getRateOfInterest());
    }
}
