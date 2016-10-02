package com.sunny_xiaobai5.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.sunny_xiaobai5.entities.TankFrame;
import com.sunny_xiaobai5.util.ResourseUtil;

public class WelcomeController implements ActionListener {

	private TankFrame frame;
	private JButton btn_start, btn_help, btn_exit;

	public WelcomeController(TankFrame frame, JButton btn_start,
			JButton btn_help, JButton btn_exit) {
		super();
		this.frame = frame;
		this.btn_start = btn_start;
		this.btn_help = btn_help;
		this.btn_exit = btn_exit;
	}

	// 点击不同按钮跳转到不同界面
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_start) {
			this.frame.showCard("game");
			ResourseUtil.sound_bg.play();
			this.frame.showCard("game1");
		} else if (e.getSource() == btn_help) {
			this.frame.showCard("help");
		} else if (e.getSource() == btn_exit) {
			System.exit(0);
		}
	}
}
