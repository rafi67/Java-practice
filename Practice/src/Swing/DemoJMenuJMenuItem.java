package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJMenuJMenuItem implements ActionListener {
    DemoJMenuJMenuItem(){
        test1();
        test2();
    }

    JMenu menu, submenu;
    JMenuItem item1,item2,item3,item4,item5;

    private void test1() {
        JMenuBar mb = new JMenuBar();
        JFrame f = new JFrame("JMenu Example");
        menu = new JMenu("Menu");
        submenu = new JMenu("SubMenu");
        item1 = new JMenuItem("Item1");
        item2 = new JMenuItem("Item2");
        item3 = new JMenuItem("Item3");
        item4 = new JMenuItem("Item4");
        item5 = new JMenuItem("Item5");
        mb.setBounds(1,1,400,20);
        menu.add(item1);menu.add(item2);menu.add(item3);menu.add(submenu);
        submenu.add(item4);submenu.add(item5);
        mb.add(menu);
        f.add(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    JMenu File,Edit,Help;
    JMenuBar MB;
    JMenuItem copy,paste,cut,selectAll;
    JTextArea ta;

    private void test2() {
        JFrame f = new JFrame("Menu Example");
        ta = new JTextArea();
        MB = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Help = new JMenu("Help");
        copy = new JMenuItem("copy");
        cut = new JMenuItem("cut");
        paste = new JMenuItem("past");
        selectAll = new JMenuItem("select all");
        MB.setBounds(1,1,400,20);
        ta.setBounds(3,23,397,370);
        Edit.add(copy);Edit.add(cut);Edit.add(paste);Edit.add(selectAll);
        MB.add(File);MB.add(Edit);MB.add(Help);
        f.add(MB);f.add(ta);
        f.setSize(400,400);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJMenuJMenuItem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==copy) ta.copy();
        else if(e.getSource()==cut) ta.cut();
        else if(e.getSource()==paste) ta.paste();
        else if(e.getSource()==selectAll) ta.selectAll();
    }
}
