package Day04.demo9;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    int width;
    int height;
    BufferedImage bg;
    public MyPanel(){
        try {
            bg = ImageIO.read(new File("imgs/101.jpg"));
            width = bg.getWidth();
            height = bg.getHeight();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.drawImage(bg, 0, 0, null);
    }

}
