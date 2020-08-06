package CharArrayReaderWriter;

import java.io.*;

public class ReaderDemo {
    private static void reader() throws IOException{
        char [] ch = {'j', 'r', 'f', 'e', 'k'};
        CharArrayReader c = new CharArrayReader(ch);
        System.out.println(c.ready());
        int i;
        while((i=c.read())!=-1){
            System.out.println((char)i);
        }
        c.close();
    }

    public static void main(String [] args) throws IOException{
        reader();
    }
}
