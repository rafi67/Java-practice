package SuperKeyword;

class Animal2{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal2{
    void eat(){
        System.out.println("Eating bread...");
    }

    void bark(){
        System.out.println("Barking...");
    }

    void work(){
        super.eat();
        bark();
    }
}

public class TestSuper2 {
    public static void main(String [] args){
        Dog2 d = new Dog2();
        d.work();
    }
}
