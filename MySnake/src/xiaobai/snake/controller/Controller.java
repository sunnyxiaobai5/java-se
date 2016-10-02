package xiaobai.snake.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import xiaobai.snake.entities.Food;
import xiaobai.snake.entities.Ground;
import xiaobai.snake.entities.Snake;
import xiaobai.snake.listener.SnakeListener;
import xiaobai.snake.view.GamePanel;

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
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//根据用户按键改变蛇的方向
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			snake.chageDirection();
			break;
		case KeyEvent.VK_DOWN:
			snake.chageDirection();
			break;
		case KeyEvent.VK_LEFT:
			snake.chageDirection();
			break;
		case KeyEvent.VK_RIGHT:
			snake.chageDirection();
			break;	
		}
	}

	@Override
	public void snakeMoved(Snake snake) {
		// TODO Auto-generated method stub
		gamePanel.display(snake, food, ground);
	}	
	
	public void newGame(){
		snake.start();
	}

}
