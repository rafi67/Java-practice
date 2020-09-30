package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJPasswordField implements ActionListener {
    JLabel l1, l2, l3; JButton btn1; JPasswordField p2; JTextField tf;
    DemoJPasswordField(){
        test1();
        test2();
    }

    private void test1() {
        JFrame f = new JFrame("Password field Example");
        JLabel l = new JLabel("Password:");
        JPasswordField pf = new JPasswordField();
        l.setBounds(20, 30, 60, 40);
        pf.setBounds(80, 30,150,40);
        f.add(l); f.add(pf);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

    private void  test2() {
        JFrame f = new JFrame();
        l1 = new JLabel("Username:");
        l2 = new JLabel("Password:");
        tf = new JTextField();
        p2 = new JPasswordField();
        l3 = new JLabel();
        btn1 = new JButton("Login");
        l1.setBounds(30,40,70,40);
        l2.setBounds(30,90,70,40);
        tf.setBounds(95,50, 200, 30);
        p2.setBounds(95,100,200,30);
        btn1.setBounds(95,140,100,40);
        l3.setBounds(30,190,470, 50);
        f.add(l1);f.add(l2);f.add(l3);f.add(tf);f.add(p2);f.add(btn1);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn1.addActionListener(this);
    }

    public static void main(String... args) {
        new DemoJPasswordField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String data1 = tf.getText();
        String data2 = new String(p2.getPassword());
        l3.setText("Username: "+data1+", Password: "+data2);
    }
}
