package Synchronization;

class Test extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("task");
        }
        catch(InterruptedException e){
            throw new RuntimeException("Thread interrupted..."+e);
        }
    }
}

public class ThreadInterrupt {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        try{
            t.interrupt();
        }
        catch(Exception e){
            System.out.println("Exception Handled "+e);
        }
    }
}
