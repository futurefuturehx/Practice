package daydayrun.ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import daydayrun.entity.Person;

public class EndFrame extends JFrame implements MouseListener{
	JLabel lblAgain, lblMain;
	Image image;
	Person p;

	public EndFrame(Person p){
		this.p = p;
		lblAgain =  new JLabel(new ImageIcon("image/again.png"));
		lblAgain.addMouseListener(this);
		lblAgain.setBounds(360, 250, 60, 25);
		
		lblMain = new JLabel(new ImageIcon("image/endMain.png"));
		lblMain.addMouseListener(this);
		lblMain.setBounds(480, 250, 60, 25);
		
		BackEnd be = new BackEnd(p);
		be.setBounds(0, 0, 599, 384);
		
		this.add(lblAgain);
		this.add(lblMain);
		this.add(be);
		this.setLayout(null);
		this.setSize(599, 384);
		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/end_1.png").getImage());
		this.setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == lblAgain){

			new StartFrame().start();
			this.dispose();
		}
		
		if(e.getSource() == lblMain){
			new OptionFrame();
			this.dispose();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	
	public static void main(String[] args) {
		Person p = new Person();
		new EndFrame(p);
	}
}


class BackEnd extends JPanel{
	Image img;
	Person p;
	
	public BackEnd(Person p){
		this.p = p;
		try {
			img = ImageIO.read(new File("image/end.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, 0, 0, 599, 384, null);
		g.drawString("总分 : " + p.getScore(), 438, 302);
	}
}
