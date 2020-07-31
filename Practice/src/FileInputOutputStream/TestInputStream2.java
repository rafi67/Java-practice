package FileInputOutputStream;

import java.io.*;

public class TestInputStream2 {

    public static void ReadFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        long in = fis.skip(2l);
        System.out.println((int)in);
        System.out.println(fis.getFD());
        int in2;
        while((in2=fis.read())!= -1) {
            System.out.println((char) in2);
        }
        fis.close();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\EdurekaIO\\EmployeeInfo.txt");
        ReadFile(file);
    }
}
