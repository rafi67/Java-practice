package JavaMemoryManagement;

public class Emp {
    int id;
    int salary;
    static String company;
    String ceo;

    static{
        company = "SAP";
        System.out.println(company);
    }

    void showInfo(){
        System.out.println(id+" : "+salary+" : "+company+" : "+ceo);
    }
}
