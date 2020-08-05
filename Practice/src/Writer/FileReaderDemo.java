package Writer;

import java.io.*;

public class FileReaderDemo {
    private static void filereader() throws IOException{
        FileReader fr = new FileReader("C:\\EdurekaIO\\out2.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.println((char)i);
        }
        fr.close();
    }

    public static void main(String [] args) throws IOException {
        filereader();
    }
}
