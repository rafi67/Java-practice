package JavaMemoryManagement;

public class Employees {
    int id, salary;
    static String company = "SRT Traders";
    Employees(int i, int s){
        id = i;
        salary = s;
    }

    void display(){
        System.out.println("Employees id is "+id);
        System.out.println("Employees salary is "+salary);
        System.out.println("Company name is "+company);
    }
}
