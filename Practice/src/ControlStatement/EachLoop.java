package ControlStatement;

import java.util.ArrayList;

public class EachLoop {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Safil");
        list.add("Rafi");
        list.add("Fahim");
        for(String s:list){
            System.out.println(s);
        }
    }
}
