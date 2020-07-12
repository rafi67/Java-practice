package ThisKeyWord;

public class D {
    int data = 10;
    D(){
        C c1 = new C(this);
        c1.display();
    }
    public static void main(String [] args){
        D d1 = new D();
    }
}
