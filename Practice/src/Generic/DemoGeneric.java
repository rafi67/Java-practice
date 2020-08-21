package Generic;

import java.util.*;

public class DemoGeneric<T> {
    T obj;
    private static void storingSameObject() {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        System.out.println("Element is "+list.get(0));
        Iterator <Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private static void genericsWithHashMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rafi");
        map.put(2, "Fahim");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry e = itr.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

    private void add(T obj){
        this.obj = obj;
    }

    T get() {
        return obj;
    }

    private static <E> void printArray(E[]e){
        for(E s:e){
            System.out.println(s);
        }
    }

    private static void printingArray() {
        Integer [] arrayInt = {1,2,3,4,5};
        Character [] arrayChar = {'j','a','v','a'};
        System.out.println("Printing Integer Array:");
        printArray(arrayInt);
        System.out.println("Printing Character Array:");
        printArray(arrayChar);
    }

    private static void drawShape(List<? extends Shape> list) {
        for(Shape s:list){
            s.draw();
        }
    }

    private static void draw() {
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShape(list1);
        drawShape(list2);
    }

    private static Double add(ArrayList<? extends Number> num) {
        double sum = 0.0;
        for(Number n:num){
            sum = sum+n.doubleValue();
        }
        return sum;
    }

    private static void upperBoundedWildCard() {
        ArrayList<Integer> valueOfInt = new ArrayList<>();
        valueOfInt.add(10);
        valueOfInt.add(20);
        ArrayList<Double> valueOfDouble = new ArrayList<>();
        valueOfDouble.add(30.0);
        valueOfDouble.add(10.0);
        System.out.println("Displaying the sum = "+add(valueOfInt));
        System.out.println("Displaying the sum = "+add(valueOfDouble));
    }

    private static void display(List<?>list) {
        for(Object o:list){
            System.out.println(o);
        }
    }

    private static void unboundedWildCards() {
        List<Integer> l1 = Arrays.asList(1,2,3);
        System.out.println("Printing Integer list:");
        display(l1);
        List<String>l2 = Arrays.asList("One", "Two", "Three");
        System.out.println("Printing String list:");
        display(l2);
    }

    private static void addNumbers(List<? super Integer> list) {
        for(Object o:list){
            System.out.println(o);
        }
    }

    private static void lowerBoundedWildCard() {
        List<Integer>list = Arrays.asList(1,2,3);
        System.out.println("Showing Integer value:");
        addNumbers(list);
        List<Number>l2 = Arrays.asList(1.0, 2.0, 3.9);
        System.out.println("Showing Number value:");
        addNumbers(l2);
    }

    public static void main(String... args) {
        storingSameObject();
        genericsWithHashMap();
        DemoGeneric<String> g = new DemoGeneric<>();
        g.add("Rafi");
        System.out.println(g.get());
        printingArray();
        draw();
        upperBoundedWildCard();
        unboundedWildCards();
        lowerBoundedWildCard();
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
