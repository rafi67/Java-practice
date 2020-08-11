package MultiThreading;

public class DemoThread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name is "+Thread.currentThread().getName());
        System.out.println("Thread Priority is "+Thread.currentThread().getPriority());
    }

    public static void main(String[]args){
        DemoThread10 d1 = new DemoThread10();
        DemoThread10 d2 = new DemoThread10();
        d1.setPriority(Thread.MIN_PRIORITY);
        d2.setPriority(Thread.MAX_PRIORITY);
        d1.start();
        d2.start();
    }
}
