package daydayrun.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import daydayrun.entity.Barrs_1;
import daydayrun.entity.Gold;
import daydayrun.entity.Person;
import daydayrun.entity.Pet;


public class GamePanel extends JPanel implements KeyListener {

	public boolean isOver = false;

	private Image background;

	private Image showfield;

	private Image distancefield;


	Person person;

	Pet pet;

	Barrs_1[] bars1 = {};

	Gold[] golds = {};

	public GamePanel() {
		person = new Person();
		pet = new Pet(person);
		background = new ImageIcon("image/mainBg.png").getImage();

		showfield = new ImageIcon("image/fieldinfo.png").getImage();

		distancefield = new ImageIcon("image/fieldinfo.png").getImage();
	}

	int a = 0;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		a--;

		g.drawImage(background, a, 0, MainFrame.WIDTH, MainFrame.HEIGHT, null);
		g.drawImage(background, MainFrame.WIDTH + a, 0, MainFrame.WIDTH, MainFrame.HEIGHT, null);
		if (a == -MainFrame.WIDTH) {
			a = 0;
		}
		//函数就是变量 包装变形后的变量 不断创造动作 用公式表达出来 以后自然会用到 不断转化
		g.drawImage(showfield, 120, 30, 150, 30, null);
		g.setColor(Color.ORANGE);
		g.setFont(new Font("4", Font.BOLD, 16));
		g.drawString(String.valueOf(person.getScore())+"分", 145, 50);
		g.drawImage(distancefield, 350, 30, 150, 30, null);
		g.drawString(String.valueOf(person.getLife())+"命", 375, 50);

		person.paintPerson(g);

		pet.paintPet(g);

		for (int i = 0; i < bars1.length; i++) {
			bars1[i].paintBarr_1(g);
		}

		for (int i = 0; i < golds.length; i++) {
			golds[i].paintGold(g);
		}
	}

	public void stepAction() {
		person.drop();
		person.step();
		pet.step();

		for (int i = 0; i < bars1.length; i++) {
			bars1[i].step();
		}

		// 
		for (int i = 0; i < golds.length; i++) {
			golds[i].step();
		}
	}

	int index = 0;

	public void enteredAction() {
		index++;

		if (index % 500 == 0) {

			Barrs_1 b = new Barrs_1();

			bars1 = Arrays.copyOf(bars1, bars1.length + 1);

			bars1[bars1.length - 1] = b;
		}

		if (index % 30 == 0) {

			Gold b = new Gold();

			golds = Arrays.copyOf(golds, golds.length + 1);

			golds[golds.length - 1] = b;
		}
	}

	boolean flag = true;

	public void wardAction() {

		for (int i = 0; i < bars1.length; i++) {

			if (person.getY() + person.HEIGHT > bars1[i].getY() && person.getY() < bars1[i].getY() + bars1[i].HEIGHT
					&& person.getX() + person.WIDTH > bars1[i].getX()
					&& person.getX() < bars1[i].getX() + bars1[i].WIDTH) {

				person.setX(bars1[i].getX() - person.WIDTH);
				// flag = false;
			}
		}

		for (int i = 0; i < golds.length; i++) {
			if (person.getX() + person.WIDTH > golds[i].getX() && person.getX() < golds[i].getX() + golds[i].WIDTH
					&& person.getY() + person.HEIGHT > golds[i].getY()
					&& person.getY() < golds[i].getY() + golds[i].HEIGHT) {

				int s = person.getScore();
				person.setScore(s + 100);

				golds[i] = golds[golds.length - 1];
				golds = Arrays.copyOf(golds, golds.length - 1);
			}
		}
	}

	public void gameOverAction() {
		if (person.getX() + person.WIDTH <= 0 || person.getLife() <= 0) {
			JOptionPane.showMessageDialog(null, "你已阵亡");
			isOver = true;
			flag = false;
			new EndFrame(person);
		}
	}

	public void action() {
		new Thread() {
			public void run() {
				while (true) {
					if (flag) {
						enteredAction();
						stepAction();
						wardAction();
						gameOverAction();
					}

					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int x = person.getX();
		int y = person.getY();

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			person.setY(y - 120);
			if(flag == false){
				flag = true;
			}
		}
		
		if(person.getY() <= 20){
			person.setY(y);
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			person.setY(y + 120);
		}
		
		if(person.getY() >= 315){
			person.setY(315);
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			person.setX(x - 20);
			pet.setDx(pet.getDx() - 20);
			if(person.getX() <= 0){
				person.setX(0);
				pet.setDx(person.image.getWidth() + 20);
			}
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(flag){
				person.setX(x + 20);
				pet.setDx(pet.getDx() + 20);
			}
		}
		
		if(pet.getDx() >= MainFrame.WIDTH - pet.dimage.getWidth()){
			person.setX(MainFrame.WIDTH - pet.dimage.getWidth() - 85);
			pet.setDx(MainFrame.WIDTH - pet.dimage.getWidth());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
