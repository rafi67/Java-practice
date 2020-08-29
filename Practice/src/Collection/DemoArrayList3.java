package Collection;

import java.util.ArrayList;

public class DemoArrayList3 {
    private static void test() {
        ArrayList<String>l = new ArrayList<>();
        l.add("Rafi");
        l.add("Shafil");
        l.add("Fahim");
        ArrayList<String>l2 = new ArrayList<>();
        l2.add("Dip");
        l2.add("Ismail");
        l2.add("Rafi");
        l.retainAll(l2);
        for(String s:l){
            System.out.println(s);
        }
    }

    public static void main(String... args) {
        test();
    }
}
