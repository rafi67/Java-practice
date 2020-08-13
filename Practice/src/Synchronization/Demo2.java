package Synchronization;

class Table3{
    void printTable(int n){
        synchronized (this){
            for(int i=1; i<=5; i++){
                System.out.println(n*i);
                try{Thread.sleep(400);}catch(Exception e){System.out.println(e);}
            }
        }
    }
}

public class Demo2 {
    public static void main(String[]args){
        Table3 obj = new Table3();
        Thread t1 = new Thread(() -> obj.printTable(5));
        Thread t2 = new Thread(() -> obj.printTable(100));
        t1.start();
        t2.start();
    }
}
