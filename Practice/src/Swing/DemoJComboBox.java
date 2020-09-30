package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJComboBox extends JFrame implements ActionListener {
    JLabel l; JComboBox<String>cb; JButton btn1;
    DemoJComboBox(){
        test1();
        test2();
    }

    private void test1() {
        setTitle("ComboBox Example");
        String[]country = {"U.S.A", "India", "England", "Newzealand"};
        JComboBox<String>j = new JComboBox<>(country);
        j.setBounds(30,50,150,30);
        add(j);
        setSize(300,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void test2() {
        l = new JLabel();
        String[]language = {"C", "C++", "C#", "Java", "PHP"};
        cb = new JComboBox<>(language);
        btn1 = new JButton("Show");
        l.setBounds(20, 20,350, 30);
        cb.setBounds(20,70,100,30);
        btn1.setBounds(150,70,70,30);
        add(l);add(cb);add(btn1);
        setSize(400,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        btn1.addActionListener(this);
    }

    public static void main(String... args) {
        new DemoJComboBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String data = cb.getItemAt(cb.getSelectedIndex());
        l.setText("Porgramming Language Selected: "+data);
    }
}
