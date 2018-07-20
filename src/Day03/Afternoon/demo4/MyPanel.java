package Day03.Afternoon.demo4;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends Panel {
    BufferedImage bg;
    BufferedImage fish;
    int width;
    int height;
    int fishWidth;
    int fishHeight;
    int x;
    int y;
    public MyPanel(){
        try{
            bg=ImageIO.read(new File("imgs/timg.jpg"));
            fish=ImageIO.read(new File("imgs/fish.jpg"));
            width =bg.getWidth();
            height=bg.getHeight();
            fishWidth=fish.getWidth();
            fishHeight=fish.getHeight();
            x=200;
            y=300;
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //定义一个线程，该线程用于改变鱼的x坐标,让鱼动起来
    public void start(){
        new Thread(){
            public void run(){
                while(true){
                    x-=4;

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //告诉系统,重新调用一次paint方法
                    repaint();
                }
            };
        }.start();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //绘制鱼塘
        g.drawImage(bg,0,0,null);
        g.drawImage(fish,x,y,null);
    }
}
