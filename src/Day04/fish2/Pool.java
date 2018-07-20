package Day04.fish2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pool extends JPanel{
	int score = 100;
	BufferedImage bg;
	int width;
	int height;
//	Fish f;
	Fish[] fishes;
	
	public Pool(){
		try {
			bg = ImageIO.read(new File("imgs/bg.jpg"));
			width = bg.getWidth();
			height = bg.getHeight();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		f = new Fish("fish13");
		fishes = new Fish[22];
		for(int i = 0; i < 9; i++){
			fishes[i] = new Fish("fish0" + (i + 1));
			fishes[i + 9] = new Fish("fish0" + (i + 1));
		}
		fishes[18] = new Fish("fish13");
		fishes[19] = new Fish("fish13");
		fishes[20] = new Fish("fish14");
		fishes[21] = new Fish("fish14");
	}
	
	public void start(){
		for(int i = 0; i < fishes.length; i++){
			new Thread(fishes[i]).start();
		}
		while(true){
			repaint();
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bg, 0, 0, 800, 600, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("����", Font.BOLD, 20));
		g.drawString("分数 : " + score, 50, 50);
		for(int i = 0; i < fishes.length; i++){
			Fish f = fishes[i];
			g.drawImage(f.currentImg, f.x, f.y, null);
		}
	}
}
