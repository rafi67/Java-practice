package MultiThreading;

public class DemoThread7 extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            try{Thread.sleep(500);}catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String[]args){
        DemoThread7 d1 = new DemoThread7();
        DemoThread7 d2 = new DemoThread7();
        DemoThread7 d3 = new DemoThread7();
        d1.start();
        try{
            d1.join(1500);
        }catch(Exception e){
            System.out.println(e);
        }
        d2.start();
        d3.start();
    }
}
