package FileInputOutputStream;

import java.io.*;

public class TestInputStream8 {
    private static void Read(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        FilterInputStream filterin = new BufferedInputStream(fis);
        int in;
        while((in=filterin.read())!=-1){
            System.out.println((char)in);
        }
    }

    public static void main(String [] args) throws IOException{
        Read(new File("C:\\EdurekaIO\\newtext.txt"));
    }
}
