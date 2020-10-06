package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJColorChooser extends JFrame implements ActionListener {
    DemoJColorChooser() {
        test1();
        test2();
    }

    JButton b; Container c;

    private void test1() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setSize(400,400);
        b = new JButton("ok");
        b.setBounds(175,190,50,20);
        c.add(b);
        b.addActionListener(this);
        setSize(400,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void test2() {
        JFrame f = new JFrame("Color Chooser Example");
        JTextArea ta = new JTextArea();
        JButton btn = new JButton("ok");
        ta.setBounds(1,1,400,400);
        btn.setBounds(175,430,50,20);
        f.add(ta);f.add(btn);
        f.setSize(400,500);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        btn.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this,
                    "Select a color",Color.RED);
            ta.setBackground(color);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color initialColor = Color.RED;
        Color color = JColorChooser.showDialog(this,"Select a color",initialColor);
        c.setBackground(color);
    }

    public static void main(String... args) {
        new DemoJColorChooser();
    }
}
