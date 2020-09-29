package Collection;

import java.util.*;

public class DemoStack {
    private static void test1() {
        Stack<Integer>s = new Stack<>();
        System.out.println("Stack Empty: "+s.empty());
        s.push(22);
        s.push(23);
        s.push(24);
        s.push(25);
        System.out.println("Element of stack is "+s);
        System.out.println("Stack Empty: "+s.empty());
        s.clear();
    }

    private static void test2() {
        Stack<Integer>s = new Stack<>();
        pushElement(s, 22);
        pushElement(s, 23);
        pushElement(s, 24);
        pushElement(s, 25);
        popElement(s);
        popElement(s);
        try{
            popElement(s);
        }
        catch(EmptyStackException e){
            e.printStackTrace();
        }
        s.clear();
    }

    private static void test3() {
        Stack<String>s = new Stack<>();
        s.push("Apple");
        s.push("Orange");
        s.push("Mango");
        System.out.println("Stack:"+s);
        System.out.println("Fruit at top "+s.peek());
        s.clear();
    }

    private static void test4() {
        Stack<String>s = new Stack<>();
        s.push("HP");
        s.push("MacBook");
        s.push("Lenovo");
        s.push("Acer");
        System.out.println("Location of MacBook is "+s.search("MacBook"));
        System.out.println("Location of Acer is "+s.search("Acer"));
        s.clear();
    }

    private static void test5() {
        Stack<Integer>s = new Stack<>();
        s.push(22);
        s.push(33);
        s.push(44);
        s.push(55);
        s.push(66);
        System.out.println("The size of the stack is "+s.size());
        Iterator<Integer>itr = s.iterator();
        System.out.println("Using Iterator");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Using forEach method");
        s.forEach(System.out::println);
        ListIterator<Integer>l = s.listIterator();
        System.out.println("Using ListIterator");
        while(l.hasNext()){
            System.out.println(l.next());
        }
        s.clear();
    }

    public static void main(String... args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    private static <T> void pushElement(Stack<T>stk, T x) {
        System.out.println("push -> "+x);
        stk.push(x);
        System.out.println("stack:"+stk);
    }

    private static <T> void popElement(Stack<T>stk) {
        System.out.println("pop -> "+stk.pop());
        System.out.println("stack:"+stk);
    }
}
