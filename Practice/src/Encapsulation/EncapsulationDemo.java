package Encapsulation;

class Employee1{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String [] args){
        Employee1 e1 = new Employee1();
        e1.setName("Shafil");
        System.out.println(e1.getName());
        System.out.println(e1 instanceof Employee1);
    }
}
