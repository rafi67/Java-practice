package multiThread;

/*class MyTask{
    void executeTask(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("@@ Printing Document #"+doc+" - Printer2");
        }
    }
}*/

/*class MyTask extends Thread{
    @Override
    public void run(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("@@ Printing Document #"+doc+" - Printer2");
        }
    }
}*/

class CA{}

class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("@@ Printing Document #"+doc+" - Printer2");
        }
    }
}

class YourTask implements Runnable{
    @Override
    public void run(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("** Printing Document #"+doc+" - Printer3");
        }
    }
}

public class App {
    public static void main(String Rafi[]){
        System.out.println("==Application Started==");
       // MyTask task = new MyTask();
        //task.executeTask();
       // task.start();
        Runnable r = new MyTask();
        Thread t = new Thread(r);
        t.setDaemon(true);
        t.start();
        //Thread yourtask = new Thread(new YourTask());
        //yourtask.start();
        new Thread(new YourTask()).start();
        for(int doc=1; doc<=10; doc++){
            System.out.println("Printing Document #"+doc+" - Printer1");
        }
        System.out.println("==Application Finished==");
    }
}
