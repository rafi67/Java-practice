package FileDescriptorClass;

import java.io.*;

public class DescriptorDemo {
    private static void descriptor(){
        FileDescriptor fd = null;
        byte [] b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58};
        try{
            FileOutputStream fos = new FileOutputStream("C:\\EdurekaIO\\filetest2.txt");
            FileInputStream fis = new FileInputStream("C:\\EdurekaIO\\filetest2.txt");
            fd = fos.getFD();
            fos.write(b);
            fos.flush();
            fd.sync();
            fos.close();
            int k;
            while((k=fis.read())!=-1){
                System.out.println((char)k);
            }
            fis.close();
            System.out.println("\nSync() successfully executed!!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        descriptor();
    }
}
