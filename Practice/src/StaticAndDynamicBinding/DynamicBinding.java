package StaticAndDynamicBinding;

class Animal2{
    void eat(){
        System.out.println("animal is eating....");
    }
}

class Dog3 extends Animal2{
    @Override
    void eat() {
        System.out.println("dog is eating...");
    }
}

public class DynamicBinding {
    public static void main(String [] args){
        Animal2 a2 = new Dog3();
        a2.eat();
    }
}
