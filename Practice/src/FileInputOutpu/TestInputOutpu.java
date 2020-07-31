package FileInputOutpu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestInputOutpu {

    private static void ReadFile(File file) throws FileNotFoundException{
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                System.out.println(s.nextLine());
            }
    }

    private static void WriteFile(File file){
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(file);
            writer.println("Rafi");
            writer.println(1);
        }
        catch(FileNotFoundException e){
            System.out.println(file.getName()+" File not found");
            throw new RuntimeException(e);
        }
        finally {
            writer.close();
        }
    }

    public static void main(String [] args) throws FileNotFoundException{
        String location = "C:\\EdurekaIO\\EmployeeInfo.txt";
        String location2 = "C:\\EdurekaIO\\EmployeeInfo.txt";
        File file = new File(location);
        File file2 = new File(location2);
        WriteFile(file);
        ReadFile(file2);
    }
}
