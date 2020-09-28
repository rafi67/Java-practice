package Collection;

import java.util.*;
import java.io.*;

public class DemoProperties {
    private static void test1() {
        try{
            FileReader reader = new FileReader("C:\\Users\\rafis\\Desktop\\db.properties");
            Properties p = new Properties();
            p.load(reader);
            System.out.println(p.getProperty("user"));
            System.out.println(p.getProperty("password"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void test2() {
        Properties p = System.getProperties();
        Set set = p.entrySet();
        for(Object o:set){
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey()+" "+m.getValue());
        }
        p.clear();
        set.clear();
    }

    private static void test3() {
        try {
            FileWriter fw = new FileWriter("C:\\Java\\info.properties");
            Properties p = new Properties();
            p.setProperty("Name", "Md. Rafi Siddique");
            p.setProperty("Email", "rafisiddique652@gmail.com");
            p.store(fw, "Rafi");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void readTest3() {
        try{
            FileReader reader = new FileReader("C:\\Java\\info.properties");
            Properties p = new Properties();
            p.load(reader);
            System.out.println(p.getProperty("Name"));
            System.out.println(p.getProperty("Email"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String... args) {
        test1();
        test2();
        test3();
        readTest3();
    }
}
