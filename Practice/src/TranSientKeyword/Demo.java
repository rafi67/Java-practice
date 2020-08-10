package TranSientKeyword;

import java.io.Serializable;

public class Demo implements Serializable {
    transient int id; // if you don't want to serialize a data member of a class you can use transient
    String name;
    Demo(int id, String name){
        this.id = id;
        this.name = name;
    }
}
