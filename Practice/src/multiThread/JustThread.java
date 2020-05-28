package multiThread;

public class JustThread extends java.lang.Thread {
    public void run(){
        System.out.println("Testing multi threading");
        System.out.println("JustThread is running");
    }

    public static void main(String Rafi[]){
        JustThread t = new JustThread();
        t.start();
    }
}
