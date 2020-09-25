package Collection;

import java.util.*;

public class DemoEnumMap {

    public enum Key{
        ONE, TWO, THREE
    }

    private static void test1() {
        EnumMap<days,Integer>map = new EnumMap<>(days.class);
        map.put(days.SATURDAY, 1);
        map.put(days.SUNDAY, 2);
        map.put(days.MONDAY, 3);
        map.put(days.TUESDAY, 4);
        map.put(days.WEDNESDAY, 5);
        map.put(days.THURSDAY, 6);
        map.put(days.FRIDAY, 7);
        for(Map.Entry<days,Integer>m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.clear();
    }

    private static void test2() {
        EnumMap<Key,Book7>map = new EnumMap<>(Key.class);
        Book7 b1 = new Book7(100, "Operating System");
        Book7 b2 = new Book7(101, "Computer Science");
        Book7 b3 = new Book7(102, "Linux Kernal");
        map.put(Key.ONE, b1);
        map.put(Key.TWO, b2);
        map.put(Key.THREE, b3);
        for(Map.Entry<Key,Book7>m:map.entrySet()){
            Book7 b = m.getValue();
            System.out.println(m.getKey()+" "+b.name);
        }
    }

    public static void main(String... args) {
        test1();
        test2();
    }
}