package com.sunny_xiaobai5.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.sunny_xiaobai5.listener.SnakeListener;
import com.sunny_xiaobai5.util.Global;

public class Snake {

	private int direction;
	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;

	public Snake() {
		init();
	}
	
	public void init()
	{
		int x=Global.WIDTH/2;
		int y=Global.HEIGHT/2;
		for(int i=0;i<4;i++)
		{
			body.add(new Point(x--,y));
		}
		direction=RIGHT;
	}

	// 为蛇添加监听器组，可以注册多个监听器
	private Set<SnakeListener> listeners = new HashSet<SnakeListener>();

	private LinkedList<Point> body = new LinkedList<Point>();

	// 蛇移动
	public void move() {
		System.out.println("Snake's move");
		// 去尾
		body.removeLast();

		int x = body.getFirst().x;
		int y = body.getFirst().y;

		switch (direction) {
		case UP:
			y--;
			break;
		case DOWN:
			y++;
			break;
		case LEFT:
			x--;
			break;
		case RIGHT:
			x++;
		}
		Point newHead = new Point(x, y);

		// 加头
		body.addFirst(newHead);
	}

	// 蛇改变方向
	public void changeDirection(int direciton) {
		System.out.println("Snake's changeDirection");
		this.direction = direciton;
	}

	// 蛇吃食物
	public void eatFood() {
		System.out.println("Snake's eatFood");
	}

	// 判断蛇是否吃到自己身体
	public boolean isEatBody() {
		System.out.println("Snake's isEatBody");
		return false;
	}

	// 显示蛇
	public void drawMe(Graphics g) {
		System.out.println("Snake's drawMe");
		g.setColor(Color.BLUE);
		for (Point p : body) {
			g.fill3DRect(p.x * Global.CELL_SIZE, p.y * Global.CELL_SIZE,
					Global.CELL_SIZE, Global.CELL_SIZE, true);
		}
	}

	// 用内部类通过线程实现蛇不停移动的效果
	private class SnakeDriver implements Runnable {
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				move();// 不断调用蛇move方法
				// 蛇移动后将触发蛇移动事件，即snakeMove事件
				for (SnakeListener l : listeners) {
					l.SnakeMove(Snake.this);
				}
				try {
					Thread.sleep(1000);// 每次移动后暂停一段时间
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 为蛇注册监听器
	public void addSnakeListener(SnakeListener l) {
		if (l != null) {
			this.listeners.add(l);
		}
	}

	// 提供启动线程的方法
	public void start() {
		new Thread(new SnakeDriver()).start();
	}
}
