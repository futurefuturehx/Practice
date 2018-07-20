package Day02.Afternoon.demo10;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //JFrame是外部框架
        JFrame f=new JFrame();
        //JPanel是具体内容
  //      JPanel pan =new JPanel();
        Mypanel mp=new Mypanel();
        f.add(mp);
        f.setTitle("绘制鱼池");
        f.setSize(1000,1000);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
