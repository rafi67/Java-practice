package StringReader;

import java.io.*;

public class DemoReader {
    private static void reader() throws IOException{
        String srg = "Rafi";
        StringReader sr = new StringReader(srg);
        int i = 0;
        while((i=sr.read())!=-1){
            System.out.println((char)i);
        }
        sr.close();
    }

    public static void main(String [] args) throws IOException{
        reader();
    }
}
