package Swing;

import javax.swing.*;

public class DemoJSpinner {
    DemoJSpinner() {
        test1();
        test2();
    }

    private void test1() {
        JFrame f = new JFrame("JSpinner Example");
        SpinnerModel value = new SpinnerNumberModel(5,0,10,1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        f.add(spinner);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void test2() {
        JFrame f = new JFrame("JSpinner Example");
        JLabel l = new JLabel();
        SpinnerModel value = new SpinnerNumberModel(5,0,10,1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        l.setBounds(100,70,60,20);
        f.add(spinner);f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        spinner.addChangeListener(e -> l.setText("Value: "+((JSpinner)e.getSource()).getValue()));
    }

    public static void main(String... args) {
        new DemoJSpinner();
    }
}
