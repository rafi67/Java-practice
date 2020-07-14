package SuperKeyword;

class Animal3{
    Animal3(){
        System.out.println("Animal is Created");
    }
}

class Dog3 extends Animal3{
    Dog3(){
        super();
        System.out.println("Dog is Created");
    }
}

public class TestSuper3{
    public static void main(String [] args){
        Dog3 d = new Dog3();
        System.gc();
    }
}
