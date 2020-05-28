package multiThread;

public class Twoexample implements Runnable {
    @Override
    public void run(){
        System.out.println("This my  t3 thread");
    }

    public static void main(String Rafi[]){
        System.out.println("Downloading two files..");
        Thread t1 = new Thread(() -> {
            for(int i=0; i<=3; i++){
                System.out.println("Loading.. "+i*5+"%");
                try{
                    Thread.sleep(1200);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for(int i=0; i<=3; i++){
                System.out.println("Loading.. "+i*5+"%");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t2.start();
        Twoexample t3 = new Twoexample();
        Thread t4 = new Thread(t3);
        t4.start();
    }
}
