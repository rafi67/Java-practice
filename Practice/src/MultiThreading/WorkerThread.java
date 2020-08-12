package MultiThreading;

import java.util.concurrent.*;

public class WorkerThread implements Runnable {

    private final String message;
    public WorkerThread(String s){
        this.message = s;
    }

    public void processmessage(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" message = "+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }

    public static void main(String[]args){
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=0; i<10; i++){
            Runnable worker = new WorkerThread(""+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){}
        System.out.println("Finished All Threads");
    }
}