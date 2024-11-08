package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends Rectangle{
	
	public int dir =1;
	public int speed = 10;
	
	public int time=0;

	public Bullet(int x, int y, int dir) {
		super(x+16, y+16, 10,10);
	}
	
	public void tick() {
		x+=speed*dir;
		time++;
		if(time == 60) {
			Player.bullets.remove(this);
			return;
		}
		
	}
	
	
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x,y,width,height);
	}
	
}
