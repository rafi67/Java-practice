package MultiThreading;

public class DemoThread4 extends Thread {
    @Override
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[]args){
        DemoThread4 d = new DemoThread4();
        d.start();
        d.start();
    }
}
