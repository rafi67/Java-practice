package MultiThreading;

public class DemoThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running..");
    }

    public static void main(String[]args){
        DemoThread d = new DemoThread();
        d.start();
    }
}
