package Synchronization;

class Test2 extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("task");
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread is running...");
    }
}

public class ThreadInterrupted2 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.start();
        t.interrupt();
    }
}
