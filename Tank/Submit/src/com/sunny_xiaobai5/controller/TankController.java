package com.sunny_xiaobai5.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import com.sunny_xiaobai5.entities.Game;
import com.sunny_xiaobai5.entities.Tank;
import com.sunny_xiaobai5.util.DirTankUtil;
import com.sunny_xiaobai5.util.Global;

public class TankController extends KeyAdapter {
	private Game game;
	private List<Tank> tank;

	public TankController(Game game) {
		super();
		this.game = game;
		this.tank = game.tankC;
	}

	// Ϊ���̰����¼������¼�Ϊ̹�˵��ƶ�
	@Override
	public void keyPressed(KeyEvent e) {

		// ���ݰ����ı�̹�˵ķ���
		for (Tank t : tank) {
			if (t.good) {
				if (Global.GAME_MODE == 1) {
					switch (e.getKeyCode()) {
					case KeyEvent.VK_UP:
					case KeyEvent.VK_W:
						t.changeDirection(DirTankUtil.UP);
						break;
					case KeyEvent.VK_DOWN:
					case KeyEvent.VK_S:
						t.changeDirection(DirTankUtil.DOWN);
						break;
					case KeyEvent.VK_LEFT:
					case KeyEvent.VK_A:
						t.changeDirection(DirTankUtil.LEFT);
						break;
					case KeyEvent.VK_RIGHT:
					case KeyEvent.VK_D:
						t.changeDirection(DirTankUtil.RIGHT);
						break;
					case KeyEvent.VK_SPACE:
					case KeyEvent.VK_J:
						t.fire();
						break;
					}
				} else {
					if (t.player == 1) {
						switch (e.getKeyCode()) {
						case KeyEvent.VK_W:
							t.changeDirection(DirTankUtil.UP);
							break;
						case KeyEvent.VK_S:
							t.changeDirection(DirTankUtil.DOWN);
							break;
						case KeyEvent.VK_A:
							t.changeDirection(DirTankUtil.LEFT);
							break;
						case KeyEvent.VK_D:
							t.changeDirection(DirTankUtil.RIGHT);
							break;
						case KeyEvent.VK_J:
							t.fire();
							break;
						}
					} else if (t.player == 2) {
						switch (e.getKeyCode()) {
						case KeyEvent.VK_UP:
							t.changeDirection(DirTankUtil.UP);
							break;
						case KeyEvent.VK_DOWN:
							t.changeDirection(DirTankUtil.DOWN);
							break;
						case KeyEvent.VK_LEFT:
							t.changeDirection(DirTankUtil.LEFT);
							break;
						case KeyEvent.VK_RIGHT:
							t.changeDirection(DirTankUtil.RIGHT);
							break;
						case KeyEvent.VK_END:
							t.fire();
							break;
						}
					}
				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyReleased(e);
		// ���Ȱ�סW���ٰ�A��Ȼ���ɿ�A�����ɿ�W��direction��preDir������ΪSTOP���Ӷ����ܷ����ӵ���Ӧ�ų��������
		for (Tank t : tank) {
			if (t.good) {
				if (Global.GAME_MODE == 1) {
					if (e.getKeyCode() == KeyEvent.VK_UP
							|| e.getKeyCode() == KeyEvent.VK_DOWN
							|| e.getKeyCode() == KeyEvent.VK_RIGHT
							|| e.getKeyCode() == KeyEvent.VK_LEFT
							|| e.getKeyCode() == KeyEvent.VK_W
							|| e.getKeyCode() == KeyEvent.VK_S
							|| e.getKeyCode() == KeyEvent.VK_A
							|| e.getKeyCode() == KeyEvent.VK_D) {
						t.changeDirection(DirTankUtil.STOP);
					}
				} else {
					if (t.player == 1) {
						if (e.getKeyCode() == KeyEvent.VK_W
								|| e.getKeyCode() == KeyEvent.VK_S
								|| e.getKeyCode() == KeyEvent.VK_A
								|| e.getKeyCode() == KeyEvent.VK_D) {
							t.changeDirection(DirTankUtil.STOP);
						}
					} else if (t.player == 2) {
						if (e.getKeyCode() == KeyEvent.VK_UP
								|| e.getKeyCode() == KeyEvent.VK_DOWN
								|| e.getKeyCode() == KeyEvent.VK_RIGHT
								|| e.getKeyCode() == KeyEvent.VK_LEFT) {
							t.changeDirection(DirTankUtil.STOP);
						}
					}

				}
			}
		}
	}

	// ��ʼ��Ϸ
	public void newGame() {
		game.start();
	}
}
