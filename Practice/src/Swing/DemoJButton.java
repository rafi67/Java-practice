package Swing;

import javax.swing.*;

public class DemoJButton {
    private static void ui() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        final JTextField tf = new JTextField();
        b.setBounds(140, 200, 100, 40);
        tf.setBounds(140, 150, 100,30);
        f.add(b);
        f.add(tf);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(e -> tf.setText("Hello World"));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void ui2() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("C:\\Users\\rafis\\Desktop\\icon.png"));
        b.setBounds(100,100,100,200);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(e -> System.exit(0));
    }

    public static void main(String... args) {
        ui();
        ui2();
    }
}
