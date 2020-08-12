package MultiThreading;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Two task");
    }
}

public class DemoThread13 extends Thread {
    @Override
    public void run() {
        System.out.println("ONe task");
    }

    public static void main(String[]args){
        DemoThread13 d1 = new DemoThread13();
        MyThread d2 = new MyThread();
        DemoThread13 d3 = new DemoThread13();
        d1.start();
        d2.start();
        d3.start();
    }
}
