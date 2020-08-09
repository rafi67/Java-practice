package FileClass;

import java.io.*;

public class DemoFile {
    private static void file() throws IOException{
        File file = new File("C:\\EdurekaIO\\doc.txt");
        if(file.createNewFile()){
            System.out.println("File created Successfully");
        }
        else
            System.out.println("File already exists.");
    }

    public static void main(String [] args) throws IOException{
        file();
    }
}
