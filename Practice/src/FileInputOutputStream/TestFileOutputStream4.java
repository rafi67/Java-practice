package FileInputOutputStream;

import java.io.*;

public class TestFileOutputStream4 {
    private static void Write(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        FilterOutputStream fios = new FilterOutputStream(fos);
        String data = "Welcome to Softtech";
        byte [] b = data.getBytes();
        fios.write(b);
        fios.flush();
        fios.close();
        fos.close();
        System.out.println("Success...");
    }

    private static void Write2(File file) throws IOException{
        FileOutputStream fos = new FileOutputStream(file);
        FilterOutputStream filter = new FilterOutputStream(fos);
        filter.write(65);
        filter.flush();
        filter.close();
        fos.close();
        System.out.println("Success...");
    }

    public static void main(String[] args) throws IOException {
        Write(new File("C:\\EdurekaIO\\newtext.txt"));
        Write2(new File("C:\\EdurekaIO\\newtext2.txt"));
    }
}
