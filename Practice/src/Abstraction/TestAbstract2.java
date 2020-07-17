package Abstraction;

abstract class Shape{
    abstract void draw();
    final void draw2(){
        System.out.println("No shape found");
    }
    public static void draw3(){
        System.out.println("NO shape found");
    }

    private  void draw4(){
        System.out.println("No shape found");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("rectangle drawing");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing circle");
    }
}

public class TestAbstract2 {
    public static void main(String [] args){
        Shape s = new Circle();
        s.draw();
    }
}
