package com.sunny_xiaobai5.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.sunny_xiaobai5.entities.Food;
import com.sunny_xiaobai5.entities.Ground;
import com.sunny_xiaobai5.entities.Snake;
import com.sunny_xiaobai5.listener.SnakeListener;
import com.sunny_xiaobai5.view.GamePanel;

//�������ڴ����û������¼��ʹ����߼�
//�̳�KeyAdapter����Ϊֻ�õ�����һ������
//ʵ���ߵļ��������
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
	//��д�����¼��Ա�����ߵ��ƶ�����
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// �����û������ı��ߵķ���
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

	//������ÿ���ƶ��������¼�
	public void SnakeMove(Snake snake) {
		// TODO Auto-generated method stub
		gamePanel.display(snake, food, ground);	
	}
	
	//��ʼ����Ϸ�ķ��������߿�ʼ��
	public void newGame(){
		snake.start();
	}

}
