package multiThread;

public class SyncApp {
    public static void main(String Rafi[]){
        System.out.println("==Application Started==");
        Printer printer = new Printer();
        MyThread mRef = new MyThread(printer);
        mRef.start();
        YourThread yRef = new YourThread(printer);
        yRef.start();
        //printer.printDocument(10, "Rafi'sProfile.pdf");
        System.out.println("==Application Finished==");
    }
}

class YourThread extends Thread{
    Printer mRef;
    YourThread(Printer p){
        mRef = p;
    }

    @Override
    public void run() {
        mRef.printDocument(10, "Dighi'sProfile.pdf");
    }
}

class MyThread extends Thread{

    Printer pRef;

    MyThread(Printer p){
        pRef=p;
    }

    @Override
    public void run() {
        synchronized (pRef){
            pRef.printDocument(10, "Mysha'sProfile.pdf");
        }
    }
}

class Printer{
    //synchronized void printDocument(int numOfCopies, String docName){
        void printDocument(int numOfCopies, String docName){
        for(int i=0; i<numOfCopies; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">> Printing "+docName+" "+i);
        }
    }
}
