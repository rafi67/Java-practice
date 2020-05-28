package set;


import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    private static Set createHashSet(){
        HashSet<Integer> setOfIntegers = new HashSet<>();
        setOfIntegers.add(10);
        setOfIntegers.add(20);
        setOfIntegers.add(30);
        return setOfIntegers;
    }

    private static Set createLinkedHashSet(){
        LinkedHashSet<Integer> setOfIntegers = new LinkedHashSet<>();
        setOfIntegers.add(100);
        setOfIntegers.add(200);
        setOfIntegers.add(300);
        return setOfIntegers;
    }

    private static Set createTreeSet(){
        Set<Integer> setOfIntegers = new TreeSet<>();
        setOfIntegers.add(12);
        setOfIntegers.add(13);
        setOfIntegers.add(14);
        setOfIntegers.add(15);
        setOfIntegers.add(16);
        return setOfIntegers;
    }

    private static void printSet(Set s){
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println("value of element in a set "+itr.next());
        }
    }

    public static void main(String Rafi[]){
        printSet(createHashSet());
        printSet(createLinkedHashSet());
        System.out.println("Printing tree set");
        printSet(createTreeSet());
    }
}
