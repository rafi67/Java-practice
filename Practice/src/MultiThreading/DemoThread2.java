package MultiThreading;

public class DemoThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[]args){
        DemoThread2 d = new DemoThread2();
        Thread t = new Thread(d);
        t.start();
    }
}
