package MultiThreading;

public class DemoThread9 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[]args){
        DemoThread9 d1 = new DemoThread9();
        DemoThread9 d2 = new DemoThread9();
        d1.start();
        d2.start();
    }
}
