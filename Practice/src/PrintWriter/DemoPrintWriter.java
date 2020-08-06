package PrintWriter;

import java.io.*;

public class DemoPrintWriter {
    private static void printWriter() throws IOException{
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Welcome to Java");
        writer.flush();
        writer.close();
        PrintWriter writer2 = new PrintWriter(
                new File("C:\\EdurekaIO\\textwrite.txt"));
        writer2.println("like java, android, hibernate etc..");
        writer2.println(true);
        writer2.flush();
        writer2.close();
    }

    public static void main(String [] args) throws IOException{
        printWriter();
    }
}
