package Collection;

import java.util.*;

public class DemoList {
    private static void test() {
        List<String> list = new ArrayList<>();
        list.add("Fahim");
        list.add("Rifat");
        list.add("Shafi");
        list.add("Medha");
        for(String s:list){
            System.out.println(s);
        }
        list.clear();
    }

    private static <T> List<T> covertToArraylist(T[]s) {
        List<T> list = new ArrayList<>();
        for(T s2:s){
            list.add(s2);
        }
        return list;
    }

    private static void test2() {
        String[] s = {"C","C++","Java","Kotlin","Swift","Objective C",
        "C#", "PHP","Javascript","Python"};
        List<String> list = covertToArraylist(s);
        for(String s2:list){
            System.out.println(s2);
        }
    }

    private static void test3() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Water Malone");
        String[]array = fruitList.toArray(new String[fruitList.size()]);
        fruitList.clear();
        for(String s:array){
            System.out.println(s);
        }
    }

    private static void test4() {
        List<String>list = new ArrayList<>();
        list.add("Macbook Pro");
        list.add("Alien war Area 51m");
        list.add("Razer Blade 15");
        list.add("Gigabyte");
        System.out.println("Getting last element "+list.get(3));
        list.set(1, "Microsoft Surface book");
        for(String s:list){
            System.out.println(s);
        }
        list.clear();
    }

    private static void test5() {
        List<Integer>list = new ArrayList<>();
        list.add(22);
        list.add(2);
        list.add(1);
        list.add(100);
        list.add(99);
        list.add(11);
        list.add(0);
        Collections.sort(list);
        for(int n:list){
            System.out.println(n);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int n:list){
            System.out.println(n);
        }
        list.clear();
    }

    private static void test6() {
        List<String>list = new ArrayList<>();
        list.add("Toyota");
        list.add("BMW");
        list.add("Nissan");
        ListIterator <String> itr = list.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){
            System.out.println("Index:"+itr.nextIndex()+" Value: "+itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){
            System.out.println("Index:"+itr.previousIndex()+" Value: "+itr.previous());
        }
        list.clear();
    }

    private static void test7() {
        List<Book> list = new ArrayList<>();
        Book b1 = new Book(1, "Java Programming");
        Book b2 = new Book(2, "C++ Programming");
        Book b3 = new Book(3, "Programming with Python");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Book b : list){
            System.out.println("Book id is "+b.id);
            System.out.println("Book name is "+b.bookName);
        }
    }

    public static void main(String... args) {
        test();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
    }
}

class Book {
    int id;
    String bookName;
    Book(int id, String bookName){
        this.id = id;
        this.bookName = bookName;
    }
}
