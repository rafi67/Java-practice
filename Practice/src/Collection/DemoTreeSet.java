package Collection;

import java.util.*;

public class DemoTreeSet {
    private static void test() {
        TreeSet<Integer>set = new TreeSet<>();
        set.add(22);
        set.add(6);
        set.add(1);
        System.out.println("Traversing element with for each loop");
        for(int n:set){
            System.out.println(n);
        }
        set.clear();
    }

    private static void test2() {
        TreeSet<String>set = new TreeSet<>();
        set.add("Rafi");
        set.add("Fahim");
        set.add("Shafil");
        System.out.println("Traversing elements in ascending order");
        for(String s:set){
            System.out.println(s);
        }
        Iterator<String> itr = set.descendingIterator();
        System.out.println("Traversing elements in descending order");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        set.clear();
    }

    private static void test3() {
        TreeSet<Integer>set = new TreeSet<>();
        set.add(22);
        set.add(100);
        set.add(12);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println("Highest value is "+set.pollLast());
        System.out.println("Lowest value is "+set.pollFirst());
        for(int n:set){
            System.out.println(n);
        }
        set.clear();
    }

    private static void test4() {
        TreeSet<String>set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial set "+set);
        System.out.println("Reverse order "+set.descendingSet());
        System.out.println("HeadSet "+set.headSet("C", true));
        System.out.println("SubSet "+set.
                subSet("A", false, "E", true));
        System.out.println("TailSet "+set.tailSet("C", false));
        set.clear();
    }

    private static void test5() {
        Set<Library>set = new TreeSet<>();
        Library b1 = new Library(1, "Programming with Python");
        Library b2 = new Library(2, "Java Programming");
        Library b3 = new Library(3, "C++ Programming");
        Library b4 = new Library(4, "Web Design with Javascript");
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        for(Library b:set){
            System.out.println("Id:"+b.id+" Name of book is "+b.name);
        }
        set.clear();
    }

    private static void test6() {
        TreeSet<Book4>set = new TreeSet<>();
        Book4 b1 = new Book4(1, "Let us C");
        Book4 b2 = new Book4(2, "We are friends forever");
        Book4 b3 = new Book4(3, "Pure love");
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for(Book4 b:set){
            System.out.println("ID:"+b.id+" Name of the book is "+b.name);
        }
        set.clear();
    }

    public static void main(String... args) {
        test();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
}

class Library implements Comparable<Library> {
    int id;
    String name;
    Library(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Library l) {
        if(id>l.id) return 1;
        else if(id<l.id) return -1;
        else return 0;
    }
}

class Book4 implements Comparable<Book4>{
    int id;
    String name;
    Book4(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Book4 o) {
        if(id>o.id) return 1;
        else if(id<o.id) return -1;
        else return 0;
    }
}
