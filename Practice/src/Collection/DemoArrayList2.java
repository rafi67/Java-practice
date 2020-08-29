package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList2 {
    private static void arrayList() {
        ArrayList<String>list = new ArrayList<>();
        list.add("Shafil");
        list.add("Rafi");
        list.add("Mahin");
        ListIterator<String>litr = list.listIterator(list.size());
        System.out.println("Traversing list using list iterator");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }

    private static void arrayList2() {
        ArrayList<String>list = new ArrayList<>();
        list.add("Rafi");
        list.add("Mahin");
        list.add("Shafil");
        System.out.println("Traversing list using for loop");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    private static void arrayList3() {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(100);
        System.out.println("Traversing list using foreach methode:");
        list.forEach(a->System.out.println(a));
    }

    private static void arrayList4() {
        ArrayList<String>list = new ArrayList<>();
        list.add("Rezuan");
        list.add("Shahed");
        list.add("Likhon");
        System.out.println("Traversing using forEachRemaining method");
        Iterator<String>itr = list.iterator();
        itr.forEachRemaining(System.out::println);
    }

    private static void arrayList5() {
        Student s1 = new Student(11, "Likhon", 20);
        Student s2 = new Student(12, "Rezuan", 23);
        Student s3 = new Student(13, "Shahed", 22);
        ArrayList<Student>list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for(Student s:list){
            System.out.println("Roll: "+s.roll+" Name: "+s.name+" Age: "+s.age);
        }
    }

    private static void arrayList6() {
        ArrayList<String>list = new ArrayList<>();
        list.add("Rafi");
        list.add("Ashraful");
        list.add("Sharif");

        System.out.println("Serializing array list..");
        try{
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            System.out.println("Deserializing array list..");
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list2 = (ArrayList) ois.readObject();
            System.out.println(list2);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String... args) {
        arrayList();
        arrayList2();
        arrayList3();
        arrayList4();
        arrayList5();
        arrayList6();
    }
}

class Student {
    int roll;
    String name;
    int age;
    Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
}
