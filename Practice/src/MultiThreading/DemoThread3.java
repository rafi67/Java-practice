package MultiThreading;

public class DemoThread3 extends Thread {
    @Override
    public void run() {
        for(int i=1; i<5; i++){
            try{Thread.sleep(500);} catch(InterruptedException e){System.out.println(e);}
                System.out.println(i);
        }
    }

    public static void main(String[]args){
        DemoThread3 d = new DemoThread3();
        DemoThread3 d2 = new DemoThread3();
        d.start();
        d2.start();
    }
}
