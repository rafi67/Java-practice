package FileClass;

import java.io.*;

public class DemoFile3 {
    private static void file(){
        File file = new File("C:\\EdurekaIO");
        String [] filenames = file.list();
        for(String filename:filenames){
            System.out.println(filename);
        }
    }

    public static void main(String [] args){
        file();
    }
}
