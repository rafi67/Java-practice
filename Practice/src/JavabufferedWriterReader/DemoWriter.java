package JavabufferedWriterReader;

import java.io.*;
import java.util.Scanner;

public class DemoWriter {
    private static void filewriter() throws IOException{
        FileWriter writer = new FileWriter("C:\\EdurekaIO\\out3.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("I love Macbook pro");
        bw.flush();
        bw.close();
        System.out.println("Successful...");
    }

    private static void read() throws IOException{
        File file = new File("C:\\EdurekaIO\\out3.txt");
        Scanner s = new Scanner(file);
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
        s.close();
    }

    public static void main(String[]args) throws IOException{
        filewriter();
        read();
    }
}
