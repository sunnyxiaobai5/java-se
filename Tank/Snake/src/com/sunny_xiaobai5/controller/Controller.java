package com.sunny_xiaobai5.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.sunny_xiaobai5.entities.Food;
import com.sunny_xiaobai5.entities.Ground;
import com.sunny_xiaobai5.entities.Snake;
import com.sunny_xiaobai5.listener.SnakeListener;
import com.sunny_xiaobai5.view.GamePanel;

//该类用于处理用户按键事件和处理逻辑
//继承KeyAdapter，因为只用到其中一个方法
//实现蛇的监听器借口
public class Controller extends KeyAdapter implements SnakeListener{

	private Snake snake;
	private Food food;
	private Ground ground;
	private GamePanel gamePanel;
	
	public Controller(Snake snake, Food food, Ground ground, GamePanel gamePanel) {
		super();
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.gamePanel = gamePanel;
	}

	@Override
	//重写按键事件以便控制蛇的移动方向
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// 根据用户按键改变蛇的方向
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			snake.changeDirection(Snake.UP);
			break;
		case KeyEvent.VK_DOWN:
			snake.changeDirection(Snake.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			snake.changeDirection(Snake.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			snake.changeDirection(Snake.RIGHT);
			break;	
		}
	}

	//处理蛇每次移动触发的事件
	public void SnakeMove(Snake snake) {
		// TODO Auto-generated method stub
		gamePanel.display(snake, food, ground);	
	}
	
	//开始新游戏的方法，即蛇开始走
	public void newGame(){
		snake.start();
	}

}
