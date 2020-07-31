package FileInputOutputStream;

import java.io.*;

public class TestFileOutputStream {
    private static void WriteFile(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s = "Fahim";
        byte [] b = s.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
        fos.close();
        System.out.println("Operation Successful");
    }


    public static void main(String [] args) throws IOException{
        File file = new File("C:\\EdurekaIO\\image.bin");
        WriteFile(file);
    }
}
