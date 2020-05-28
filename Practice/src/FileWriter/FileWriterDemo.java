package FileWriter;

import java.io.*;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String Rafi[]) throws IOException {
        File file = new File("C:\\EdurekaIO\\BikeInfo.txt");
        writeToFile(file);
        readFile(file);
    }

    private static void writeToFile(File file) throws IOException{
        FileWriter fw = new FileWriter(file);
        fw.write("Dighi");
        fw.flush();
        fw.close();
    }

    private static void readFile(File file) throws FileNotFoundException{
        Scanner s = new Scanner(file);
        System.out.println("Output:");
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
