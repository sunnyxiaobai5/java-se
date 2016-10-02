package com.sunny_xiaobai5.entities;

import java.awt.Graphics;

import com.sunny_xiaobai5.util.ResourseUtil;

public class Exploed {

	private int x, y;

	private Game game;

	public Exploed(int x, int y, Game game) {
		super();
		// +6是为了获取爆炸时子弹的中心点
		this.x = x + 6;
		this.y = y + 6;
		this.game = game;
	}

	int life = 10;

	public void drawMe(Graphics g) {
		// 每次绘出图像时，图像减小，坐标减小2.5，图片下标为8和9时，减小5
		if (life > 0) {
			life--;
			int shift = 0;
			if (life == 8) {
				shift += 2.5;
			} else {
				shift = 0;
			}
			g.drawImage(ResourseUtil.exploedC[life], (int) (x - (life + 1)
					* 2.5 - shift), (int) (y - (life + 1) * 2.5 - shift), null);
		} else {
			game.exploedC.remove(this);
		}

	}
}
