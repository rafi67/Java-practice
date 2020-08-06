package CharArrayReaderWriter;

import java.io.*;
import java.util.Scanner;

public class WriterDemo {
    static char[] ch = new char[50];
    private static void writer() throws IOException{
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welcome to javapoint");
        FileWriter file1 = new FileWriter("C:\\EdurekaIO\\chararraywriter.txt");
        out.writeTo(file1);
        ch = out.toCharArray();
        out.flush();
        out.close();
        file1.flush();
        file1.close();
        System.out.println("Successful");
    }

    private static void reader() throws IOException{
        Scanner s = new Scanner(new File("C:\\EdurekaIO\\chararraywriter.txt"));
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
        s.close();
    }

    public static void main(String [] args) throws IOException{
        writer();
        reader();
    }
}
