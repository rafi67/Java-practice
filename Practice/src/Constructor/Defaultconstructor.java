package Constructor;

public class Defaultconstructor {
    public static void main(String [] args){
        new Student();
    }
}

class Student{
    String Name;
    int roll;
    void display(){
        System.out.println(roll+" "+Name);
    }
    Student(){
        display();
    }
}
