package Day04.fish;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private Pool pool = new Pool();
	
	public MyFrame(){
		this.add(pool);
		this.setTitle("捕鱼达人");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		pool.start();
	}
}
