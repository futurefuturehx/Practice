package Day04.demo9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
    MyPanel pan = new MyPanel();
    JLabel lblStart = new JLabel();
    JLabel lblHelp = new JLabel();
    JLabel lblExit = new JLabel();

    public MyFrame(String title) {
        lblStart.setIcon(new ImageIcon("imgs/start.png"));
        lblStart.setBounds(150, 100, 200, 30);
        lblStart.setEnabled(false);
        lblStart.addMouseListener(this);
        this.add(lblStart);

        lblHelp.setIcon(new ImageIcon("imgs/help.png"));
        lblHelp.setBounds(150, 160, 200, 30);
        lblHelp.setEnabled(false);
        lblHelp.addMouseListener(this);
        this.add(lblHelp);

        lblExit.setIcon(new ImageIcon("imgs/exit.png"));
        lblExit.setBounds(150, 220, 200, 30);
        lblExit.addMouseListener(this);
        lblExit.setEnabled(false);
        this.add(lblExit);

        this.add(pan);
        this.setTitle(title);
        this.setSize(pan.width, pan.height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseEntered(MouseEvent e) {
        JLabel lbl = (JLabel) e.getSource();
        if (lbl == lblStart) {
            lblStart.setEnabled(true);
            lblHelp.setEnabled(false);
            lblExit.setEnabled(false);
        }

        if (lbl == lblHelp) {
            lblStart.setEnabled(false);
            lblHelp.setEnabled(true);
            lblExit.setEnabled(false);
        }

        if (lbl == lblExit) {
            lblStart.setEnabled(false);
            lblHelp.setEnabled(false);
            lblExit.setEnabled(true);
        }
    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        lblStart.setEnabled(false);
        lblHelp.setEnabled(false);
        lblExit.setEnabled(false);
    }
}
