package OutputStream;

import java.io.*;

public class DemoOutput {
    private static void outputstreamwriter(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\EdurekaIO\\streamwrite.txt");
            Writer writer = new OutputStreamWriter(fos);
            writer.write("Hello World");
            writer.flush();
            writer.close();
            fos.flush();
            fos.close();
        }
        catch(Exception e){
            e.getMessage();
        }
    }

    public static void main(String [] args){
        outputstreamwriter();
    }
}
