package com.sunny_xiaobai5.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.sunny_xiaobai5.util.Global;

public class GameMap {

	public List<RoadBlock> roadBlocks;
	private Random rand;
	private int defaultRand = 4;

	public GameMap() {
		rand = new Random();
		addBlocks();
		addDefault();
	}

	public GameMap(int setRand) {
		rand = new Random();
		this.defaultRand = setRand;
		addBlocks();
		addDefault();
	}

	public List<RoadBlock> createMap() {

		return this.roadBlocks;
	}

	// 随机添加所有图片
	private void addBlocks() {
		roadBlocks = new ArrayList<RoadBlock>();
		for (int i = 0; i < Global.MAP_HEIGHT; i++) {
			for (int j = 0; j < Global.MAP_WIDTH; j++) {
				int k = getRandom();
				if (k >= Global.BLOCK_CENTER) {
					k = Global.BLOCK_NULL;
				} else {
					roadBlocks.add(new RoadBlock(j, i, k));
				}
			}
		}
	}

	// 修改特点格子为特定图片
	private void addDefault() {
		Iterator<RoadBlock> it = roadBlocks.iterator();
		while (it.hasNext()) {
			RoadBlock l = it.next();
			// 将boss及其周围的一圈对应的障碍物移除
			if (((l.y == 9) && (l.x == 9 || l.x == 10 || l.x == 11))
					|| ((l.y == 10) && (l.x == 9 || l.x == 10 || l.x == 11))) {
				it.remove();
			}
			// 将出坦克的地方对应的原格子移除
			if ((l.y == 0)
					&& (l.x == 0 || l.x == 10 || l.x == 20)
					|| (l.y == 10 && (l.x == 8 || (l.x == 12 && Global.GAME_MODE == 2)))) {
				it.remove();
			}
		}

		// 添加boss图片
		roadBlocks.add(new RoadBlock(10, 10, Global.BLOCK_CENTER));
		// 添加boss周围的箱子
		roadBlocks.add(new RoadBlock(9, 9, Global.BLOCK_BOX));
		roadBlocks.add(new RoadBlock(9, 10, Global.BLOCK_BOX));
		roadBlocks.add(new RoadBlock(10, 9, Global.BLOCK_BOX));
		roadBlocks.add(new RoadBlock(11, 9, Global.BLOCK_BOX));
		roadBlocks.add(new RoadBlock(11, 10, Global.BLOCK_BOX));

	}

	// 获取随机数
	private int getRandom() {
		return rand.nextInt(defaultRand);
	}

	// 画出地图
	public void drawMe(Graphics g) {
		for (RoadBlock block : roadBlocks) {
			block.drawMe(g);
		}
	}
}
