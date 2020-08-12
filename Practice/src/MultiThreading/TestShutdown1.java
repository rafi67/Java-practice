package MultiThreading;

public class TestShutdown1 {
    public static void main(String[]args){
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new Thread(() -> System.out.println("add shutdown hook completed")));
        System.out.println("Now main sleeping...");
        try{Thread.sleep(3000);}catch(Exception e){e.printStackTrace();}
    }
}