package ObjectStream;

import java.io.ObjectStreamField;

public class ObjectStream2 {
    private static void show(){
        try {
            Object obj = new Object();
            ObjectStreamField osf = new ObjectStreamField("Value", String.class);
            System.out.println(osf.getType());
            System.out.println(osf.getName());
            System.out.println(osf.getTypeCode());
            System.out.println(osf.getOffset());
            System.out.println(osf.isPrimitive());
            System.out.println(osf.isUnshared());
            System.out.println(osf.toString());
            System.out.println(osf.compareTo(obj));
        }
        catch(ClassCastException e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        show();
    }
}
