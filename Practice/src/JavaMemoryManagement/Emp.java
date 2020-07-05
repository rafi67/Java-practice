package JavaMemoryManagement;

public class Emp {
    int id;
    int salary;
    static String company; //static
    String ceo; //non static

    void showInfo(){
        System.out.println(id+" : "+salary+" : "+company+" : "+ceo);
    }
}
