package FileInputOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream2 {
    private static void WriteFile(File file, File file2) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        FileOutputStream fos2 = new FileOutputStream(file2);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String info = "Hi! I'm Rafi";
        byte [] info2 = info.getBytes();
        baos.write(info2);
        String info3 = baos.toString("UTF-8");
        System.out.println(info3);
        byte [] in2 = baos.toByteArray();
        for(int i=0; i<in2.length; i++){
            System.out.println(in2[i]);
        }
        baos.writeTo(fos);
        baos.writeTo(fos2);
        baos.close();
        fos.close();
        fos2.close();
        System.out.println("Successful");
    }

    public static void main(String [] args) throws IOException{
        WriteFile(new File("C:\\EdurekaIO\\f1.txt"),
                new File("C:\\EdurekaIO\\f2.txt"));
    }
}
