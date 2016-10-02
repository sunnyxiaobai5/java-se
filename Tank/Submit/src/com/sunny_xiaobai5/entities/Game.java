package com.sunny_xiaobai5.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;

import com.sunny_xiaobai5.util.DirTankUtil;
import com.sunny_xiaobai5.util.Global;
import com.sunny_xiaobai5.util.ResourseUtil;

public class Game extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TankFrame frame;
	public List<Tank> tankC = new ArrayList<Tank>();
	public List<Bullet> bulletC = new ArrayList<Bullet>();
	public List<Exploed> exploedC = new ArrayList<Exploed>();
	public GameMap map;

	public GameDriver mainThread;

	private int tankSum;

	public Game(TankFrame frame) {
		super();
		map = new GameMap(5);
		this.frame = frame;
		initTank();
		this.setIcon(ResourseUtil.bg_game);
		initTankSum();
		new Thread(new AddTank()).start();
	}

	public void initTankSum() {
		tankSum = Global.TANK_SUM_MIN
				+ new Random().nextInt(Global.TANK_SUM_MAX
						- Global.TANK_SUM_MIN + 1);
	}

	// 初始化正方坦克
	public void initTank() {
		tankC.add(new Tank(8 * Global.BLOCK_WIDTH, 10 * Global.BLOCK_HEIGHT
				+ Global.BLOCK_HEIGHT - Global.TANK_HEIGHT, 2,
				DirTankUtil.STOP, true, this, 3, 1));
		if (Global.GAME_MODE == 2)
			tankC
					.add(new Tank(12 * Global.BLOCK_WIDTH, 10
							* Global.BLOCK_HEIGHT + Global.BLOCK_HEIGHT
							- Global.TANK_HEIGHT, 2, DirTankUtil.STOP, true,
							this, 3, 2));
	}

	public void initGame() {
		this.bulletC.clear();
		this.tankC.clear();
		this.initTank();
		this.map = new GameMap(5);
		initTankSum();
	}

	// 重新显示整个界面
	public void display() {
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		// 画出地图
		map.drawMe(g);

		// 画出坦克
		for (int i = 0; i < this.tankC.size(); i++) {
			tankC.get(i).drawMe(g);
		}
		// 画出子弹
		for (int i = 0; i < this.bulletC.size(); i++) {
			bulletC.get(i).drawMe(g);
		}
		// 画出爆炸效果
		for (int i = 0; i < this.exploedC.size(); i++) {
			exploedC.get(i).drawMe(g);
		}
	}

	// 添加坦克随机出现在三个位置
	private void createRandTank() {
		while (true) {
			Tank temp = null;
			int rand = new Random().nextInt(3);
			switch (rand) {
			case 0:
				temp = new Tank(0 * Global.BLOCK_WIDTH,
						0 * Global.BLOCK_HEIGHT, 1, DirTankUtil.DOWN, false,
						this);
				break;
			case 1:
				temp = new Tank(10 * Global.BLOCK_WIDTH,
						0 * Global.BLOCK_HEIGHT, 1, DirTankUtil.DOWN, false,
						this);
				break;
			case 2:
				temp = new Tank(20 * Global.BLOCK_WIDTH,
						0 * Global.BLOCK_HEIGHT, 1, DirTankUtil.DOWN, false,
						this);
				break;
			}
			if (temp != null) {
				if (!temp.isHitTanks(tankC)) {
					tankC.add(temp);
					tankSum--;
					break;
				}
			}
		}
	}

	// 游戏主线程
	private class GameDriver implements Runnable {
		public void run() {
			while (true) {

				// 坦克移动
				for (int i = 0; i < tankC.size(); i++) {
					tankC.get(i).move();
				}
				// 子弹移动
				for (int i = 0; i < bulletC.size(); i++) {
					bulletC.get(i).move();
				}

				display();
				try {
					Thread.sleep(Global.TIME_RANGE_SLEEP);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 添加坦克线程
	private class AddTank implements Runnable {

		public void run() {
			while (tankSum > 0) {

				// 设置界面最大坦克数量
				if (tankC.size() < Global.TANK_MAX_COUNT + Global.GAME_MODE) {
					createRandTank();
					// 当界面坦克数大于等于最少允许坦克数量时，增加坦克产生时间
					if (tankC.size() >= Global.TANK_MIN_COUNT + 1) {
						try {
							Thread
									.sleep(Global.TANK_MORE_CREATE_MIN
											+ new Random()
													.nextInt(Global.TANK_MORE_CREATE_MIN
															- Global.TANK_MORE_CREATE_MIN
															+ 1));
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
					// 当界面坦克数小于最少允许坦克数量时，减少坦克产生时间
					else {
						try {

							Thread
									.sleep(Global.TANK_LESS_CREATE_MIN
											+ new Random()
													.nextInt(Global.TANK_LESS_CREATE_MAX
															- Global.TANK_LESS_CREATE_MIN
															+ 1));
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	// 开始主线程
	public void start() {
		mainThread = new GameDriver();
		new Thread(mainThread).start();
	}
}
