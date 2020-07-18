package Interface;

public class TestInterface3 {
    public static void main(String [] args){
        Bank b = new SBI();
        System.out.println("ROI is "+b.RateOfInterest());
    }
}
