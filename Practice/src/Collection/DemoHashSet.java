package Collection;

import java.util.*;

public class DemoHashSet {
    private static void test() {
        HashSet<String>set = new HashSet<>();
        set.add("Apple");
        set.add("Strawberry");
        set.add("Banana");
        System.out.println(set);
        Iterator<String>itr = set.iterator();
        System.out.println("Traversing set elements in forward direction");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        set.remove("Apple");
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }

    private static void test2() {
        HashSet<String>l = new HashSet<>();
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        l.add("Six");
        for(String s:l){
            System.out.println(s);
        }
        System.out.println("Using contains method");
        System.out.println(l.contains("One"));
        l.removeIf(str-> str.contains("One"));
        System.out.println("After using removeIf method");
        System.out.println(l);
        l.clear();
    }

    private static void test3() {
        ArrayList<String>list = new ArrayList<>();
        list.add("Shafil");
        list.add("Mim");
        list.add("Isha");
        HashSet<String>set = new HashSet<>(list);
        set.add("Mitu");
        for(String s:set){
            System.out.println(s);
        }
        list.clear();
        set.clear();
    }

    private static void test4() {
        Book2 b1 = new Book2(1, "Pure Love");
        Book2 b2 = new Book2(2, "We are friends forever");
        Set<Book2>set = new HashSet<>();
        set.add(b1);
        set.add(b2);
        for(Book2 b:set){
            System.out.println("ID:"+b.id+" Name: "+b.name);
        }
    }

    public static void main(String... args) {
        test();
        test2();
        test3();
        test4();
    }
}

class Book2 {
    int id;
    String name;
    Book2(int id, String name){
        this.id = id;
        this.name = name;
    }
}
