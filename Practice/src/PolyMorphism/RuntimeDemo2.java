package PolyMorphism;

class Bank{
    float getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    @Override
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank{
    @Override
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank{
    @Override
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class RuntimeDemo2 {
    public static void main(String [] args){
        Bank b;
        b = new SBI();
        System.out.println("SBI Bank Rate of Interest is "+b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Bank Rate of Interest is "+b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIX Bank Rate of Interest is "+b.getRateOfInterest());
    }
}
