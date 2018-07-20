package Day04.demo11;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Arrays;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener, MouseMotionListener{
    int[] x1s = {};
    int[] y1s = {};
    int[] x2s = {};
    int[] y2s = {};

    public MyPanel(){
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 0; i < x1s.length; i++){
            g.drawLine(x1s[i], y1s[i], x2s[i], y2s[i]);
        }
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        x1s = Arrays.copyOf(x1s, x1s.length + 1);
        y1s = Arrays.copyOf(y1s, y1s.length + 1);
        x2s = Arrays.copyOf(x2s, x2s.length + 1);
        y2s = Arrays.copyOf(y2s, y2s.length + 1);

        x1s[x1s.length - 1] = e.getX();
        y1s[y1s.length - 1] = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        x2s[x2s.length - 1] = e.getX();
        y2s[y2s.length - 1] = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        x2s[x2s.length - 1] = e.getX();
        y2s[y2s.length - 1] = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
