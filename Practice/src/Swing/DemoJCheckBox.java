package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class DemoJCheckBox extends JFrame implements ActionListener {
    JLabel l1; JCheckBox C1,C2;
    JButton btn1; JLabel l; JCheckBox ch1,ch2,ch3;
    DemoJCheckBox(){
        test1();
        test2();
        test3();
    }

    private void test1() {
        JFrame f = new JFrame("CheckBox Example");
        JCheckBox c1 = new JCheckBox("C++");
        JCheckBox c2 = new JCheckBox("Java", true);
        c1.setBounds(100,100,50,70);
        c2.setBounds(100,150,70,70);
        f.add(c1);f.add(c2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void test2() {
        JFrame f = new JFrame("CheckBox Example");
        l1 = new JLabel();
        C1 = new JCheckBox("C++");
        C2 = new JCheckBox("Java");
        l1.setBounds(30,20,250,20);
        C1.setBounds(150,100,50,50);
        C2.setBounds(150,150,70,50);
        f.add(l1);f.add(C1);f.add(C2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        C1.addItemListener(e -> l1.setText("C++ CheckBox: "+
                (e.getStateChange()== ItemEvent.SELECTED ?"Checked":
                "Unchecked")));
        C2.addItemListener(e -> l1.setText("Java CheckBox: "+
                (e.getStateChange()==ItemEvent.SELECTED ?"Checked":
                "Unchecked")));
    }

    private void test3() {
        JFrame f = new JFrame();
        l = new JLabel("Food Ordering System");
        ch1 = new JCheckBox("Pizza @ 100");
        ch2 = new JCheckBox("Burger @ 30");
        ch3 = new JCheckBox("Tea @ 10");
        btn1 = new JButton("Order");
        l.setBounds(50,40,250,20);
        ch1.setBounds(60,140,100,50);
        ch2.setBounds(60,240,100,50);
        ch3.setBounds(60,340,100,50);
        btn1.setBounds(60,440,100,50);
        f.add(l);f.add(ch1);f.add(ch2);f.add(ch3);f.add(btn1);
        f.setSize(700,700);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn1.addActionListener(this);
    }

    public static void main(String... args) {
        new DemoJCheckBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount =0;
        String message = "";
        if(ch1.isSelected()){
            amount +=100;
            message = "Pizza: 100\n";
        }
        if(ch2.isSelected()){
            amount +=30;
            message += "Burger: 30\n";
        }
        if(ch3.isSelected()){
            amount +=10;
            message += "Tea: 10\n";
        }
        message+= "------------------------\n";
        JOptionPane.showMessageDialog(this,message+"Total: "+amount);
    }
}
