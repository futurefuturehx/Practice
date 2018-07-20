package Day04.fish;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Fish implements Runnable{
	int x, y;
	int width, height;
	BufferedImage currentImg;
	BufferedImage[] imgs;
	int index;
	int step;
	Random rand = new Random();

	public Fish(String name) {
		imgs = new BufferedImage[10];
		try {
			for (int i = 0; i < 10; i++) {
				imgs[i] = ImageIO.read(new File("imgs/" + name + "_0" + i
						+ ".png"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		currentImg = imgs[0];
		width = currentImg.getWidth();
		height = currentImg.getHeight();
		x = rand.nextInt(800 - width);
		y = rand.nextInt(600 - height);
		index = 0;
		step = rand.nextInt(8) + 2;
	}

	public void move(){
		currentImg = imgs[index++ % imgs.length];
		x -= step;
		if(x < -width){
			disapper();
		}
	}
	
	public void disapper(){
		x = 803;
		y = rand.nextInt(600 - height);
		step = rand.nextInt(8) + 2;
	}

	public void run() {
		while(true){
			move();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
