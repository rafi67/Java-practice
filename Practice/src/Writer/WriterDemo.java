package Writer;

import java.io.*;
import java.util.Scanner;

public class WriterDemo {
    private static void write() throws IOException{
        String content = "I love my country";
        Writer w = new FileWriter("C:\\EdurekaIO\\out.txt");
        w.write(content, 0, content.length());
        w.append(", Bangladesh");
        w.flush();
        w.close();
        System.out.println("Done");
    }

    private static void read() throws IOException{
        File file = new File("C:\\EdurekaIO\\out.txt");
        Scanner s = new Scanner(file);
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
        s.close();
    }

    public static void main(String[] args) throws IOException{
        write();
        read();
    }
}
