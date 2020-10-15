package Swing;

import javax.swing.*;
import java.awt.*;

public class DemoJDialog {
    DemoJDialog() {
        test1();
    }

    private void test1() {
        JFrame f = new JFrame();
        JDialog d = new JDialog(f,"Dialog box example");
        JButton b = new JButton("ok");
        b.addActionListener(e->d.setVisible(false));
        d.add(new JLabel("Click to continue"));
        d.add(b);
        d.setLayout(new FlowLayout());
        d.setSize(300,300);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJDialog();
    }
}
