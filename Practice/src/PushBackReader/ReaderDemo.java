package PushBackReader;

import java.io.*;

public class ReaderDemo {
    private static void reader() throws Exception{
        char [] ar = {'1','-','-','2','-','3','4','-','-','-','5','6'};
        CharArrayReader charArrayReader = new CharArrayReader(ar);
        PushbackReader push = new PushbackReader(charArrayReader);
        int i;
        while((i=push.read())!=-1){
            if(i=='-'){
                int j;
                if((j=push.read())=='-'){
                    System.out.print("#*");
                }else{
                    push.unread(j);
                    System.out.print((char)i);
                }
            }else{
                System.out.print((char)i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        reader();
    }
}
