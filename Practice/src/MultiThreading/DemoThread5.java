package MultiThreading;

public class DemoThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[]args){
        DemoThread5 d = new DemoThread5();
        d.run();
    }
}
