package Collection;

import java.util.*;

public class DemoPriorityQueue {
    private static void test() {
        PriorityQueue<String>queue = new PriorityQueue<>();
        queue.add("Rafi");
        queue.add("Fahim");
        queue.add("Shafil");
        System.out.println(queue);
        System.out.println("Head:"+queue.element());
        System.out.println("Head:"+queue.peek());
        for(String s:queue){
            System.out.println(s);
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two element");
        for(String s:queue){
            System.out.println(s);
        }
        queue.clear();
    }

    private static void test2() {
        PriorityQueue<Book5>queue = new PriorityQueue<>();
        Book5 b1 = new Book5(1, "Programming with Python");
        Book5 b2 = new Book5(2, "C++ Programming");
        Book5 b3 = new Book5(3, "Let us C");
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        for(Book5 b:queue){
            System.out.println("ID:"+b.id+" Name of the book is "+b.name);
        }
        queue.clear();
    }

    public static void main(String... args) {
        test();
        test2();
    }
}

class Book5 implements Comparable<Book5> {
    int id;
    String name;
    Book5(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Book5 o) {
        if(id>o.id) return 1;
        else if(id<o.id) return -1;
        else return 0;
    }
}
