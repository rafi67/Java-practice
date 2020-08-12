package MultiThreading;

public class DemoThread14 implements Runnable {
    @Override
    public void run() {
        System.out.println("One Task");
    }

    public static void main(String[]args){
        Thread t1 = new Thread(new DemoThread14());
        Thread t2 = new Thread(new DemoThread14());
        t1.start();
        t2.start();
    }
}
