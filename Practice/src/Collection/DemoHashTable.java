package Collection;

import java.util.*;

public class DemoHashTable {
    private static void test1() {
        Hashtable<Integer,String>ht = new Hashtable<>();
        ht.put(1, "Rafi");
        ht.put(2, "Fahim");
        ht.put(3, "Shafil");
        for(Map.Entry<Integer,String>m:ht.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        ht.clear();
    }

    private static void test2() {
        Hashtable<Integer,String>ht = new Hashtable<>();
        ht.put(100, "Alif");
        ht.put(101, "Oli");
        ht.put(102, "Nayeem");
        ht.put(103, "Adnan");
        System.out.println("Before using remove method "+ht);
        ht.remove(103);
        System.out.println("After using remove method "+ht);
        ht.clear();
    }

    private static void test3() {
        Hashtable<Integer,String>ht = new Hashtable<>();
        ht.put(200, "Raihan");
        ht.put(201, "Utsha");
        ht.put(202, "Abir");
        ht.put(203, "Ontor");
        System.out.println(ht.getOrDefault(100, "NotFound"));
        System.out.println(ht.getOrDefault(200, "NotFound"));
        ht.clear();
    }

    private static void test4() {
        Hashtable<Integer,String>ht = new Hashtable<>();
        ht.put(300, "Asif");
        ht.put(301, "Roni");
        ht.put(302, "Pranto");
        ht.put(303, "Limon");
        ht.put(304, "Kanon");
        System.out.println("Initial map: "+ht);
        ht.putIfAbsent(305, "Sazzad");
        System.out.println("Updated Map: "+ht);
        ht.clear();
    }

    private static void test5() {
        Hashtable<Integer,Book7>map = new Hashtable<>();
        Book7 b1 = new Book7(1, "Pure Love");
        Book7 b2 = new Book7(2, "The Beauty and the Beast");
        Book7 b3 = new Book7(3, "I'm the One");
        map.put(500,b1);
        map.put(501,b2);
        map.put(502,b3);
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
