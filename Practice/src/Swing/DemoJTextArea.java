package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJTextArea implements ActionListener {
    JButton btn1;
    JTextArea t;
    JLabel l1,l2;
    DemoJTextArea(){
        test1();
        test2();
    }

    private void test1() {
        JFrame f = new JFrame();
        JTextArea ta = new JTextArea("Welcome to javapoint");
        ta.setBounds(10,30,200,200);
        f.add(ta);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

    private void test2() {
        JFrame f = new JFrame();
        l1 = new JLabel();
        l2 = new JLabel();
        btn1 = new JButton("Count Words");
        t = new JTextArea();
        l1.setBounds(50,50, 80, 30);
        l2.setBounds(200, 50, 100, 30);
        t.setBounds(50,100, 300,300);
        btn1.setBounds(100,450, 200,40);
        f.add(btn1); f.add(t); f.add(l1); f.add(l2);
        f.setSize(400,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        btn1.addActionListener(this);
    }

    public static void main(String... args) {
        new DemoJTextArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = t.getText();
        String [] word = text.split("\\s");
        l1.setText("Words: "+word.length);
        l2.setText("Characters: "+text.length());
    }
}
