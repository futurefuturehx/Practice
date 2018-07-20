package Day04.demo3;
import javax.swing.*;
import java.awt.*;

//LayoutManager
//  Borderlayout 边界布局
//      划分为 上北 下南 左西 右东 中间
//  FlowLayout 流布局
//      从左到右 从上到下 依次排列
//  GridLayout
//  CardLayout
//  GridLayout
//  null 表示不使用布局管理器
//
public class MyFrame extends Frame {

    JButton btn1=new JButton("1");
    JButton btn2=new JButton("2");
    JButton btn3=new JButton("3");
    JButton btn4=new JButton("4");
    JButton btn5=new JButton("5");
    JButton btn6=new JButton("6");
    public MyFrame(String title){
        FlowLayout border=new FlowLayout();
        this.setLayout(border);
        //将按钮添加到窗体中
        //有了布局管理器 指定按钮位置
        this.add(btn1,BorderLayout.NORTH);
        this.add(btn2,BorderLayout.SOUTH);
        this.add(btn3,BorderLayout.WEST);
        this.add(btn4,BorderLayout.EAST);
        this.add(btn5,BorderLayout.CENTER);
        this.setTitle(title);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
