package com.sunny_xiaobai5.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.sunny_xiaobai5.util.Global;
import com.sunny_xiaobai5.util.ResourseUtil;

public class RoadBlock {

	public int x, y;
	public Image image = null;
	public int type;
	public int life;

	public RoadBlock(int x, int y, int type) {
		super();
		this.x = x;
		this.y = y;
		switch (type) {
		case Global.BLOCK_TREE:
			life = Global.BLOCK_LIFE_TREE;
			break;
		case Global.BLOCK_BOX:
			life = Global.BLOCK_LIFE_BOX;
			break;
		case Global.BLOCK_GRASS:
			life = Global.BLOCK_LIFE_GRASS;
			break;
		case Global.BLOCK_CENTER:
			life = Global.BLOCK_LIFE_CENTER;
			break;

		}
		setType(type);
	}

	// 根据类型设置相应图片
	public void setType(int type) {
		this.type = type;
		if (type == Global.BLOCK_NULL)
			this.image = null;
		else
			this.image = ResourseUtil.roadBlockC[type];
	}

	// 获取该障碍物所在的矩形区域
	public Rectangle getRectangle() {

		return new Rectangle(x * Global.BLOCK_WIDTH, y * Global.BLOCK_HEIGHT,
				Global.BLOCK_WIDTH, Global.BLOCK_HEIGHT);
	}

	// 画出图片
	public void drawMe(Graphics g) {
		g.drawImage(this.image, x * Global.BLOCK_WIDTH,
				y * Global.BLOCK_HEIGHT, null);
		if (this.type == Global.BLOCK_CENTER) {
			g.setColor(Color.GRAY);
			g.fill3DRect(x * Global.BLOCK_WIDTH, y * Global.BLOCK_HEIGHT,
					Global.BLOCK_WIDTH, Global.BLOCK_LIFE_HEIGHT, true);
			g.setColor(Color.RED);
			g.fill3DRect(x * Global.BLOCK_WIDTH, y * Global.BLOCK_HEIGHT, life
					* Global.BLOCK_BLOOD_WIDTH, Global.BLOCK_LIFE_HEIGHT, true);
		}
	}
}
