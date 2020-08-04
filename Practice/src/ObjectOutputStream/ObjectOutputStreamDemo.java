package ObjectOutputStream;

import java.io.*;

public class ObjectOutputStreamDemo implements Serializable {
    public static void main(String Rafi[]) throws IOException, ClassNotFoundException{
        File file = new File("C:\\EdurekaIO\\serializedFile.bin");
        VehicleInfo v = new VehicleInfo(4, 6, "Audi");
        serialize(file, v);
        deserialize(file);
        int i;
        Integer j = 100;
        Integer k = new Integer(200);
        int a = j;
        System.out.println(k);
    }

    private static void deserialize(File file) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream object = new ObjectInputStream(fis);
        VehicleInfo v = (VehicleInfo) object.readObject();
        System.out.println("[Deserialization] : Name of Vehicle : "+v.nameOfVehicle);
        System.out.println("[Deserialization] : Number of Wheels : "+v.numberOfWheels);
        System.out.println("[Deserialization] : Mileage : "+v.mileage);
    }

    private static void serialize(File file, VehicleInfo v) throws IOException{
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream object = new ObjectOutputStream(fos);
        object.writeObject(v);
        object.flush();
        object.close();
    }
}