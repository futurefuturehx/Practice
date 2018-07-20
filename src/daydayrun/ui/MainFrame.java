package daydayrun.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public static final int WIDTH = 1000;
	public static final int HEIGHT = 550;

	GamePanel gp = null;
	
	public MainFrame(){

		gp = new GamePanel();
		
		gp.action();
		this.addKeyListener(gp);
		this.add(gp);

		this.setSize(WIDTH, HEIGHT);
		this.setTitle("天天酷跑");
		this.setResizable(false);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/title.png").getImage());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		while(true){
			if(gp.isOver == true){
				this.dispose();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
