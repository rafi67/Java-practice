package PipedReader;

import java.io.*;

public class DemoReader {
    private static void reader(){
        try {
            PipedReader reader = new PipedReader();
            PipedWriter writer = new PipedWriter(reader);

            Thread readerThread = new Thread(() ->{
               try{
                   int i = reader.read();
                   while(i!=-1){
                       System.out.println((char)i);
                       i = reader.read();
                   }
                   reader.close();
               }
               catch(Exception e){
                   e.printStackTrace();
               }
            });

            Thread writerThread = new Thread(() ->{
               try{
                   writer.write("I love her".toCharArray());
                   writer.flush();
                   writer.close();
               }catch(Exception e){
                   e.printStackTrace();
               }
            });

            readerThread.start();
            writerThread.start();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        reader();
    }
}
