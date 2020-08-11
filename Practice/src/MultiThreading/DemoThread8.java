package MultiThreading;

public class DemoThread8 extends Thread {
    @Override
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[]args){
        DemoThread8 d1 = new DemoThread8();
        DemoThread8 d2 = new DemoThread8();
        System.out.println("Name of d1 is "+d1.getName());
        System.out.println("Name of d2 is "+d2.getName());
        System.out.println("ID of d1 is "+d1.getId());
        d1.start();
        d2.start();
        d1.setName("Rafi");
        System.out.println("After changing d1 name "+d1.getName());
    }
}
