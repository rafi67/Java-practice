package JavaMemoryManagement.GarbageCollection;


public class DemoGarbageC {
    public static void main(String [] args){
        D e1 = new D();
        D e2 = new D();
        e1 = null;
        e2 = null;
        System.gc();
    }
}

class D extends Object{
    protected void finalize(){
        System.out.println("Object is garbage collected.");
    }
}