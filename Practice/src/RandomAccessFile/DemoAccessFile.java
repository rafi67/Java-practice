package RandomAccessFile;

import java.io.*;

public class DemoAccessFile {
   static final String FILEPATH = "C:\\EdurekaIO\\myfile.txt";

   private static void writeToFile(String pathFile, String data, int position) throws IOException{
       RandomAccessFile file = new RandomAccessFile(pathFile, "rw");
       file.seek(position);
       file.write(data.getBytes());
       file.close();
   }

   private static byte[] readFromFile(String pathFile, int position, int size) throws IOException{
       RandomAccessFile file = new RandomAccessFile(pathFile, "r");
       file.seek(position);
       byte [] data = new byte [size];
       file.read(data);
       return data;
   }

   public static void main(String [] args){
       try{
           writeToFile(FILEPATH, "I love my Country and my people", 31);
           System.out.println(new String(readFromFile(FILEPATH, 31, 18)));
       }
       catch(IOException e){
           e.printStackTrace();
       }
   }
}
