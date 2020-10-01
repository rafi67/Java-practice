package Swing;

import javax.swing.*;

public class DemoJList extends JFrame {
    DemoJList(){
        test2();
    }

    private void test1() {
        DefaultListModel<String>l = new DefaultListModel<>();
        l.addElement("Rafi");
        l.addElement("Fahim");
        l.addElement("Shafil");
        l.addElement("Jannat");
        JList<String>list = new JList<>(l);
        JFrame f = new JFrame("JList Example");
        list.setBounds(100,100,75,75);
        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void test2() {
        JFrame f = new JFrame("JList Example");
        JButton b = new JButton("Show");
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("C");
        l.addElement("C++");
        l.addElement("Java");
        l.addElement("PHP");
        DefaultListModel<String>l2 = new DefaultListModel<>();
        l2.addElement("Speing");
        l2.addElement("DJango");
        l2.addElement("Symfony");
        l2.addElement(".Net");
        JList<String>list1 = new JList<>(l);
        JList<String>list2 = new JList<>(l2);
        list1.setBounds(150,20,75,75);
        list2.setBounds(250,20,75,75);
        b.setBounds(150,100,100,30);
        f.add(list1);f.add(list2);f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        b.addActionListener(e->{
            String Data = null;
           if(list1.isSelectedIndex(0)) Data = "Language Selected "+list1.getSelectedValue();

           if(list2.isSelectedIndex(0)) Data = "Framework Selected "+list2.getSelectedValue();
           if(list1.isSelectedIndex(0)&&list2.isSelectedIndex(0))
               Data = "Language Selected "+list1.getSelectedValue()+" and Framework selected "+
                       list2.getSelectedValue();
           JOptionPane.showMessageDialog(this,Data);
        });
    }

    public static void main(String... args) {
        new DemoJList();
    }
}
