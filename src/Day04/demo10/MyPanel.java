package Day04.demo10;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
    private BufferedImage bg;
    private BufferedImage boy;
    int x;
    int y;
    int width;
    int height;


    public MyPanel() {
        try {
            bg = ImageIO.read(new File("imgs/mainBg.png"));
            boy = ImageIO.read(new File("imgs/1.png"));
            x = 170;
            y = 350;
            width = boy.getWidth();
            height = boy.getHeight();
            // mainWidth = bg.getWidth();
            // mainHeigth = bg.getHeight();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bg, 0, 0, 800, 600, null);
        g.drawImage(boy, x, y, null);
    }

    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 2;
            repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 2;
            repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 2;
            repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 2;
            repaint();
        }
    }

    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
