package com.sunny_xiaobai5.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.sunny_xiaobai5.entities.Food;
import com.sunny_xiaobai5.entities.Ground;
import com.sunny_xiaobai5.entities.Snake;
import com.sunny_xiaobai5.util.Global;

public class GamePanel extends JPanel {

	private Snake snake;
	private Food food;
	private Ground ground;

	// 显示各个对象
	public void display(Snake snake, Food food, Ground ground) {
		System.out.println("GamePanel's display");
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.repaint();// 该方法将调用paintComponent方法重绘
	}

	@Override
	// 覆盖该方法，用于重绘
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(0xffffff));
		g.fillRect(0, 0, Global.WIDTH * Global.CELL_SIZE, Global.HEIGHT
				* Global.CELL_SIZE);
		if (snake != null && food != null && ground != null) {
			this.snake.drawMe(g);
			this.food.drawMe();
			this.ground.drawMe();
		}
	}
}
