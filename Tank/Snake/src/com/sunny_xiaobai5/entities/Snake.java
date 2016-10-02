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

	// Ϊ����Ӽ������飬����ע����������
	private Set<SnakeListener> listeners = new HashSet<SnakeListener>();

	private LinkedList<Point> body = new LinkedList<Point>();

	// ���ƶ�
	public void move() {
		System.out.println("Snake's move");
		// ȥβ
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

		// ��ͷ
		body.addFirst(newHead);
	}

	// �߸ı䷽��
	public void changeDirection(int direciton) {
		System.out.println("Snake's changeDirection");
		this.direction = direciton;
	}

	// �߳�ʳ��
	public void eatFood() {
		System.out.println("Snake's eatFood");
	}

	// �ж����Ƿ�Ե��Լ�����
	public boolean isEatBody() {
		System.out.println("Snake's isEatBody");
		return false;
	}

	// ��ʾ��
	public void drawMe(Graphics g) {
		System.out.println("Snake's drawMe");
		g.setColor(Color.BLUE);
		for (Point p : body) {
			g.fill3DRect(p.x * Global.CELL_SIZE, p.y * Global.CELL_SIZE,
					Global.CELL_SIZE, Global.CELL_SIZE, true);
		}
	}

	// ���ڲ���ͨ���߳�ʵ���߲�ͣ�ƶ���Ч��
	private class SnakeDriver implements Runnable {
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				move();// ���ϵ�����move����
				// ���ƶ��󽫴������ƶ��¼�����snakeMove�¼�
				for (SnakeListener l : listeners) {
					l.SnakeMove(Snake.this);
				}
				try {
					Thread.sleep(1000);// ÿ���ƶ�����ͣһ��ʱ��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// Ϊ��ע�������
	public void addSnakeListener(SnakeListener l) {
		if (l != null) {
			this.listeners.add(l);
		}
	}

	// �ṩ�����̵߳ķ���
	public void start() {
		new Thread(new SnakeDriver()).start();
	}
}
