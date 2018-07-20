package Day03.Afternoon.demo4;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        MyPanel mp=new MyPanel();
        f.setTitle("捕鱼达人");
        f.setSize(mp.width,mp.height);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        mp.start();
    }
}
