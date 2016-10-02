package com.sunny_xiaobai5.util;

public class Global {
	// 设置游戏模式 单人还是双人 1为单人 2为双人,若不设两个线程监听，同一时间将只能有一个正方坦克可发子弹
	public static final int GAME_MODE = 2;

	// 设置界面格子宽度
	public static final int BLOCK_WIDTH = 48;

	// 设置界面格子高度
	public static final int BLOCK_HEIGHT = 63;

	// 设置游戏界面横向格数
	public static final int MAP_WIDTH = 21;

	// 设置游戏界面纵向格数
	public static final int MAP_HEIGHT = 11;

	// 设置界面上下总宽度
	public static final int BORDER_V_WIDTH = 25;

	// 设置界面左右边框总宽度
	public static final int BORDER_H_WIDTH = 5;

	// 设置游戏主界面宽度
	public static final int GAME_WIDTH = BLOCK_WIDTH * MAP_WIDTH;

	// 设置游戏主界面高度
	public static final int GAME_HEIGHT = BLOCK_HEIGHT * MAP_HEIGHT;

	// 设置坦克高度
	public static final int TANK_HEIGHT = 40;

	// 设置坦克宽度
	public static final int TANK_WIDTH = 40;

	// 设置界面格子类型为空
	public static final int BLOCK_NULL = 4;
	// 设置界面格子类型为树
	public static final int BLOCK_TREE = 0;
	// 设置界面格子类型为箱子
	public static final int BLOCK_BOX = 1;
	// 设置界面格子类型为草
	public static final int BLOCK_GRASS = 2;
	// 设置界面格子类型为总部
	public static final int BLOCK_CENTER = 3;

	// 设置树的生命值
	public static final int BLOCK_LIFE_TREE = 2;
	// 设置箱子的生命值
	public static final int BLOCK_LIFE_BOX = 3;
	// 设置草的生命值
	public static final int BLOCK_LIFE_GRASS = 1;
	// 设置总部的生命值
	public static final int BLOCK_LIFE_CENTER = 4;

	// 设置子弹速度
	public static final int BULLET_SPEED = 3;

	// 设置敌方坦克发射子弹最小间隔
	public static final int TIME_MIN_FIRE = 100;

	// 设置敌方坦克发射子弹最大时间
	public static final int TIME_MAX_FIRE = 200;

	// 设置敌方坦克改变方向最小间隔
	public static final int TIME_MIN_RANDDIR = 100;

	// 设置敌方坦克改变方向最大间隔
	public static final int TIME_MAX_RANDDIR = 150;

	// 设置每次移动的时间间隔即线程停顿时间
	public static final int TIME_RANGE_SLEEP = 10;

	// 设置子弹宽度
	public static final int BULLET_WIDTH = 12;

	// 设置子弹高度
	public static final int BULLET_HEIGHT = 12;

	// 设置最少总坦克数
	public static final int TANK_SUM_MIN = 15;

	// 设置最多坦克总数
	public static final int TANK_SUM_MAX = 25;

	// 设置己方坦克总数
	public static final int TANK_SUM = 3;

	// 设置界面最少存在的敌方坦克数
	public static final int TANK_MIN_COUNT = 5;

	// 设置界面最多存在的敌方坦克数
	public static final int TANK_MAX_COUNT = 10;

	// 当界面坦克少于最少存在数时，设置其产生坦克最小时间间隔
	public static final int TANK_LESS_CREATE_MIN = 1000;

	// 当界面坦克少于最少存在数时，设置其产生坦克最大时间间隔
	public static final int TANK_LESS_CREATE_MAX = 3000;

	// 当设置坦克大于最少存在数时，设置其产生坦克最小时间间隔
	public static final int TANK_MORE_CREATE_MAX = 5000;

	// 当界面坦克大于最少存在数时，设置其产生坦克最大时间间隔
	public static final int TANK_MORE_CREATE_MIN = 8000;

	// 设置坦克血条宽度
	public static final int TANK_LIFE_WIDTH = TANK_WIDTH;

	// 设置坦克血条高度
	public static final int TANK_LIFE_HEIGHT = 3;

	// 设置坦克死亡需要击中的次数
	public static final int TANK_BLOOD_TIME = 2;

	// 设置坦克每次被击中减少的血量长度
	public static final int TANK_BLOOD_WIDTH = TANK_LIFE_WIDTH
			/ TANK_BLOOD_TIME;

	// 设置boss血条宽度
	public static final int BLOCK_LIFE_WIDTH = BLOCK_WIDTH;

	// 设置boss血条高度
	public static final int BLOCK_LIFE_HEIGHT = 5;

	// 设置boss每次被击中减少的血量长度
	public static final int BLOCK_BLOOD_WIDTH = BLOCK_LIFE_WIDTH
			/ BLOCK_LIFE_CENTER;

}
