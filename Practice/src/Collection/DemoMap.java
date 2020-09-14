package Collection;

import java.util.*;

public class DemoMap {
    private static void test() {
        Map map = new HashMap();
        map.put(1, "Rafi");
        map.put(2, "Fahim");
        map.put(3, "Shafil");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.clear();
        set.clear();
    }

    private static void test2() {
       Map<Integer,String>map = new HashMap<>();
       map.put(1, "Rezuan");
       map.put(2, "Foisal");
       map.put(3, "Pial");
       for(Map.Entry m:map.entrySet()){
           System.out.println(m.getKey()+" "+m.getValue());
       }
       map.clear();
    }

    private static void test3() {
        Map<Integer,String>map = new HashMap<>();
        map.put(1, "Foisal");
        map.put(2, "Borsha");
        map.put(3, "Alamin");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        map.clear();
    }

    private static void test4() {
        Map<Integer,String>map = new HashMap<>();
        map.put(1, "Oli");
        map.put(2, "Anika");
        map.put(3, "Sharif");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
        map.clear();
    }

    private static void test5() {
        Map<Integer,String>map = new HashMap<>();
        map.put(1, "Rafi");
        map.put(2, "Fahim");
        map.put(3, "Alif");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        map.clear();
    }

    private static void test6() {
        Map<Integer,String>map = new HashMap<>();
        map.put(1, "Alif");
        map.put(2, "Fahim");
        map.put(3, "Rafi");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
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
