package com.sunny_xiaobai5.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;
import java.util.Random;

import com.sunny_xiaobai5.util.DirTankUtil;
import com.sunny_xiaobai5.util.Global;
import com.sunny_xiaobai5.util.ResourseUtil;

public class Tank {

	private DirTankUtil direction;
	public DirTankUtil preDir;
	public int x, y;
	private int speed;
	public int blood;
	public boolean good;
	private Image image;
	private Game game;
	public int life = 1;
	public int player = 0;
	public boolean alive;

	public boolean fireFlag = false;

	private int randDirTime = Global.TIME_MIN_RANDDIR;
	private int randFireTime = Global.TIME_MIN_FIRE;

	public Tank(int x, int y, int speed, DirTankUtil direction, boolean good,
			Game game) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.blood = Global.TANK_BLOOD_TIME;
		this.direction = direction;
		this.preDir = DirTankUtil.UP;// ����Ϊ���ϣ���֤û�������֮ǰ�ܹ������ӵ�
		this.good = good;
		this.game = game;

		// ��̹�˵ĳ�ʼ������ΪSTOP��������ͼƬΪ����
		if (this.direction == DirTankUtil.STOP)
			setIcon(DirTankUtil.UP);

		setIcon(direction);
	}

	public Tank(int x, int y, int speed, DirTankUtil direction, boolean good,
			Game game, int life, int player) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.blood = Global.TANK_BLOOD_TIME;
		this.life = life;
		this.direction = direction;
		this.preDir = DirTankUtil.UP;// ����Ϊ���ϣ���֤û�������֮ǰ�ܹ������ӵ�
		this.good = good;
		this.game = game;
		this.player = player;

		// ��̹�˵ĳ�ʼ������ΪSTOP��������ͼƬΪ����
		if (this.direction == DirTankUtil.STOP)
			setIcon(DirTankUtil.UP);

		setIcon(direction);
	}

	// �ҷ�̹�˱������ʱ�򣬳�ʼ�������
	public void initGoodTank() {
		this.x = 8 * Global.BLOCK_WIDTH;
		this.y = 10 * Global.BLOCK_HEIGHT + Global.BLOCK_HEIGHT
				- Global.TANK_HEIGHT;
		this.direction = DirTankUtil.STOP;
		this.preDir = DirTankUtil.UP;
		this.blood = Global.TANK_BLOOD_TIME;
		setIcon(DirTankUtil.UP);
	}

	// Ϊ��̹ͬ�����ò�ͬͼƬ
	private void setIcon(DirTankUtil direction) {
		int i = 0;
		if (!good) {
			i = 4;
		}
		switch (direction) {
		case UP:
			image = ResourseUtil.tankC[0 + i];
			break;
		case DOWN:
			image = ResourseUtil.tankC[1 + i];
			break;
		case LEFT:
			image = ResourseUtil.tankC[2 + i];
			break;
		case RIGHT:
			image = ResourseUtil.tankC[3 + i];
			break;
		}
	}

	// ̹�˸ı䷽��
	public void changeDirection(DirTankUtil direction) {
		setIcon(direction);
		this.preDir = this.direction;
		this.direction = direction;
	}

	// ����ı�̹�˷���
	public void changRandDir() {
		Random rand = new Random();
		int dir = rand.nextInt(5);
		switch (dir) {
		case 0:
			changeDirection(DirTankUtil.UP);
			break;
		case 1:
			changeDirection(DirTankUtil.DOWN);
			break;
		case 2:
			changeDirection(DirTankUtil.LEFT);
			break;
		case 3:
			changeDirection(DirTankUtil.RIGHT);
			break;
		case 4:
			changeDirection(DirTankUtil.STOP);
			break;
		}
	}

	// ̹���ƶ�
	public void move() {
		int oldX = this.x;
		int oldY = this.y;

		Random ran = new Random();

		if (!this.good) {

			// �з�̹��ÿ��һ�����ʱ��ı䷽��
			if (randDirTime < 0) {
				changRandDir();
				randDirTime = Global.TIME_MIN_RANDDIR
						+ ran.nextInt(Global.TIME_MAX_RANDDIR
								- Global.TIME_MIN_RANDDIR + 1);
			}

			// �з�̹��ÿ��һ�����ʱ�䷢���ӵ�
			if (randFireTime < 0) {
				this.fire();
				randFireTime = Global.TIME_MIN_FIRE
						+ ran.nextInt(Global.TIME_MAX_FIRE
								- Global.TIME_MIN_FIRE + 1);
			}
		}

		randFireTime--;
		randDirTime--;

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
		default:
			break;
		}
		if (x < 0 || y < 0 || x > (Global.GAME_WIDTH - Global.TANK_WIDTH)
				|| y > (Global.GAME_HEIGHT - Global.TANK_HEIGHT)
				|| isHitRoadBlocks(game.map.roadBlocks)
				|| isHitTanks(game.tankC)) {
			this.x = oldX;
			this.y = oldY;
			if (!this.good) {
				changRandDir();
			}
		}
	}

	// �����ӵ�
	public void fire() {
		int offset_x = 0;
		int offset_y = 0;
		DirTankUtil bulletDir = direction;
		if (direction == DirTankUtil.STOP) {
			bulletDir = preDir;
		}
		if (good) {
			switch (bulletDir) {
			case UP:
				offset_x = 14;
				offset_y = 0 - Global.BULLET_HEIGHT;// ��ȥ�ӵ�ͼƬ�߶�
				break;
			case DOWN:
				offset_x = 14;
				offset_y = 40;
				break;
			case LEFT:
				offset_x = 0 - Global.BULLET_WIDTH;// ��ȥ�ӵ�ͼƬ����
				offset_y = 9;
				break;
			case RIGHT:
				offset_x = 40;
				offset_y = 9;
				break;
			}
		} else {
			switch (bulletDir) {
			case UP:
				offset_x = 14;
				offset_y = 0 - Global.BULLET_HEIGHT;// ��ȥͼƬ�߶�
				break;
			case DOWN:
				offset_x = 14;
				offset_y = 40;
				break;
			case LEFT:
				offset_x = 0 - Global.BULLET_WIDTH;// ��ȥͼƬ����
				offset_y = 11;
				break;
			case RIGHT:
				offset_x = 40;
				offset_y = 11;
				break;
			}

		}

		game.bulletC.add(new Bullet(this.x + offset_x, this.y + offset_y,
				bulletDir, game, this));
	}

	// ��ȡ̹�����ڵľ�������
	public Rectangle getRectangle() {
		return new Rectangle(x, y, Global.TANK_WIDTH, Global.TANK_HEIGHT);
	}

	// �ж�̹���Ƿ�����ĳ���ϰ���
	public boolean isHitRoadBlock(RoadBlock roadBlock) {

		return this.getRectangle().intersects(roadBlock.getRectangle());
	}

	public boolean isHitRoadBlocks(List<RoadBlock> list) {

		for (RoadBlock b : list) {
			if (isHitRoadBlock(b)) {
				return true;
			}
		}
		return false;
	}

	// �ж�̹���Ƿ�����ĳ��̹��
	private boolean isHitTank(Tank tank) {

		if (tank == this)
			return false;
		return this.getRectangle().intersects(tank.getRectangle());
	}

	public boolean isHitTanks(List<Tank> list) {

		for (Tank b : list) {
			if (isHitTank(b)) {
				return true;
			}
		}
		return false;
	}

	// ̹������
	public void dead() {
		alive = false;
	}

	// ����̹��
	public void drawMe(Graphics g) {
		g.drawImage(this.image, x, y, null);
		g.setColor(Color.YELLOW);
		g.fill3DRect(x, y - 5, Global.TANK_LIFE_WIDTH, Global.TANK_LIFE_HEIGHT,
				true);
		g.setColor(Color.RED);
		g.fill3DRect(x, y - 5, blood * Global.TANK_BLOOD_WIDTH,
				Global.TANK_LIFE_HEIGHT, true);
	}
}