package Collection;

import java.util.*;

public class DemoArrayDequeue {
    private static void test() {
        Deque<String>deque = new ArrayDeque<>();
        deque.add("Rafi");
        deque.add("Fahim");
        deque.add("Shafil");
        System.out.println(deque);
        for(String s:deque){
            System.out.println(s);
        }
        deque.clear();
    }

    private static void test2() {
        Deque<String>deque = new ArrayDeque<>();
        deque.offer("Rezuan");
        deque.offer("Onamika");
        deque.offer("Pial");
        deque.add("Monira");
        deque.offerFirst("Akil");
        deque.pollFirst();
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        for(String s:deque){
            System.out.println(s);
        }
        deque.clear();
    }

    private static void test3() {
        Deque<Book6>deque = new ArrayDeque<>();
        Book6 b1 = new Book6(1, "We will be together forever");
        Book6 b2 = new Book6(2, "I see the World");
        Book6 b3 = new Book6(3, "Let us C");
        deque.add(b1);
        deque.add(b2);
        deque.add(b3);
        for(Book6 b:deque){
            System.out.println("ID:"+b.id+" name of the book is "+b.name);
        }
        deque.clear();
    }

    public static void main(String... args) {
        test();
        test2();
        test3();
    }
}

class Book6 {
    int id;
    String name;
    Book6(int id, String name){
        this.id = id;
        this.name = name;
    }
}
