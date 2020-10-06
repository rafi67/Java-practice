package Swing;

import javax.swing.*;

public class DemoJProgressBar extends JFrame {
    JProgressBar jp;
    DemoJProgressBar() {
        jp = new JProgressBar(0,2000);
        jp.setBounds(40,40,160,30);
        jp.setValue(0);
        jp.setStringPainted(true);
        add(jp);
        setSize(230,150);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iterate() {
        int i=0;
        while(i<=2000){
            jp.setValue(i);
            i=i+20;
            try{
                Thread.sleep(150);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String... args) {
        DemoJProgressBar m = new DemoJProgressBar();
        m.setVisible(true);
        m.iterate();
    }
}
