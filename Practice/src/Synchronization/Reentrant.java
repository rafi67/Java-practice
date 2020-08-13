package Synchronization;

class Test5 {
    synchronized void n(){
        System.out.println("this is n()");
    }

    synchronized void m(){
        n();
        System.out.println("this is m()");
    }
}

public class Reentrant {
    public static void main(String[] args) {
        final Test5 t = new Test5();
        Thread t1 = new Thread(() -> t.m());
        t1.start();
    }
}
