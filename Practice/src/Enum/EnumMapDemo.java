package Enum;

import java.util.EnumMap;

public class EnumMapDemo {
    enum Month{
        Jan, Feb, Mar
    }

    public static void main(String Rafi []){
        EnumMap<Month, Integer> enumMap = new EnumMap<Month, Integer>(Month.class);
        enumMap.put(Month.Jan, 100);
        enumMap.put(Month.Feb, 200);
        enumMap.put(Month.Mar, 300);
        System.out.println(enumMap);
    }
}
