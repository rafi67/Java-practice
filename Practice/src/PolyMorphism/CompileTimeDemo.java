package PolyMorphism;

public class CompileTimeDemo {
    public void area(int b, int r){
        System.out.println("Area is "+(0.5*b*r));
    }
    public void area(int r){
        double pi = 3.14;
        System.out.println("Area is "+(pi*r*r));
    }

    public static void main(String [] args){
        CompileTimeDemo c = new CompileTimeDemo();
        c.area(5);
        c.area(4, 6);
    }
}
