package FileInputOutputStream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream6 {
    private static void ReadFile(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        byte [] buf = fis.readAllBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        int in;
        while((in=bais.read())!=-1){
            System.out.println((char)in);
        }
        fis.close();
        bais.close();
    }

    public static void main(String [] args) throws IOException{
        ReadFile(new File("C:\\EdurekaIO\\EmployeeInfo.txt"));
    }
}
