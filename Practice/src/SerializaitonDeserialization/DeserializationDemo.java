package SerializaitonDeserialization;

import java.io.*;

public class DeserializationDemo {
    private static void deserialization(){
        try{
            FileInputStream fis = new FileInputStream("C:\\EdurekaIO\\Serializable.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            System.out.println(s.id+", "+s.name);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }

    public static void main(String[]args){
        deserialization();
    }
}
