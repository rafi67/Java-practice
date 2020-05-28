package FileInputOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
    public static void main(String Rafi[]) throws IOException {
        File file = new File("C:\\EdurekaIO\\message.txt");
        writeToFile(file);
        readFile(file);
    }

    private static void writeToFile(File file) throws IOException{
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("Hello World".getBytes());
        fos.flush();
        fos.close();
    }

    private static void readFile(File file) throws FileNotFoundException{
        Scanner s = new Scanner(file);
        System.out.println("Output:");
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
}
