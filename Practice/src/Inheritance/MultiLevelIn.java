package Inheritance;

public class MultiLevelIn {
    public static void main(String [] args){
        C c = new C();
        c.display();
        c.display2();
        c.display3();
    }
}

class A{
    void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    void display2(){
        System.out.println("Class B");
    }
}

class C extends B{
    void display3(){
        System.out.println("Class C");
    }
}
