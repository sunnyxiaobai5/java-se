package com.sunny_xiaobai5.entities;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;

import javax.swing.JOptionPane;

import com.sunny_xiaobai5.util.DirTankUtil;
import com.sunny_xiaobai5.util.Global;
import com.sunny_xiaobai5.util.ResourseUtil;

public class Bullet {

	private int x, y;
	private DirTankUtil direction;
	private Image image;
	private int speed = Global.BULLET_SPEED;
	private Game game;
	private Tank tank;

	public Bullet(int x, int y, DirTankUtil direction, Game game, Tank tank) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.game = game;
		this.tank = tank;
		setIcon(direction);
	}

	// 为子弹设置不同图片
	private void setIcon(DirTankUtil direction) {
		switch (direction) {
		case UP:
			image = ResourseUtil.bulletC[0];
			break;
		case DOWN:
			image = ResourseUtil.bulletC[1];
			break;
		case LEFT:
			image = ResourseUtil.bulletC[2];
			break;
		case RIGHT:
			image = ResourseUtil.bulletC[3];
			break;
		}
	}

	// 子弹移动
	public void move() {
		// 若此子弹碰到障碍物，移除子弹，并爆炸
		if (isHitRoadBlocks(game.map.roadBlocks)) {
			game.bulletC.remove(this);
			game.exploedC.add(new Exploed(this.x, this.y, game));
			if (this.tank.good)
				ResourseUtil.sound_fire.play();
		}
		// 若此子弹碰到坦克，移除子弹，并爆炸
		if (HitTanks(game.tankC)) {
			game.bulletC.remove(this);
			game.exploedC.add(new Exploed(this.x, this.y, game));
			if (this.tank.good)
				ResourseUtil.sound_fire.play();
		}
		// 若此子弹碰到子弹，移除子弹，并爆炸
		if (isHitBullets(game.bulletC)) {
			game.bulletC.remove(this);
			game.exploedC.add(new Exploed(this.x, this.y, game));
		}
		// 若此子弹边界，移除子弹，并爆炸
		if (isHitBoundary()) {
			game.bulletC.remove(this);
			game.exploedC.add(new Exploed(this.x, this.y, game));
		}

		switch (direction) {
		case UP:
			this.y -= this.speed;
			break;
		case DOWN:
			this.y += this.speed;
			break;
		case LEFT:
			this.x -= this.speed;
			break;
		case RIGHT:
			this.x += this.speed;
			break;
		}
	}

	// 获取子弹所在的矩形区域
	private Rectangle getRectangle() {
		return new Rectangle(x, y, Global.BULLET_WIDTH, Global.BULLET_HEIGHT);
	}

	// 判断子弹是否碰到某个障碍物并确定是否移除该障碍物
	private boolean isHitRoadBlock(RoadBlock roadBlock) {

		boolean flag = this.getRectangle().intersects(roadBlock.getRectangle());
		if (flag) {
			roadBlock.life--;
			if (roadBlock.life <= 0) {
				game.map.roadBlocks.remove(roadBlock);
				if (roadBlock.type == Global.BLOCK_CENTER) {
					ResourseUtil.sound_explode_enemy.play();
					ResourseUtil.sound_explode.play();
					game.frame.showCard("gameover");
					game.initGame();
				}
			}
		}
		return flag;
	}

	public boolean isHitRoadBlocks(List<RoadBlock> list) {

		for (RoadBlock b : list) {
			if (isHitRoadBlock(b)) {
				return true;
			}
		}
		return false;
	}

	// 判断子弹是否碰到子弹并确定是否移除子弹
	private boolean isHitBullet(Bullet bullet) {

		boolean flag = this.getRectangle().intersects(bullet.getRectangle());
		if (flag) {
			game.bulletC.remove(bullet);
		}
		return flag;
	}

	public boolean isHitBullets(List<Bullet> list) {

		for (Bullet b : list) {
			if (this.tank.good != b.tank.good && isHitBullet(b)) {
				return true;
			}
		}
		return false;
	}

	// 判断子弹是否碰到边界并确定是否移除
	private boolean isHitBoundary() {
		if (this.x <= 0 || this.y <= 0 || this.x >= Global.GAME_WIDTH
				|| this.y >= Global.GAME_HEIGHT) {
			return true;
		}
		return false;
	}

	// 判断子弹是否碰到某个坦克并确定是否移除该坦克
	private boolean isHitTank(Tank tank) {

		boolean flag = this.getRectangle().intersects(tank.getRectangle());
		if (flag) {
			if (tank == this.tank) {
				flag = false;
			} else {
				if (tank.good != this.tank.good) {
					tank.blood--;
					if (tank.blood <= 0) {
						if (tank.good) {
							tank.life--;
							if (tank.life <= 0) {
								game.frame.showCard("gameover");
								game.initGame();
							} else {
								ResourseUtil.sound_explode.play();
								game.tankC.remove(tank);
								if (tank.player == 1) {
									game.tankC.add(new Tank(
											8 * Global.BLOCK_WIDTH, 10
													* Global.BLOCK_HEIGHT
													+ Global.BLOCK_HEIGHT
													- Global.TANK_HEIGHT, 2,
											DirTankUtil.STOP, true, game,
											tank.life, tank.player));
								} else {
									game.tankC.add(new Tank(
											12 * Global.BLOCK_WIDTH, 10
													* Global.BLOCK_HEIGHT
													+ Global.BLOCK_HEIGHT
													- Global.TANK_HEIGHT, 2,
											DirTankUtil.STOP, true, game,
											tank.life, tank.player));

								}
							}
						} else {
							game.tankC.remove(tank);
							ResourseUtil.sound_explode_enemy.play();
							if (game.tankC.size() <= 0) {
								JOptionPane.showMessageDialog(null, "接着玩！！");

							}

						}
					}
				}

			}
		}
		return flag;
	}

	public boolean HitTanks(List<Tank> list) {

		for (Tank b : list) {
			if (this.tank.good != b.good && isHitTank(b)) {
				return true;
			}
		}
		return false;
	}

	// 画出子弹
	public void drawMe(Graphics g) {
		g.drawImage(this.image, x, y, null);
	}
}
