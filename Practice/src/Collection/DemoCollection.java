package Collection;

import java.util.*;

public class DemoCollection {
    private static void test1() {
        List<String>list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        System.out.println(list);
        Collections.addAll(list, "Python", "Java");
        System.out.println(list);
        String[]str = {"C#", "Swift", "Ruby"};
        Collections.addAll(list, str);
        System.out.println(list);
    }

    private static void test2() {
        List<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(200);
        list.add(3000);
        list.add(5000);
        list.add(10000);
        System.out.println("Maximum value of the list is "+Collections.max(list));
        System.out.println("Minimum value of the list is "+Collections.min(list));
    }

    public static void main(String... args) {
        test1();
        test2();
    }
}
