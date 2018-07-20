package daydayrun.ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class StartFrame extends JFrame implements Runnable{

	JLabel backImg;
	JProgressBar jpb;
	
	public StartFrame(){

		backImg = new JLabel(new ImageIcon("image/startFrameBg.jpg"));

		jpb = new JProgressBar();

		jpb.setStringPainted(true);

		jpb.setBackground(Color.ORANGE);
		
		this.add(backImg, BorderLayout.NORTH);
		this.add(jpb, BorderLayout.SOUTH);
		
		this.setSize(568, 349);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setIconImage(new ImageIcon("image/title.png").getImage());
		this.setVisible(true);
	}
	
	public void start() {
		StartFrame sf = new StartFrame();

		Thread th = new Thread(sf);

		th.start();
		this.dispose();
	}

	
	int[] progressValue = {0,1,5,8,14,19,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};;
	@Override
	public void run() {

		for(int i = 0; i < progressValue.length; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			jpb.setValue(progressValue[i]);
		}
		new MainFrame();
		this.dispose();
	}

	
	public static void main(String[] args) {
		new StartFrame().start();
	}
}
