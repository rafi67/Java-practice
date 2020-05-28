package FileInputOutputStream;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String Rafi[]) throws IOException{
        File file = new File("C:\\EdurekaIO\\BikeInfo.txt");
        readFromFile(file);
    }

    private static void readFromFile(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        int in;
        while((in=fis.read())!=-1){
            System.out.println("Character read from the file is "+(char)in);
        }
    }
}

