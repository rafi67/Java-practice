package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJRadioButton extends JFrame implements ActionListener {
    JRadioButton R1,R2; JButton btn1;
    DemoJRadioButton(){
        test1();
        test2();
    }

    private void test1() {
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        r1.setBounds(50,30,60,30);
        r2.setBounds(50,80,70,30);
        bg.add(r1);bg.add(r2);
        add(r1);add(r2);
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void test2() {
        R1 = new JRadioButton("Male");
        R2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        btn1 = new JButton("click");
        R1.setBounds(30,40,60,30);
        R2.setBounds(30,90,70,30);
        btn1.setBounds(30,140,100,30);
        bg.add(R1);bg.add(R2);
        add(R1);add(R2);add(btn1);
        setSize(300,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        btn1.addActionListener(this);
    }

    public static void main(String... args) {
        new DemoJRadioButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(R1.isSelected())
            JOptionPane.showMessageDialog(this,"You are Male.");

        else if(R2.isSelected())
            JOptionPane.showMessageDialog(this, "You are Female");
    }
}
