package Day03.Morning.demo5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton btn=new JButton("1");
        ActionListener al =new ActionListener() {
            @Override
            //监听之后做的操作直接实现于监听器内
            public void actionPerformed(ActionEvent e) {
                //获得被点击的按钮对象
                JButton btn=(JButton)e.getSource();
                //获得按钮上的值
                String strNum=btn.getText();
                //String->int
                int num=Integer.parseInt(strNum);
                //num自增
                num++;
                //将值显示在按钮上
                btn.setText(num+"");
            }
        };
        //向按钮里面嵌入监听器
        btn.addActionListener(al);
        f.add(btn);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
