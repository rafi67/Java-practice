package Synchronization;

class Test4 extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=2; i++){
            if(Thread.interrupted()){
                System.out.println("Code for interrupted thread");
            }
            else System.out.println("Code for normal thread");
        }
    }
}

public class ThreadInterrupted3 {
    public static void main(String[] args) {
        Test4 t1 = new Test4();
        Test4 t2 = new Test4();
        t1.start();
        t1.interrupt();
        t2.start();
    }
}
