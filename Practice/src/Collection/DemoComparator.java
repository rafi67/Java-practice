package Collection;

import java.util.*;

public class DemoComparator {
    private static void test1() {
        ArrayList al = new ArrayList();
        al.add(new Student4(1, "Rafi", 23));
        al.add(new Student4(2, "Fahim", 22));
        al.add(new Student4(3, "Alif", 20));
        System.out.println("Sorting by name");
        Collections.sort(al, new NameComparator());
        for(Object o:al){
            Student4 s = (Student4) o;
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        System.out.println("Sorting by age");
        Collections.sort(al, new AgeComparator());
        for(Object o:al){
            Student4 s = (Student4) o;
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        al.clear();
    }

    private static void test2() {
        ArrayList<Student4>al = new ArrayList<>();
        al.add(new Student4(1, "Alamin", 19));
        al.add(new Student4(2, "Pial", 22));
        al.add(new Student4(3, "Alif", 25));
        System.out.println("Sorting by name");
        Collections.sort(al, new NameComparator2());
        for(Student4 s:al){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        System.out.println("Sorting by age");
        Collections.sort(al, new AgeComparator2());
        for(Student4 s:al){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        al.clear();
    }

    private static void test3() {
        ArrayList<Student4>al = new ArrayList<>();
        al.add(new Student4(100, "Sharif", 20));
        al.add(new Student4(101, "Aslam", 21));
        al.add(new Student4(102, "Nahian", 22));
        Comparator<Student4>cm1 = Comparator.comparing(Student4::getName);
        System.out.println("Sorting by name");
        Collections.sort(al, cm1);
        for(Student4 s:al){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        Comparator<Student4>cm2 = Comparator.comparing(Student4::getAge);
        System.out.println("Sorting by age");
        Collections.sort(al, cm2);
        for(Student4 s:al){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        al.clear();
    }

    private static void test4() {
        ArrayList<Student4>al = new ArrayList<>();
        al.add(new Student4(200, "Joye", 19));
        al.add(new Student4(201, null, 18));
        al.add(new Student4(203, "Mysha", 17));
        Comparator<Student4>cm1 = Comparator.comparing(Student4::getName,
                Comparator.nullsFirst(String::compareTo));
        System.out.println("Considering null as a less value than non-null");
        Collections.sort(al, cm1);
        for(Student4 s:al){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        Comparator<Student4>cm2 = Comparator.comparing(Student4::getName,
                Comparator.nullsLast(String::compareTo));
        System.out.println("Considering null value as greater than non-null value");
        Collections.sort(al, cm2);
        for(Student4 s:al){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
        al.clear();
    }

    public static void main(String... args) {
        test1();
        test2();
        test3();
        test4();
    }
}

class Student4 {
    int rollNo;
    String name;
    int age;
    public Student4(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class AgeComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student4 s1 = (Student4) o1;
        Student4 s2 = (Student4) o2;
        if(s1.age == s2.age) return 0;
        else if(s1.age>s2.age) return 1;
        else return 0;
    }
}

class NameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student4 s1 = (Student4) o1;
        Student4 s2 = (Student4) o2;
        return s1.name.compareTo(s2.name);
    }
}

class NameComparator2 implements Comparator<Student4> {
    @Override
    public int compare(Student4 o1, Student4 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeComparator2 implements Comparator<Student4> {
    @Override
    public int compare(Student4 o1, Student4 o2) {
        if(o1.age==o2.age) return 0;
        else if(o1.age>o2.age) return 1;
        else return -1;
    }
}