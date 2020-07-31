package FileInputOutputStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestOutputStream3 {
    private static void WriteFile(File file) throws IOException{
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeByte(71);
        dos.writeInt(65);
        dos.writeChar(66);
        dos.write(67);
        byte[] in = {68, 69};
        dos.write(in, 0, in.length);
        dos.writeChars("Rafi");
        //dos.writeFloat(70);
        dos.writeChar(70);
        dos.writeByte(71);
        dos.writeBytes("bike");
        dos.writeShort(72);
        dos.writeLong(73l);
        dos.writeUTF("car");
        dos.writeBoolean(false);
        dos.flush();
        dos.close();
        System.out.println("Successful");
    }

    private static void ReadFile(File file) throws IOException{
        Scanner s = new Scanner(file);
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
    }

    public static void main(String [] args) throws IOException{
        WriteFile(new File("C:\\EdurekaIO\\file1.txt"));
        ReadFile(new File("C:\\EdurekaIO\\file1.txt"));
    }
}
