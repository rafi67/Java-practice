package Collection;

import java.util.*;

public class DemoLinkedList {
    private static void test() {
        LinkedList<String>l = new LinkedList<>();
        l.add("Rafi");
        l.add("Shafil");
        l.add("Fahim");
        l.addFirst("Shale");
        l.addLast("Fa");
        for(String s:l){
            System.out.println(s);
        }
    }

    public static void main(String... args) {
        test();
    }
}
