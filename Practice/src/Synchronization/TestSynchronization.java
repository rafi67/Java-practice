package Synchronization;

class Table2{
    synchronized public void printTable(int n){
        for(int i=1; i<=5; i++){
            System.out.println(n*i);
            try{Thread.sleep(400);}catch(Exception e){System.out.println(e);}
        }
    }
}

public class TestSynchronization {
    public static void main(String[]args){
        Table2 obj = new Table2();

        Thread t1 = new Thread(() -> obj.printTable(5));

        Thread t2 = new Thread(() -> obj.printTable(100));

        t1.start();
        t2.start();
    }
}