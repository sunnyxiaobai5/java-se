package com.sunny_xiaobai5.entities;

import java.awt.CardLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sunny_xiaobai5.util.Global;

public class TankFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel welcome, game, help, gameover;
	private CardLayout card;

	public TankFrame() {
		this.init();
		this.setVisible(true);
	}

	// 获取左上角横坐标位置
	private int getFrameX() {
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		return (screenWidth - Global.GAME_WIDTH) / 2;
	}

	// 获取左上角纵坐标位置
	private int getFrameY() {
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		return (screenHeight - (Global.GAME_HEIGHT + Global.BORDER_V_WIDTH)) / 2 - 25;
	}

	// 初始化相关设置
	private void init() {
		this.card = new CardLayout();
		this.setLayout(this.card);
		this.setResizable(false);
		this.setTitle("坦克大战");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Global.GAME_WIDTH + Global.BORDER_H_WIDTH,
				Global.GAME_HEIGHT + Global.BORDER_V_WIDTH);
		this.setLocation(this.getFrameX(), this.getFrameY());
		this.setFocusable(true);
	}

	// 添加三个JLabel卡片界面
	public void addCard(JLabel card, String cardName) {

		if (cardName == "welcome") {
			welcome = card;
			this.add(cardName, welcome);
		} else if (cardName == "game") {
			game = card;
			this.add(cardName, game);
		} else if (cardName == "help") {
			help = card;
			this.add(cardName, help);
		} else if (cardName == "gameover") {
			gameover = card;
			this.add(cardName, gameover);
		}
	}

	// 显示某个JLabel卡片界面
	public void showCard(String name) {
		this.card.show(this.getContentPane(), name);
	}
}
