package FileInputOutputStream;

import java.io.*;

public class TestFileInputStream4 {
    private static void ReadFile(File file, File file2, File file3) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileInputStream fis2 = new FileInputStream(file2);
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        FileOutputStream fos = new FileOutputStream(file3);
        int i;
        while((i=sis.read())!=-1){
            System.out.println((char)i);
            fos.write(i);
        }
        fos.close();
        sis.close();
        fis.close();
        fis2.close();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\EdurekaIO\\EmployeeInfo.txt");
        File file2 = new File("C:\\EdurekaIO\\VehicleInfo.txt");
        File file3 = new File("C:\\EdurekaIO\\TextOut.txt");
        ReadFile(file, file2, file3);
    }
}
