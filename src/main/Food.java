package main;

import java.awt.*;

public class Food extends Point {

	static final int size = GamePanel.UNIT_SIZE;

	public Food(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	

	public boolean checkFoodCollide(Point head) {
		int x = head.x;
		int y = head.y;
		return x < this.x + size && x + size > this.x && y < this.y + size && y + size > this.y;
	}
	


	public void draw(Graphics g) {
		g.setColor(new Color(204,4,4));
		g.fillOval(x, y, size, size);
	}

}