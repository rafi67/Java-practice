package Swing;

import javax.swing.*;

public class DemoJTabbedPane {
    DemoJTabbedPane() {
        test1();
    }

    private void test1() {
        JFrame f = new JFrame("JTabbedPane Example");
        JTextArea ta = new JTextArea(200,200);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tb = new JTabbedPane();
        tb.setBounds(50,50,200,200);
        p1.add(ta);
        tb.add("main", p1);
        tb.add("visit", p2);
        tb.add("help", p3);
        f.add(tb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJTabbedPane();
    }
}
