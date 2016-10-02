package xiaobai.snake.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import xiaobai.snake.entities.Food;
import xiaobai.snake.entities.Ground;
import xiaobai.snake.entities.Snake;

public class GamePanel extends JPanel{

	private Snake snake;
	private Food food;
	private Ground ground;
	
	public void display(Snake snake, Food food, Ground ground){
		System.out.println("GamePanel's display");
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g){
		// TODO Auto-generated method stub
		//÷ÿ–¬œ‘ æ
		this.ground.drawMe();
		this.snake.drawMe();
		this.food.drawMe();
	}
	
}
