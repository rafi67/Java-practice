package Swing;

import javax.swing.*;
import java.awt.event.*;

public class DemoJTextField implements ActionListener {
    JTextField t, t0, t3; JButton btn1, btn2, btn3;
    DemoJTextField(){
        test1();
        test2();
    }

    private void test1() {
        JFrame f = new JFrame("JTextField Example");
        JTextField t1, t2;
        t1 = new JTextField("Welcome to Java Point");
        t2 = new JTextField("AWT Tutorial");
        t1.setBounds(50,100, 200,30);
        t2.setBounds(50,150,200,30);
        f.add(t1); f.add(t2);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void test2() {
        JFrame f = new JFrame();
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("Clear");
        t = new JTextField();
        t0 = new JTextField();
        t3 = new JTextField();
        t.setBounds(140,100,200, 50);
        t0.setBounds(140,150,200,50);
        t3.setBounds(140,200,200,50);
        btn1.setBounds(140, 250, 100, 40);
        btn2.setBounds(140,300,100,40);
        btn3.setBounds(140,350,100,40);
        f.add(btn1); f.add(btn2); f.add(t); f.add(t0); f.add(t3); f.add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String... args) {
        new DemoJTextField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t.getText());
        int n2 = Integer.parseInt(t0.getText());
        int result = 0;
        if(e.getSource()==btn3){
            t.setText(null);
            t0.setText(null);
            t3.setText(null);
        }
        if(e.getSource()==btn1){
            result = n1+n2;
        }
        else if(e.getSource()==btn2){
            result = n1-n2;
        }
        t3.setText(String.valueOf(result));
    }
}
