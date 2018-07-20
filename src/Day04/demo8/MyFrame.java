package Day04.demo8;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements MouseListener{
    private JPanel pan = new JPanel();

    public MyFrame(String title){
        pan.addMouseListener(this);
        this.add(pan);
        this.setTitle(title);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        pan.setBackground(Color.GREEN);
    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        pan.setBackground(Color.BLUE);
    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        pan.setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        pan.setBackground(Color.BLACK);
    }
}