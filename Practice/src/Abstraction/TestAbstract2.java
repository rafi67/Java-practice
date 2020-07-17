package Abstraction;

abstract class Shape{
    abstract void draw();
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
