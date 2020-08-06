package PrintStream;

import java.io.*;

public class DemoPrintStream {
    private static void printstream() throws IOException{
        FileOutputStream fos = new FileOutputStream("C:\\EdurekaIO\\textdoc.txt");
        PrintStream ps = new PrintStream(fos);
        ps.println(2016);
        ps.println("Hello Java");
        ps.println("Welcome to Java");
        ps.close();
        fos.flush();
        fos.close();
        System.out.println("Successful");
    }

    private static void prINTF(){
        int n = 12;
        System.out.printf("%d", n); // object of PrintStream......
    }

    public static void main(String [] args) throws IOException{
        printstream();
        prINTF();
    }
}
