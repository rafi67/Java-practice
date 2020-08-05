package JavabufferedWriterReader;

import java.io.*;

public class DemoReader {
    private static void filereader() throws IOException{
        FileReader file = new FileReader("C:\\EdurekaIO\\out3.txt");
        BufferedReader br = new BufferedReader(file);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br2 = new BufferedReader(isr);
        System.out.println("Enter your name: ");
        String name = br2.readLine();
        System.out.println("Welcome "+name+" and see your text document");
        int i;
        while((i=br.read())!=-1){
            System.out.println((char)i);
        }
        file.close();
        br.close();
    }

    private static void filereader2() throws IOException{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String name = "";
        while(!name.equals("Stop")){
            System.out.println("Enter data: ");
            name = br.readLine();
            System.out.println("Data is "+name);
        }
        r.close();
        br.close();
    }

    public static void main(String[]args) throws IOException{
        filereader();
        filereader2();
    }
}
