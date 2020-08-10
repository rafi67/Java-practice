package SerializaitonDeserialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1l;

    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
