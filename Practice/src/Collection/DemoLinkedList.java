package Collection;

import java.util.*;

public class DemoLinkedList {
    private static void test() {
        LinkedList<String>l = new LinkedList<>();
        l.add("Rafi");
        l.add("Shafil");
        l.add("Fahim");
        l.removeFirst();
        l.removeLast();
        System.out.println("First element of list is "+l.getFirst());
        for(String s:l){
            System.out.println(s);
        }
        l.clear();
        System.out.println(l);
    }

    private static void test2() {
        LinkedList<String>list = new LinkedList<>();
        list.addFirst("Faria");
        list.addLast("Fahim");
        System.out.println("last element of list is "+list.getLast());
        for(String s:list){
            System.out.println(s);
        }
        list.clear();
        System.out.println(list);
    }

    public static void main(String... args) {
        test();
        test2();
    }
}
