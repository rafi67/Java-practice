package Swing;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class DemoJCheckBoxMenuItem {
    DemoJCheckBoxMenuItem(){
        test1();
    }

    private void test1() {
        JFrame f = new JFrame("JCheckBoxMenuItem Example");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem mi = new JMenuItem("Open");
        JCheckBoxMenuItem cbmi = new JCheckBoxMenuItem("Option-1");
        mb.setBounds(1,1,400,20);
        menu.add(mi);menu.add(cbmi);
        mb.add(menu);
        f.add(mb);
        cbmi.setMnemonic(KeyEvent.VK_C);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        ActionListener actionL = e -> {
            String newLabel;
            AbstractButton aButton = (AbstractButton) e.getSource();
            boolean selected = aButton.getModel().isSelected();
            if(selected)
                newLabel = "Value-1";
            else
                newLabel = "Value-2";
            aButton.setText(newLabel);
            System.gc();
        };
        cbmi.addActionListener(actionL);
    }

    public static void main(String... args) {
        new DemoJCheckBoxMenuItem();
    }
}
