package Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String Rafi[]){
        Vector<String> cars = new Vector<>();
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Nissan");
        Iterator itr = cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
