package Day02.Afternoon.demo10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//JPanel继承自JComponent Mypanel继承自JPanel
//JComponent中有paint() 所以Mypanel可以重写paint()
public class Mypanel extends JPanel {
    //通过改造构造方法 设置最初的模样
    BufferedImage bg;
    public Mypanel(){
        try{
            bg=ImageIO.read(new File("imgs/e9b1abcd4b36ace6f1bfbee95cb20fc0.jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);//绘制一张白纸 本来就有的功能包括进来
        g.setColor(Color.RED);//设置画笔颜色
        g.setFont(new Font("宋体",Font.BOLD,24));
        g.drawLine(10,10,200,200);//设置线的起止点
        g.drawImage(bg,0,0,1000,1000,null);
    }
}
