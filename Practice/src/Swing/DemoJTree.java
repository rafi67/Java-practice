package Swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class DemoJTree {
    DemoJTree() {
        test1();
    }

    private void test1() {
        JFrame f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blude");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
        color.add(red);color.add(green);color.add(blue);color.add(black);
        JTree tree = new JTree(style);
        tree.setBounds(1,1,200,140);
        f.add(tree);
        f.setSize(200,200);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String... args) {
        new DemoJTree();
    }
}
