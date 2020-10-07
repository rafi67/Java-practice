package Swing;

import javax.swing.*;

public class DemoJSlider {
    DemoJSlider() {
        test1();
        test2();
    }

    private void test1() {
        JFrame f = new JFrame();
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        JPanel panel = new JPanel();
        panel.setSize(400,50);
        panel.add(slider);
        f.add(panel);
        f.setSize(400,100);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void test2() {
        JFrame f = new JFrame("JSlider Example");
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        JPanel panel = new JPanel();
        panel.setSize(400,50);
        panel.add(slider);
        f.add(panel);
        f.setSize(400,200);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJSlider();
    }
}
