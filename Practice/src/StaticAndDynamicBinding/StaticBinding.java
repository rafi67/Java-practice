package StaticAndDynamicBinding;

public class StaticBinding {
    static void sum(){
        int a = 12;
        int b = 12;
        int Sum = a+b;
        System.out.println(Sum);
    }

    private void sub(){
        int a = 24, b = 12;
        int Sub = a-b;
        System.out.println(Sub);
    }

    final void div(){
        int a = 12, b = 6;
        int Div = a/b;
        System.out.println(Div);
    }

    void display(int n){
        System.out.println(n);
    }

    void display(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String [] args){
        StaticBinding.sum();
        StaticBinding s = new StaticBinding();
        s.display(12);
        s.display(6, 2);
        s.sub();
        s.div();
    }
}
