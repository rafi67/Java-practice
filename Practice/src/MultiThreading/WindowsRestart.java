package MultiThreading;

public class WindowsRestart {
    public static void main(String[]args)throws Exception{
        Runtime.getRuntime().exec("shutdown -r -t 0");
    }
}
