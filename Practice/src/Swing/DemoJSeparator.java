package Swing;

import javax.swing.*;

public class DemoJSeparator {
    DemoJSeparator() {
        test1();
    }

    private void test1() {
        JFrame f = new JFrame("Separator Example");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem i1 = new JMenuItem("Item-1");
        JMenuItem i2 = new JMenuItem("Item-2");
        mb.setBounds(1,1,400,20);
        menu.add(i1);
        JSeparator sp = new JSeparator();
        menu.add(sp);
        menu.add(i2);
        mb.add(menu);
        f.add(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJSeparator();
    }
}
