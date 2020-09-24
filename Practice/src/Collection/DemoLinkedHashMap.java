package Collection;

import java.util.*;

public class DemoLinkedHashMap {
    private static void test1() {
        LinkedHashMap<Integer,String>lhm = new LinkedHashMap<>();
        lhm.put(100, "Rafi");
        lhm.put(101, "Shafil");
        lhm.put(102, "Fahim");
        for(Map.Entry<Integer,String>map : lhm.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }

    private static void test2() {
        LinkedHashMap<Integer,String>lm = new LinkedHashMap<>();
        lm.put(100, "Alamin");
        lm.put(101, "Olid");
        lm.put(102, "Mim");
        System.out.println("Keys: "+lm.keySet());
        System.out.println("Values: "+lm.values());
        System.out.println("Key-Value pairs: "+lm.entrySet());
    }

    private static void test3() {
        LinkedHashMap<Integer,String>lm = new LinkedHashMap<>();
        lm.put(100, "Roy");
        lm.put(101, "Scott");
        lm.put(102, "Michle");
        System.out.println("Before invoking remove method "+lm);
        lm.remove(101);
        System.out.println("After invoking remove method "+lm);
    }

    private static void test4() {
        LinkedHashMap<Integer,Book7>lm = new LinkedHashMap<>();
        Book7 b1 = new Book7(1, "New Dawn");
        Book7 b2 = new Book7(2, "She's waiting for me");
        Book7 b3 = new Book7(3, "I'm living for her");
        lm.put(101, b1);
        lm.put(102, b2);
        lm.put(103, b3);
        for(Map.Entry<Integer,Book7>m:lm.entrySet()){
            Book7 b = m.getValue();
            int n = m.getKey();
            System.out.println("Details of "+n+":");
            System.out.println(b.id+" "+b.name);
        }
    }

    public static void main(String... args) {
        test1();
        test2();
        test3();
        test4();
    }
}
