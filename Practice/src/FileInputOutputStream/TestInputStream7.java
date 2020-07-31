package FileInputOutputStream;

import java.io.*;

public class TestInputStream7 {
    private static void Read(File file, File file2, File file3) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        FileOutputStream fos = new FileOutputStream(file2);
        DataOutputStream dos = new DataOutputStream(fos);
        FileOutputStream fos2 = new FileOutputStream(file3);
        DataOutputStream dos2 = new DataOutputStream(fos2);
        int in;
        char [] in2 = new char[50];
        int i =0;
        while((in = dis.read())!=-1){
            in2[i] = (char)in;
            i++;
        }
        String in3 = String.valueOf(in2);
        dos.writeChars(in3);
        dos2.writeChars(in3);
        fis.close();
        fos.close();
        dis.close();
        dos.close();
        System.out.println("Successful");
    }

    private static void Read2(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        int in = dis.readInt();
        System.out.println(in);
        fis.close();
        dis.close();
    }

    private static void Read3(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        byte [] in = new byte[50];
        dis.read(in);
        for(int i=0; i<in.length; i++){
            if(in[i]==0){
                break;
            }
            System.out.println((char)in[i]);
        }
        fis.close();
        dis.close();
    }

    private static void Read4(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        int in = dis.readByte();
        System.out.println(in);
        fis.close();
        dis.close();
    }

    private static void Read5(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        char in = dis.readChar();
        System.out.println(in);
        fis.close();
        dis.close();
    }

    private static void Read6(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        double r = dis.readDouble();
        System.out.println(r);
        fis.close();
        dis.close();
    }

    private static void Read7(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        boolean b = dis.readBoolean();
        System.out.println(b);
        fis.close();
        dis.close();
    }

    private static void Read8(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        dis.skipBytes(1);
        int in;
        while((in=dis.read())!=-1){
            System.out.println((char)in);
        }
        fis.close();
        dis.close();
    }

    private static void Read9(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readUTF());
        fis.close();
        dis.close();
    }

    private static void Read10(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        byte [] in = new byte[10];
        dis.readFully(in);
        for(int i=0; i<in.length; i++){
            if(in[i]==0)
                break;
            System.out.println((char)in[i]);
        }
        fis.close();
        dis.close();
    }

    public static void main(String [] args) throws IOException{
        Read(new File("C:\\EdurekaIO\\TextOut.txt"),
                new File("C:\\EdurekaIO\\f3.txt"),
                new File("C:\\EdurekaIO\\f1.txt"));

        Read2(new File("C:\\EdurekaIO\\TextOut.txt"));
        Read3(new File("C:\\EdurekaIO\\TextOut.txt"));
        Read4(new File("C:\\EdurekaIO\\TextOut.txt"));
        Read5(new File("C:\\EdurekaIO\\f3.txt"));
        Read6(new File("C:\\EdurekaIO\\f3.txt"));
        Read7(new File("C:\\EdurekaIO\\TextOut.txt"));
        Read8(new File("C:\\EdurekaIO\\TextOut.txt"));
        Read9(new File("C:\\EdurekaIO\\f3.txt"));
        Read10(new File("C:\\EdurekaIO\\TextOut.txt"));
    }
}
