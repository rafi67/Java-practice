package FileClass;

import java.io.*;

public class DemoFile2 {
    private static void file() throws IOException{
        String path;
        boolean bool = false;
        File file = new File("C:\\EdurekaIO\\testFile.txt");
        file.createNewFile();
        System.out.println(file);
        File file2 = file.getCanonicalFile();
        System.out.println(file2);
        bool = file2.exists();
        path = file2.getAbsolutePath();
        System.out.println(bool);
        if(bool){
            System.out.println(path+" Exists? "+bool);
        }
    }

    public static void main(String [] args) throws IOException{
        file();
    }
}
