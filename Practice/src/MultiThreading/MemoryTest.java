package MultiThreading;

public class MemoryTest {
    public static void main(String[]args){
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory is "+r.totalMemory());
        System.out.println("Free memory is "+r.freeMemory());
        for(int i=0; i<10000; i++){
            new MemoryTest();
        }
        System.out.println("After creating 10000 instance free memory is "+r.freeMemory());
        System.gc();
        System.out.println("After using GC method free memory is "+r.freeMemory());
    }
}
