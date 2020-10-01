package Swing;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoJOptionPane extends JFrame {
    DemoJOptionPane(){
        test1();
        test2();
        test3();
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

    JFrame F;

    private void test3() {
        F = new JFrame();
        F.setSize(400,400);
        F.setLayout(null);
        F.setLocationRelativeTo(null);
        F.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed =
                        JOptionPane.showConfirmDialog(null,"Are you sure?",
                        "Exit",JOptionPane.YES_NO_OPTION);
                if(confirmed == JOptionPane.YES_OPTION)
                    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        F.setVisible(true);

    }

    public static void main(String... args) {
        new DemoJOptionPane();
    }
}
