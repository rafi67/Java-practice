package Collection;

import java.util.*;

public class DemoComparable {
    private static void test1() {
        ArrayList<Student2>al = new ArrayList<>();
        al.add(new Student2(1, "Rafi", 23));
        al.add(new Student2(2, "Fahim", 22));
        al.add(new Student2(3, "Alif", 20));
        Collections.sort(al);
        for(Student2 s:al){
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
        al.clear();
    }

    private static void test2() {
        ArrayList<Student3>al = new ArrayList<>();
        al.add(new Student3(1, "Alamin", 18));
        al.add(new Student3(2, "Akas", 22));
        al.add(new Student3(3, "Opu", 25));
        Collections.sort(al);
        for(Student3 s:al){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        al.clear();
    }

    public static void main(String... args) {
        test1();
        test2();
    }
}

class Student3 implements Comparable<Student3> {
    int rollNo;
    String name;
    int age;
    public Student3(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student3 o) {
        if(age == o.age) return 0;
        else if(age<o.age) return 1;
        else return -1;
    }
}

class Student2 implements Comparable<Student2> {
    int rollno;
    String name;
    int age;
    public Student2(int rollno,String name,int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student2 o) {
        if(age == o.age) return 0;
        else if(age>o.age) return 1;
        else return -1;
    }
}
