package Collection;

import java.util.*;

public class DemoTreeMap {
    private static void test1() {
        TreeMap<Integer,String>tm = new TreeMap<>();
        tm.put(1, "Fahim");
        tm.put(2, "Rafi");
        tm.put(3, "Shafil");
        for(Map.Entry<Integer,String>m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        tm.clear();
    }

    private static void test2() {
        TreeMap<Integer,String>tm = new TreeMap<>();
        tm.put(1, "Foishal");
        tm.put(2, "Riyad");
        tm.put(3, "Hamid");
        System.out.println("Before invoking remove method");
        for(Map.Entry<Integer,String>m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        tm.remove(3);
        System.out.println("After invoking remove method");
        for(Map.Entry<Integer,String>m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        tm.clear();
    }

    private static void test3() {
        NavigableMap<Integer,String>map = new TreeMap<>();
        map.put(1, "Alamin");
        map.put(2, "Akash");
        map.put(3, "Munna");
        map.put(4, "Pranto");
        System.out.println("descending Map: "+map.descendingMap());
        System.out.println("headMap: "+map.headMap(2, true));
        System.out.println("tailMap: "+map.tailMap(2, true));
        System.out.println("subMap: "+map.subMap(1, false, 3, true));
    }

    private static void test4() {
        SortedMap<Integer,String>map = new TreeMap<>();
        map.put(1, "Sayeem");
        map.put(2, "Alif");
        map.put(3, "Mizan");
        map.put(4, "Oli");
        System.out.println("headMap: "+map.headMap(2));
        System.out.println("tailMap: "+map.tailMap(2));
        System.out.println("subMap: "+map.subMap(1,3));
    }

    private static void test5() {
        Map<Integer,Book7>map = new TreeMap<>();
        Book7 b1 = new Book7(1, "We will remain forever");
        Book7 b2 = new Book7(2, "I will wait for you forever");
        Book7 b3 = new Book7(3, "This Country needs you");
        map.put(100, b1);
        map.put(101, b2);
        map.put(102, b3);
        for(Map.Entry<Integer,Book7>m:map.entrySet()){
            Book7 b = m.getValue();
            System.out.println("Details of "+m.getKey()+":");
            System.out.println(b.id+" "+b.name);
        }
        map.clear();
    }

    public static void main(String... args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }
}
