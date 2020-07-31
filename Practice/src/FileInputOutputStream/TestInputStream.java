package FileInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {
    private static void InputStream(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        int in;
        byte [] number = new byte[4];
        System.out.println("using available method");
        System.out.println(fis.available());
        System.out.println("using read method");
        while((in=fis.read(number, 0, number.length))!=-1){
            System.out.println((int)in);
        }
        fis.close();
    }

    public static void main(String [] args) throws IOException{
        File file = new File("C:\\EdurekaIO\\BikeInfo.txt");
        InputStream(file);
    }
}
