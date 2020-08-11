package MultiThreading;

public class DemoThread11 extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        }
        else
            System.out.println("User thread work");
    }

    public static void main(String[]args){
        DemoThread11 d1 = new DemoThread11();
        DemoThread11 d2 = new DemoThread11();
        DemoThread11 d3 = new DemoThread11();
        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.start();
    }
}
