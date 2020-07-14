package SuperKeyword;

class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person{
    float Salary;
    Emp(int id, String name, float Salary ){
        super(id, name);
        this.Salary = Salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+Salary);
    }
}

public class TestSuper4 {
    public static void main(String [] args){
        Emp e = new Emp(1, "Ankit", 45000f);
        e.display();
    }
}
