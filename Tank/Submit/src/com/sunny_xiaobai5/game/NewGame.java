package com.sunny_xiaobai5.game;

import com.sunny_xiaobai5.controller.TankController;
import com.sunny_xiaobai5.entities.Game;
import com.sunny_xiaobai5.entities.GameOver;
import com.sunny_xiaobai5.entities.Help;
import com.sunny_xiaobai5.entities.TankFrame;
import com.sunny_xiaobai5.entities.Welcome;

public class NewGame {
	public static void main(String[] args) {

		// ��ʼ����Ϸ������
		TankFrame frame = new TankFrame();

		// ��ʼ����ӭ����
		Welcome welcome = new Welcome(frame);

		// ��ʼ����������
		Help help = new Help(frame);

		// ��ʼ����Ϸ����
		Game game = new Game(frame);

		// ��ʼ����Ϸ��������
		GameOver gameOver = new GameOver(frame);

		// ����ӭ���������Ϸ������
		frame.addCard(welcome, "welcome");

		// ����Ϸ���������Ϸ������
		frame.addCard(game, "game");

		// ���������������Ϸ������
		frame.addCard(help, "help");

		// ����Ϸ�������������Ϸ������
		frame.addCard(gameOver, "gameover");

		// ��ʼ����Ϸ���������
		TankController tankController = new TankController(game);

		// Ϊ��Ϸ���������ӿ�����
		frame.addKeyListener(tankController);

		// ��ʼ��Ϸ
		tankController.newGame();
	}
}