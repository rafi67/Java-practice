package SerializaitonDeserialization;

import java.io.*;

public class SerializationDemo {
    private static void serialization(){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\EdurekaIO\\Serializable.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student s1 = new Student(12, "Rafi");
            oos.writeObject(s1);
            oos.flush();
            oos.close();
            fos.flush();
            fos.close();
            System.out.println("Successful");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[]args){
        serialization();
    }
}
