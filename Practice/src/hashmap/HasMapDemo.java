package hashmap;

import java.util.*;

public class HasMapDemo {
    public static void main(String[] args) {
        printMap(createHashMap());
        printMap(createLinkedMap());
        printMap(createTreeMap());
    }

    private static Map<Integer, String> createHashMap(){
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "X");
        employeeMap.put(2, "Y");
        employeeMap.put(100, "A");
        return employeeMap;
    }

    private static Map<Integer, String> createLinkedMap(){
        Map<Integer, String> employeeMap = new LinkedHashMap<>();
        employeeMap.put(1, "X");
        employeeMap.put(2, "Y");
        employeeMap.put(100, "A");
        return employeeMap;
    }


    private static Map<Integer, String> createTreeMap(){
        Map<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(1, "X");
        employeeMap.put(2, "Y");
        employeeMap.put(100, "A");
        return employeeMap;
    }


    private static void printMap(Map<Integer, String>map){
        Set keys = map.keySet();
        System.out.println(map);
    }
}
