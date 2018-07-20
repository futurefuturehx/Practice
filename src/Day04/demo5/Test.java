package Day04.demo5;

import javax.swing.*;
//分清事件源 事件处理者 添加监听 发生事件
public class Test {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        //btn 事件源
        JButton btn=new JButton("1");
        //添加事件处理者对象
        //如果点击按钮 系统会自动生成一个事件对象 ActionEvent对象
        //该对象会自动传入事件处理者类中的处理函数
        btn.addActionListener(new MyHandler());
        f.add(btn);
        f.setSize(600,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
