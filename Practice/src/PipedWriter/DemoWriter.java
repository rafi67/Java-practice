package PipedWriter;

import java.io.*;

public class DemoWriter {
    private static void writer(){
        try {
            PipedReader read = new PipedReader();
            PipedWriter write = new PipedWriter(read);

            Thread readerThread = new Thread(() -> {
                try{
                    int data = read.read();
                    while(data!=-1){
                        System.out.println((char)data);
                        data = read.read();
                    }
                    read.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            });

            Thread writerThread = new Thread(() -> {
                try{
                    write.write("I love my country\n".toCharArray());
                    write.flush();
                    write.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            });

            readerThread.start();
            writerThread.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        writer();
    }
}
