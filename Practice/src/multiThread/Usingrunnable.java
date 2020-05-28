package multiThread;

public class Usingrunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello world!");
        M.display();
    }

    public static void main(String Rafi[]){
        Usingrunnable r = new Usingrunnable();
        Thread t = new Thread(r);
        t.start();
    }
}

class M{
    public static void display(){
        System.out.println("Hi! I'm Rafi");
    }
}
