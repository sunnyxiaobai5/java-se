package com.sunny_xiaobai5.game;

import com.sunny_xiaobai5.controller.TankController;
import com.sunny_xiaobai5.entities.Game;
import com.sunny_xiaobai5.entities.GameOver;
import com.sunny_xiaobai5.entities.Help;
import com.sunny_xiaobai5.entities.TankFrame;
import com.sunny_xiaobai5.entities.Welcome;

public class NewGame {
	public static void main(String[] args) {

		// 初始化游戏主窗体
		TankFrame frame = new TankFrame();

		// 初始化欢迎界面
		Welcome welcome = new Welcome(frame);

		// 初始化帮助界面
		Help help = new Help(frame);

		// 初始化游戏界面
		Game game = new Game(frame);

		// 初始化游戏结束界面
		GameOver gameOver = new GameOver(frame);

		// 将欢迎界面加入游戏主窗体
		frame.addCard(welcome, "welcome");

		// 将游戏界面加入游戏主窗体
		frame.addCard(game, "game");

		// 将帮助界面加入游戏主窗体
		frame.addCard(help, "help");

		// 将游戏结束界面加入游戏主窗体
		frame.addCard(gameOver, "gameover");

		// 初始化游戏界面控制器
		TankController tankController = new TankController(game);

		// 为游戏主窗体添加控制器
		frame.addKeyListener(tankController);

		// 开始游戏
		tankController.newGame();
	}
}
