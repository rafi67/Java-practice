package FilterWriterReader;

import java.io.*;

class CustomFilterReader extends FilterReader{
    CustomFilterReader(Reader in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        int x = super.read();
        if((char)x == ' '){
            return ('?');
        }
        else
            return x;
    }
}

public class DemoReader {
    private static void reader() throws IOException{
        Reader reader = new FileReader("C:\\EdurekaIO\\record.txt");
        CustomFilterReader cfr = new CustomFilterReader(reader);
        int k;
        while((k=cfr.read())!=-1){
            System.out.println((char)k);
        }
        reader.close();
        cfr.close();
    }

    public static void main(String [] args) throws IOException{
        reader();
    }
}
