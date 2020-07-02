package Constructor.ConstructorChaining;

public class Student {
    public String sName;
    public int sMarks;
    public Student(){
        this("Rafi");
    }

    public Student(String name){
        this(name, 70);
    }

    public Student(String name, int marks){
        this.sName = name;
        this.sMarks = marks;
    }

    void display(){
        System.out.println("Student Name "+sName);
        System.out.println("Student Marks "+sMarks);
    }

   public static void main(String [] args){
        Student s1 = new Student();
        s1.display();
   }
}
