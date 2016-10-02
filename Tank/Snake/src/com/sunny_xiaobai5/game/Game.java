package com.sunny_xiaobai5.game;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.sunny_xiaobai5.controller.Controller;
import com.sunny_xiaobai5.entities.Food;
import com.sunny_xiaobai5.entities.Ground;
import com.sunny_xiaobai5.entities.Snake;
import com.sunny_xiaobai5.util.Global;
import com.sunny_xiaobai5.view.GamePanel;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake snake = new Snake();
		Food food = new Food();
		Ground ground = new Ground();
		GamePanel gamePanel = new GamePanel();
		Controller controller = new Controller(snake, food, ground, gamePanel);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Global.WIDTH * Global.CELL_SIZE, Global.HEIGHT
				* Global.CELL_SIZE);
		frame.add(gamePanel, BorderLayout.CENTER);

		frame.setResizable(false);
		gamePanel.addKeyListener(controller);
		snake.addSnakeListener(controller);
		frame.addKeyListener(controller);

		frame.setVisible(true);
		controller.newGame();
	}

}
