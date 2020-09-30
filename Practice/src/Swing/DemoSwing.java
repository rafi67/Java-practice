package Swing;

import javax.swing.*;

public class DemoSwing {
    DemoSwing(){
        uiTest1();
    }

    private static void uiTest1() {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(140,200, 100, 40);
        b.setName("btn");
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoSwing();
    }
}