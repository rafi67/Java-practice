package ConsoleClass;

import java.io.Console;

public class CosoleDemo1 {
    private static void Work(){
        try {
            Console c = System.console();
            System.out.println("Enter your name: ");
            String name = c.readLine();
            System.out.println("Enter your password: ");
            char [] ch = c.readPassword();
            String password = String.valueOf(ch);
            System.out.println("Welcome "+name);
            System.out.println("Your Password is "+password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        Work();
    }
}
