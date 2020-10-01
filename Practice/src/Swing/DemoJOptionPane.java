package Swing;

import javax.swing.*;

public class DemoJOptionPane extends JFrame {
    DemoJOptionPane(){
        test1();
        test2();
    }

    private void test1(){
        JOptionPane.showMessageDialog(this,"Welcome to Java Programming");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void test2() {
        JFrame f = new JFrame();
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JLabel l = new JLabel("Your Name is "+name);
        l.setBounds(30,20,150,30);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJOptionPane();
    }
}
