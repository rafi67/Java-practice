package FileInputOutputStream;

import java.io.*;

public class TestFileInputStream3 {
    private static void ReadFile(File file) {
        try{
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            bis.mark(0);
            bis.skip(1);
            while((i=bis.read())!=-1){
                System.out.println((char)i);
            }
            bis.reset();
            int i2;
            while((i2=bis.read())!=-1){
                System.out.println((char)i2);
            }
            bis.close();
            fis.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        File file = new File("C:\\EdurekaIO\\EmployeeInfo.txt");
        ReadFile(file);
    }
}
