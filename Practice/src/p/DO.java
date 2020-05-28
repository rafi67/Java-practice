package p;

public class DO implements PS {
    @Override
    public void work() {
        System.out.println("Your Work is done");
    }

    public static void main(String Rafi[]){
        DO d = new DO();
        d.work();
    }
}
