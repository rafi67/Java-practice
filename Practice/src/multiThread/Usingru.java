package multiThread;

import static java.lang.Thread.sleep;

public class Usingru implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<11; i++){
            try{
                sleep(1200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Loading.. "+i*10+"%");
        }
    }

    public static void main(String Rafi[]){
        Usingru ur = new Usingru();
        Thread t = new Thread(ur);
        t.start();
    }
}
