package ObjectStream;

import ObjectOutputStream.ObjectOutputStreamDemo;

import java.io.*;

public class ObjectStream {
    private static void show() throws NullPointerException{
        ObjectStreamClass osc = ObjectStreamClass.lookup(ObjectOutputStreamDemo.class);
        System.out.println(osc.getField("price"));
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);
        System.out.println(osc2.getField("hash"));
    }

    public static void main(String [] args) throws NullPointerException{
        show();
    }
}
