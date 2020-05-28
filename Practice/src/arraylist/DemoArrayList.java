package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
    public static void main(String Rafi[]){
        printArrayList(createArrayList());
        printArrayList(test());
        printArrayList(test2());
        printArrayList(test3());
    }

    private static ArrayList<Float> test3(){
        ArrayList<Float> numbers = new ArrayList<>();
        numbers.add(3.15f);
        numbers.add(4.12f);
        return numbers;
    }

    private static ArrayList<Integer> test2(){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(200);
        return number;
    }

    private static ArrayList<String> test(){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        return cars;
    }

    private static List createArrayList(){
        List <String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Nissan");
        cars.add("Audi");
        return cars;
    }

    private static void printArrayList(List list){
        Iterator listIterator = list.iterator();
        while(listIterator.hasNext()){
            System.out.println("Print the value in the list "+listIterator.next());
            listIterator.remove();
        }
    }
}
