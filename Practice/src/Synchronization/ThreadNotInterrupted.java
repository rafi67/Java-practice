package Synchronization;

class Test3 extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
}

public class ThreadNotInterrupted {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.start();
        t.interrupt();
    }
}
