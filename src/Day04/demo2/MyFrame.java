package Day04.demo2;
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
    JButton btn7=new JButton("7");
    JPanel pan=new JPanel();//中间容器必须依赖底层容器
    public MyFrame(String title){
        BorderLayout border=new BorderLayout();
        this.setLayout(border);
        //将按钮添加到窗体中
        //有了布局管理器 指定按钮位置
        this.add(btn1,BorderLayout.NORTH);
        this.add(btn2,BorderLayout.SOUTH);
        this.add(btn3,BorderLayout.WEST);
        this.add(btn4,BorderLayout.EAST);
        pan.add(btn5);//Jpanel自己默认的布局是FlowLayout
        pan.add(btn6);
        pan.add(btn7);
        this.add(pan,BorderLayout.CENTER);
        this.setTitle(title);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
