package Swing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DemoJPopupMenu {
    DemoJPopupMenu(){
        test1();
        test2();
    }

    private void test1() {
        final JFrame f = new JFrame("JPopupMenu Example");
        final JPopupMenu pm = new JPopupMenu("Edit");
        JMenuItem i1 = new JMenuItem("copy");
        JMenuItem i2 = new JMenuItem("cut");
        JMenuItem i3 = new JMenuItem("paste");
        pm.add(i1);pm.add(i2);pm.add(i3);
        f.add(pm);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pm.show(f, e.getX(), e.getY());
            }
        });
        f.setVisible(true);
    }

    private void test2() {
        JFrame f = new JFrame("PopUp Menu Example");
        JLabel l = new JLabel();
        JPopupMenu pm = new JPopupMenu("Edit");
        JMenuItem i1 = new JMenuItem("copy");
        JMenuItem i2 = new JMenuItem("cut");
        JMenuItem i3 = new JMenuItem("paste");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(200,20);
        pm.add(i1);pm.add(i2);pm.add(i3);
        f.add(pm);f.add(l);
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        i1.addActionListener(e -> l.setText("MenuItem copy clicked"));
        i2.addActionListener(e -> l.setText("MenuItem cut clicked"));
        i3.addActionListener(e -> l.setText("MenuItem paste clicked"));
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pm.show(f,e.getX(),e.getY());
            }
        });
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJPopupMenu();
    }
}
