package Inheritance;

public class HierarchicalIn {
    public static void main(String [] args){
        G g = new G();
        g.Display();
        g.Display3();
    }
}

class E {
    public void Display(){
        System.out.println("Class E");
    }
}

class F extends E{
    public void Display2() {
        System.out.println("This is class F");
    }
}

class G extends E{
    public void Display3() {
        System.out.println("This is Class G");
    }
}
