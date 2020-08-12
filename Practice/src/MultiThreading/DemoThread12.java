package MultiThreading;

public class DemoThread12 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[]args){
        DemoThread12 runnable = new DemoThread12();
        ThreadGroup tg1 = new ThreadGroup("Parent Thread Group");
        Thread t1 = new Thread(tg1, runnable, "one");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "two");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "three");
        t3.start();
        System.out.println("Thread Group name is "+tg1.getName());
        tg1.list();
    }
}
