package com.sunny_xiaobai5.listener;

import com.sunny_xiaobai5.entities.Snake;

public interface SnakeListener {
	//事件源是蛇，蛇每次移动将触发该事件
	void SnakeMove(Snake snake);
}
