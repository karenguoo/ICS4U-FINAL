package main;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Food {
	public static Map<Integer, Food> foods = new HashMap<Integer, Food>();

	int x, y;
	static final int size = GamePanel.UNIT_SIZE;

	public Food(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public boolean checkCollide(Point head) {
		int x = head.x;
		int y = head.y;
		return x < this.x + size && x + size > this.x && y < this.y + size && y + size > this.y;
	}

	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, size, size);
	}

}