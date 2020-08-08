package FilterWriterReader;

import java.io.*;

class CustomFilterWriter extends FilterWriter{
    CustomFilterWriter(Writer out){
        super(out);
    }

    @Override
    public void write(String srg) throws IOException {
        super.write(srg.toLowerCase());
    }
}

public class DemoWriter {
    private static void writer() throws IOException{
        FileWriter fw = new FileWriter("C:\\EdurekaIO\\record.txt");
        CustomFilterWriter cfw = new CustomFilterWriter(fw);
        cfw.write("I love my Country");
        fw.close();
        cfw.close();
    }

    private static void reader() throws IOException{
        FileReader fr = new FileReader("C:\\EdurekaIO\\record.txt");
        BufferedReader br = new BufferedReader(fr);
        int k = br.read();
        while(k!=-1){
            System.out.println((char)k);
            k = br.read();
        }
        br.close();
        fr.close();
    }

    public static void main(String [] args) throws IOException{
        writer();
        reader();
    }
}
