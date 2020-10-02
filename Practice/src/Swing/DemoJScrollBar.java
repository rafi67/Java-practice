package Swing;

import javax.swing.*;

public class DemoJScrollBar {
    DemoJScrollBar(){
        test1();
        test2();
    }

    private void test1() {
        JFrame f = new JFrame("JScrollBar Example");
        JScrollBar s = new JScrollBar();
        s.setBounds(100,100,25,100);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void test2() {
        JFrame f = new JFrame("JScrollBar Example");
        JLabel l = new JLabel();
        l.setSize(400,100);
        l.setHorizontalAlignment(JLabel.CENTER);
        JScrollBar s = new JScrollBar();
        s.setBounds(100,100,20,100);
        f.add(l);f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        s.addAdjustmentListener(e -> l.setText("Vertical scroll value is "+s.getValue()));
    }

    public static void main(String... args) {
        new DemoJScrollBar();
    }
}
