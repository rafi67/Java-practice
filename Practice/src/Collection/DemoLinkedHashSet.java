package Collection;

import java.util.*;

public class DemoLinkedHashSet {
    private static void test() {
        LinkedHashSet<String>set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        for(String s:set){
            System.out.println(s);
        }
        set.clear();
    }

    private static void test2() {
        Set<String>set = new LinkedHashSet<>();
        System.out.println("Avoiding duplicate element");
        set.add("Rafi");
        set.add("Shafil");
        set.add("Shafil");
        for(String s:set){
            System.out.println(s);
        }
        set.clear();
    }

    private static void test3() {
        Set<Book3>set = new LinkedHashSet<>();
        Book3 b1 = new Book3(1, "Web Mastering");
        Book3 b2 = new Book3(2, "DownTown");
        set.add(b1);
        set.add(b2);
        for(Book3 b:set){
            System.out.println("Id is "+b.id+" and name of the book is "+b.name);
        }
        set.clear();
    }

    public static void main(String... args) {
        test();
        test2();
        test3();
    }
}

class Book3 {
    int id;
    String name;
    Book3(int id, String name){
        this.id = id;
        this.name = name;
    }
}
