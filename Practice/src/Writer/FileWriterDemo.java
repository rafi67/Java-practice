package Writer;

import java.io.*;
import java.util.Scanner;

public class FileWriterDemo {
    private static void filewriter() throws IOException{
        FileWriter fw = new FileWriter("C:\\EdurekaIO\\out2.txt");
        fw.write("I love you and always be with you");
        fw.flush();
        fw.close();
    }

    private static void filereader() throws IOException{
        File file = new File("C:\\EdurekaIO\\out2.txt");
        Scanner s = new Scanner(file);
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
        s.close();
    }

    public static void main(String [] args) throws IOException{
        filewriter();
        filereader();
    }
}
