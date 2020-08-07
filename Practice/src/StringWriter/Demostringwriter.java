package StringWriter;

import java.io.*;

public class Demostringwriter {
    private static void writer() throws IOException{
        char [] ary = new char[512];
        FileInputStream fis = new FileInputStream("C:\\EdurekaIO\\textwrite.txt");
        StringWriter sw = new StringWriter();
        BufferedReader bis = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        int x;
        while((x=bis.read(ary))!=-1){
            sw.write(ary, 0, x);
        }
        System.out.println(sw.toString());
        sw.flush();
        sw.close();
        fis.close();
        bis.close();
    }

    public static void main(String[] args) throws IOException {
        writer();
    }
}
