package Swing;

import javax.swing.*;

public class DemoSwing2 extends JFrame {
    DemoSwing2(){
        JButton b = new JButton("click");
        b.setBounds(140,200,100,40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String... args) {
        new DemoSwing2();
    }
}
