package DataStructure;

public class Main {
    public void log(int[] numbers, String[] names){
        //O(n+n+n)
        for(int number:numbers) //O (n)
            System.out.println(number);
        for(int number:numbers) //O (n)
            System.out.println(number);
        for(String name:names) //O(n)
            System.out.println(name);
    }

    public static void main (String Rafi[]){
        Main m = new Main();
        m.log(new int[]{1,2,3}, new String[] {"Rafi"});
    }
}
