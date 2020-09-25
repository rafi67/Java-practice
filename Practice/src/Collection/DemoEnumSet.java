package Collection;

import java.util.*;

enum days{
    SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
}

public class DemoEnumSet {
    private static void test1() {
        Set<days>set = EnumSet.of(
                days.SATURDAY,
                days.SUNDAY,
                days.MONDAY,
                days.TUESDAY,
                days.WEDNESDAY,
                days.THURSDAY,
                days.FRIDAY
        );
        for(days s:set){
            System.out.println(s);
        }
    }

    private static void test2() {
        Set<days>set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:"+set1);
        Set<days>set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+set2);
    }

    public static void main(String... args) {
        test1();
        test2();
    }
}
