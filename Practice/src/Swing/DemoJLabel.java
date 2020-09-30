package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoJLabel extends Frame implements ActionListener {
    JButton b; JLabel l; JTextField tf;
    DemoJLabel(){
        test2();
    }

    private void test1() {
        JFrame f = new JFrame("Label Example");
        JLabel l1 = new JLabel("First Label");
        JLabel l2 = new JLabel("Second Label");
        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100,30);
        f.add(l1);
        f.add(l2);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void test2() {
        b = new JButton("Find IP");
        JButton b2 = new JButton("Exit");
        tf = new JTextField();
        l = new JLabel();
        b.setBounds(50,150,95,30);
        b2.setBounds(50, 200, 95,30);
        l.setBounds(50,100,250,20);
        tf.setBounds(50,50,150,20);
        add(b); add(tf); add(l); add(b2);
        b.addActionListener(this);
        b2.addActionListener(e -> System.exit(0));
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+"is "+ip);
        }
        catch(Exception ex){
            tf.setText(String.valueOf(ex));
        }
    }

    public static void main(String... args) {
        new DemoJLabel();
    }
}
