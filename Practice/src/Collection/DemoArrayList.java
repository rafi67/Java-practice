package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {
    private static void arrayList2() {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        list.remove(0);

        for(int i:list){
            System.out.println(i);
        }
        list.removeAll(list);
        System.out.println(list);
    }

    private static void arrayList() {
        ArrayList<String>list = new ArrayList<>();
        list.add("Rafi");
        list.add("Fahim");
        list.add("Shafil");
        for(String l:list){
            System.out.println(l);
        }
        System.out.println("Rafi is in the list: "+list.contains("Rafi"));
        System.out.println("Index of Rafi: "+list.indexOf("Rafi"));
        System.out.println("Size of arraylist is "+list.size());
        list.set(2, "Mahin");
        System.out.println(list.get(2));
        list.clear();
        System.out.println("After clearing the list:");
        System.out.println(list);
        System.out.println("ArrayList empty: "+list.isEmpty());
    }

    private static void arrayList3() {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list2.addAll(list);
        for(int i:list2){
            System.out.println(i);
        }
        System.out.println("list = list2: "+list.equals(list2));
    }

    private static void sortingArrayList() {
        ArrayList<Integer>l = new ArrayList<>();
        l.add(20);
        l.add(-1);
        l.add(60);
        l.add(80);
        l.add(30);
        l.add(90);
        System.out.println("Before sorting "+l);
        Collections.sort(l);
        System.out.println("After sorting in ascending order: "+l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("After sorting in descending order: "+l);
    }

    public static void main(String... args) {
        arrayList();
        arrayList2();
        arrayList3();
        sortingArrayList();
    }
}
