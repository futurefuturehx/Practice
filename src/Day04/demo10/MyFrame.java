package Day04.demo10;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
    MyPanel pan = new MyPanel();

    public MyFrame(String title){
        this.addKeyListener(pan);
        this.add(pan);
        this.setTitle(title);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}