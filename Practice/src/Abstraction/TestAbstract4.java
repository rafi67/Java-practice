package Abstraction;

interface A{
    void g();
    void f();
    void c();
    void d();
}

abstract class B implements A{
    @Override
    public void g() {
        System.out.println("g is implemented");
    }
}

class C extends B{
    @Override
    public void f() {
        System.out.println("f is implemented");
    }

    @Override
    public void c() {
        System.out.println("c is implemented");
    }

    @Override
    public void d() {
        System.out.println("d is implemented");
    }
}

public class TestAbstract4 {
    public static void main(String [] args){
        C c = new C();
        c.c();
        c.d();
        c.f();
        c.g();
    }
}
