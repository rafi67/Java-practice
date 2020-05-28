package multiThread;

public class WithoutuisngExtend {
    public static void main(String Rafi[]){
        Thread t = new Thread(){
            public void run(){
                for(int i=0; i<6; i++){
                    try{
                        sleep(1200);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("Loading2.. "+i*10+"%");
                }
            }
        };
        t.start();
    }
}
