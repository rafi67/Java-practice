package Writer;

import java.io.*;

public class ReaderDemo {
    private static void reader() throws IOException{
        Reader r = new FileReader("C:\\EdurekaIO\\out.txt");
        int data = r.read();
        while(data!=-1){
            System.out.println((char)data);
            data = r.read();
        }
        r.close();
    }

    public static void main(String [] args) throws IOException{
        reader();
    }
}
