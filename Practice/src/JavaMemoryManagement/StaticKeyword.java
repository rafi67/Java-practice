package JavaMemoryManagement;

public class StaticKeyword {
    public static void main(String [] args){
        Employees e1 = new Employees(25, 30000);
        Employees e2 = new Employees(30, 50000);
        e1.display();
        e2.display();
        System.out.println(e1.company);
        System.out.println(e2.company);
    }
}
