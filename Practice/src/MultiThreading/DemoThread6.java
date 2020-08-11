package MultiThreading;

public class DemoThread6 extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            try{Thread.sleep(500);}catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String[]args){
        DemoThread6 d1 = new DemoThread6();
        DemoThread6 d2 = new DemoThread6();
        DemoThread6 d3 = new DemoThread6();
        d1.start();
        try{
            d1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        d2.start();
        d3.start();
    }
}
