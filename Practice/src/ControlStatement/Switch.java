package ControlStatement;

public class Switch {
    public static void main(String Rafi[]){
        int x=1;
        int y=9;
        int z=3;
        switch (z){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            default:
                System.out.println("Wrong switch");
                break;
        }
    }
}
