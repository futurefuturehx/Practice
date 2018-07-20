
package Day02.Morning;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import  javax.swing.JFrame;
import javax.swing.JPanel;
public class Test{
    public static void main(String[]args) throws IOException {
        JFrame f =new JFrame();
        JPanel panel =new JPanel();
        panel.setBackground(Color.BLUE);
        //JFrame就好比一个容器 JPanel是具体内容
        f.add(panel);
        //设置窗口名字
        f.setTitle("我的窗口");
        //设置窗体图标
        //设置窗口的宽和高
        f.setSize(500, 500);
        //设置窗体左上角的坐标点
        //f.setLocation(300, 300);
        //设置窗体默认在屏幕中间显示
        f.setLocationRelativeTo(null);
        //禁止窗口大小变动
        f.setResizable(false);
        //设置默认的关闭操作
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体显示
        f.setVisible(true);
    }
}