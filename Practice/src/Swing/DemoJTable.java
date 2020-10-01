package Swing;

import javax.swing.*;

public class DemoJTable extends JFrame {
    DemoJTable(){
        test1();
        test2();
    }

    private void test1() {
        JFrame f = new JFrame();
        String[][]data = {{"1","Rafi","23"},{"2","Fahim","22"},{"3","Shafil","21"},
                {"4","Rezuan","24"},{"5","Sobuj","22"},{"6","Basir","22"}};
        String[]column = {"ROLL","NAME","AGE"};
        final JTable jt = new JTable(data,column);
        jt.setBounds(30,90,200,150);
        f.add(jt);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void test2() {
        String[][]data = {{"1","Rafi","23"},{"2","Shafil","22"},{"3","Fahim","22"}};
        String[]column = {"Roll","Name","Age"};
        JTable jt = new JTable(data,column);
        jt.setBounds(30,20,200,300);
        add(jt);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(e -> {
           String Data = null;
           int[]rows = jt.getSelectedRows();
           int[]columns = jt.getSelectedColumns();
           for(int r:rows){
               for(int c:columns){
                   Data = (String) jt.getValueAt(r,c);
               }
           }
           JOptionPane.showMessageDialog(this,"Selected Element is "+Data);
        });
    }

    public static void main(String... args) {
        new DemoJTable();
    }
}
