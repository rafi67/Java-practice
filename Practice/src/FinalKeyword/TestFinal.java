package FinalKeyword;

final class Bike9{ // final class cannot be inherit
    final int speedlimit = 90; // final variable cannot change it's value
    final void run(){ // final method cannot be overriden
        System.out.println("This is a run method under class Bike9 "+speedlimit);
    }
}

public class TestFinal{

    void run(){
        System.out.println("this is a run method under TestFinal");
    }

    public static void main(String [] args){
        Bike9 b = new Bike9();
        b.run();
    }
}
