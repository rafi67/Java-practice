package Collection;

import java.util.*;
import java.util.stream.Stream;

public class DemoVector extends Vector {
    private static void test1() {
        Vector<String>vl = new Vector<>();
        vl.add("Utpol");
        vl.add("Fahad");
        vl.addElement("Alif");
        vl.addElement("Pial");
        vl.addElement("Rafi");
        vl.addElement("Fahad");
        vl.addElement("Fahim");
        Enumeration<String>e = vl.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        vl.clear();
    }

    private static void test2() {
        Vector<String>vl = new Vector<>();
        vl.add("Shamon");
        vl.add("Tamim");
        vl.add("Siam");
        vl.add("Rinkon");
        vl.add("Biplop");
        System.out.println("Output of test2 method");
        System.out.println("Size of vector is "+vl.size());
        System.out.println("Default capacity of vector is "+vl.capacity());
        System.out.println("Vector element is:"+vl);
        vl.add("Alamin");
        vl.add("Shamim");
        vl.add("Shadhin");
        vl.add("Shuvo");
        System.out.println("After Addition size of the vector is "+vl.size());
        if(vl.contains("Shadhin")) System.out.println("Shadhin present index is "+vl.
                indexOf("Shadhiin"));
        else System.out.println("Shadhin isn't in the vector");
        System.out.println("First element of vector is "+vl.firstElement());
        System.out.println("Last element of vector is "+vl.lastElement());
        vl.forEach(System.out::println);
        vl.clear();
    }

    private static void test3() {
        Vector<Integer>vl = new Vector<>();
        vl.add(100);
        vl.add(200);
        vl.add(300);
        vl.add(400);
        vl.add(500);
        vl.add(600);
        vl.add(700);
        System.out.println("Element of vector is "+vl);
        System.out.println("200 from the vector "+vl.remove((Integer)200));
        System.out.println("After removing 200 the element of vector is "+vl);
        System.out.println("Removing index 4 element "+vl.remove(4));
        System.out.println("After removing index 4 element of the vector is "+vl);
        System.out.println("Size of the vector is "+vl.size());
        vl.removeElementAt(4);
        System.out.println("Vector element after removal "+vl);
        System.out.println("Hash Code of this vector is "+vl.hashCode());
        System.out.println("Element of index 1 is "+vl.get(1));
        vl.clear();
    }

    private static void test4() {
        Vector<Integer>vl = new Vector<>();
        vl.add(1);
        vl.add(2);
        vl.add(3);
        vl.add(4);
        vl.forEach(System.out::println);
        Vector<Integer>vl2 = (Vector<Integer>) vl.clone();
        vl2.forEach(System.out::println);
        vl.clear();
    }

    private static void test5() {
        Vector<Integer>vl = new Vector<>();
        vl.add(1);
        vl.add(2);
        vl.add(3);
        vl.add(4);
        vl.add(5);
        Integer[]arr = new Integer[5];
        vl.copyInto(arr);
        for(Integer n:arr){
            System.out.println(n);
        }
        vl.clear();
    }

    private static void test6() {
        Vector<Integer>vl = new Vector<>(5);
        vl.ensureCapacity(25);
        System.out.println("Capacity of vector is "+vl.capacity());
    }

    private static void test7() {
        Vector<Integer>vl = new Vector<>();
        vl.add(11);
        vl.add(22);
        vl.add(33);
        vl.add(44);
        Enumeration<Integer>enObj = vl.elements();
        while(enObj.hasMoreElements()){
            System.out.println(enObj.nextElement());
        }
        vl.clear();
    }

    private static void test8() {
        Vector<Integer>vl = new Vector<>();
        vl.add(1);
        vl.add(2);
        vl.add(3);
        vl.add(4);
        vl.add(5);
        System.out.println("Element of 1 is "+vl.elementAt(1));
        System.out.println("Element of 3 is "+vl.elementAt(3));
        vl.clear();
    }

    private static void test9() {
        Vector<Integer>vl = new Vector<>();
        vl.add(10);
        vl.add(20);
        vl.add(30);
        vl.add(40);
        vl.add(50);
        System.out.println("Element of vector before insertion:"+vl);
        vl.insertElementAt(700,2);
        System.out.println("Element of vector after insertion:"+vl);
        vl.clear();
    }

    private static void test10() {
        Vector<Integer>vl = new Vector<>();
        vl.add(1);
        vl.add(2);
        vl.add(3);
        vl.add(4);
        vl.add(2);
        System.out.println("Element of vector is "+vl);
        Vector<Integer>vl2 = new Vector<>();
        vl2.add(2);
        vl2.add(3);
        vl.retainAll(vl2);
        System.out.println("Element of vector is "+vl);
    }

    private static void test11() {
        DemoVector vl = new DemoVector();
        vl.add(1);
        vl.add(2);
        vl.add(3);
        vl.add(4);
        vl.add(5);
        System.out.println("Element of Vector is "+vl);
        vl.removeRange(1,3);
        System.out.println("Element of vector is "+vl);
    }

    private static void test12() {
        Vector<Integer>vl = new Vector<>();
        vl.add(10);
        vl.add(20);
        vl.add(30);
        vl.add(40);
        Stream<Integer>str = vl.stream();
        Spliterator<Integer> spltr1 = str.spliterator();
        System.out.println("Estimated size of vector is "+spltr1.estimateSize());
        spltr1.forEachRemaining((n)->System.out.println(n));
    }

    public static void main(String... args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
    }
}
