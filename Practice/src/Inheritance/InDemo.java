package Inheritance;

public class InDemo {
    public static void main(String [] args){
        Employee e = new Employee();
        System.out.println("Manager salary is "+e.salary);
        System.out.println("Employee id is "+e.id);
        System.out.println("Employee salary is "+e.emsalary);
    }
}

class Manager{
    int salary = 51000;
}

class Employee extends Manager{
    int emsalary = 30000;
    int id = 13;
}
