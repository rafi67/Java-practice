package Interface;

import FinalKeyword.TestFinal;

interface Printable{
    void print();
}

public class TestInterface implements Printable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String [] args){
        TestInterface t = new TestInterface();
        t.print();
    }
}
