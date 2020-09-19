package Collection;

import java.util.*;

public class DemoHashMap {
    private static void test() {
        HashMap<Integer,String>Customer = new HashMap<>();
        Customer.put(1, "Gaz");
        Customer.put(2, "John");
        Customer.put(3, "Alex");
        System.out.println(Customer.get(3));
        System.out.println(Customer.get(1));
        System.out.println(Customer.get(2));
        System.out.println("Traversing Hash Map");
        for(Map.Entry<Integer, String> m: Customer.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        Customer.clear();
    }

    private static void test2() {
        HashMap<Integer,String>map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Strawberry");
        map.put(1, "Milk");
        System.out.println("Traversing element of map");
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.clear();
    }

    private static void test3() {
        HashMap<Integer,String>map = new HashMap<>();
        System.out.println("Initial list of elements "+map);
        map.put(101, "Rafi");
        map.put(102, "Fosail");
        map.put(103, "Khaled");
        System.out.println("After invoking put() method");
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(104, "Amit");
        System.out.println("After invoking putIfAbsent() method");
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String>map2 = new HashMap<>();
        map2.put(105, "Jay");
        map2.putAll(map);
        System.out.println("After invoking putAll() method");
        for(Map.Entry<Integer,String> m:map2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.clear();
        map2.clear();
    }

    private static void test4() {
        HashMap<Integer,String>hm = new HashMap<>();
        hm.put(100, "BMW");
        hm.put(101, "Nissan");
        hm.put(102, "Toyota");
        hm.put(103, "Ferrari");
        System.out.println("Initial of hash map "+hm);
        hm.remove(100);
        System.out.println("Updated list of hash map "+hm);
        hm.remove(101);
        System.out.println("Updated list of hash map "+hm);
        hm.remove(103, "Ferrari");
        System.out.println("Updated list of hash map "+hm);
        hm.clear();
    }

    private static void test5() {
        HashMap<Integer,String>hm = new HashMap<>();
        hm.put(100, "Microsoft");
        hm.put(101, "Apple");
        hm.put(102, "Alphabet");
        hm.put(103, "Facebook");
        hm.put(104, "Amazon");
        hm.put(105, "Oracle");
        System.out.println("Initial list of elements");
        for(Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.replace(102, "Google");
        System.out.println("Updated list of hash map");
        for(Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.replace(105, "Oracle", "SunMicroSystem");
        System.out.println("Updated list of hash map");
        for(Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.replaceAll((k,v)-> "Apple");
        System.out.println("Updated list of hash map");
        for(Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.clear();
    }

    private static void test6() {
        Map<Integer, Book7>map = new HashMap<>();
        Book7 b1 = new Book7(1, "Programming with java");
        Book7 b2 = new Book7(2, "Let us C");
        Book7 b3 = new Book7(3, "We will be friends forever");
        map.put(100, b1);
        map.put(101, b2);
        map.put(102, b3);
        for(Map.Entry<Integer,Book7>m:map.entrySet()){
            int key = m.getKey();
            Book7 b = m.getValue();
            System.out.println(key+" Details:");
            System.out.println("ID:"+b.id+" name of the book is "+b.name);
        }
        map.clear();
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

class Book7 {
    int id;
    String name;
    Book7(int id, String name){
        this.id = id;
        this.name = name;
    }
}
