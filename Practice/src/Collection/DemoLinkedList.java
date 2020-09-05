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

    private static void test3() {
        LinkedList<String>list = new LinkedList<>();
        list.add("Rezuan");
        list.add("Rafi");
        list.add("Shafil");
        list.add("Fahim");
        System.out.println(list);
        list.removeFirstOccurrence("Rezuan");
        System.out.println(list);
        list.removeLastOccurrence("Fahim");
        System.out.println(list);
        LinkedList<String>list2 = new LinkedList<>();
        list2.add("Faria");
        list.addAll(1,list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        list.clear();
        list2.clear();
    }

    private static void test4() {
        LinkedList<String>list = new LinkedList<>();
        list.add("Rafi");
        list.add("Fahim");
        list.add("Shafil");
        list.add("Rezuan");
        list.add("Shakil");
        list.add("Shamim");
        Iterator itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list);
        list.clear();
    }

    public static void main(String... args) {
        test();
        test2();
        test3();
        test4();
    }
}
