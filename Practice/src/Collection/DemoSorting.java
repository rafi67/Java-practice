package Collection;

import java.util.*;

public class DemoSorting {
    private static void test1() {
        ArrayList<String>al = new ArrayList<>();
        al.add("Rafi");
        al.add("Fahim");
        al.add("Shafil");
        Collections.sort(al);
        for(String s:al){
            System.out.println(s);
        }
        al.clear();
    }

    private static void test2() {
        ArrayList<String>al = new ArrayList<>();
        al.add("Alif");
        al.add("Shafi");
        al.add("Nazmul");
        al.sort(Collections.reverseOrder());
        for(String s:al){
            System.out.println(s);
        }
        al.clear();
    }

    private static void test3() {
        ArrayList al = new ArrayList();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(101));
        al.add(203);
        Collections.sort(al);
        for(Object n:al){
            System.out.println(n);
        }
        al.clear();
    }

    private static void test4() {
        ArrayList<Student1>al = new ArrayList<>();
        al.add(new Student1("Shafil"));
        al.add(new Student1("Anis"));
        al.add(new Student1("Bithisa"));
        Collections.sort(al);
        for(Student1 s:al){
            System.out.println(s);
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

class Student1 implements Comparable<Student1>{
    public String name;
    public Student1(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Student1 person) {
        return name.compareTo(person.name);
    }
}
