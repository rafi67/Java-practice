package InputStreamReader;

import java.io.*;

public class DemoReader {
    private static void reader(){
        try {
            FileInputStream fis = new FileInputStream("C:\\EdurekaIO\\textwrite.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            int data = isr.read();
            while(data!=-1){
                System.out.println((char)data);
                data = isr.read();
            }
            fis.close();
            isr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        reader();
    }
}
