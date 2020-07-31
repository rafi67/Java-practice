package FileInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class TestInputStream5 {
    private static void ReadFile(File file, File file2) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        FileInputStream fis2 = new FileInputStream(file2);
        Vector v = new Vector();
        v.add(fis);
        v.add(fis2);
        Enumeration e = v.elements();
        SequenceInputStream sis = new SequenceInputStream(e);
        int i;
        while((i=sis.read())!=-1){
            System.out.println((char)i);
        }
        fis.close();
        fis2.close();
        sis.close();
    }

    public static void main(String [] args)throws IOException{
        ReadFile(new File("C:\\EdurekaIO\\EmployeeInfo.txt"),
                new File("C:\\EdurekaIO\\VehicleInfo.txt"));
    }
}
