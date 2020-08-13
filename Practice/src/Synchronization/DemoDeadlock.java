package Synchronization;

public class DemoDeadlock {
    public static void main(String[]args){
        final String resource1 = "Rafi";
        final String resource2 = "Fahim";

        Thread t1 = new Thread(() -> {
           synchronized(resource1){
               System.out.println("Thread-1 lock: Resource1");
               try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
               synchronized(resource2){
                   System.out.println("Thread-1 lock: Resource2");
               }
           }
        });

        Thread t2 = new Thread(() -> {
           synchronized(resource2){
               System.out.println("Thread-2 lock: Resource2");
               try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
               synchronized(resource1){
                   System.out.println("Thread-2 lock: Resource1");
               }
           }
        });

        t1.start();
        t2.start();
    }
}
