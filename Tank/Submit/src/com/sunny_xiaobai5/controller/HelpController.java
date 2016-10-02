package com.sunny_xiaobai5.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.sunny_xiaobai5.entities.TankFrame;

public class HelpController implements ActionListener {
	private TankFrame frame;
	private JButton btn_return;

	public HelpController(TankFrame frame, JButton btn_return) {
		super();
		this.frame = frame;
		this.btn_return = btn_return;
	}

	//点击返回按钮返回到欢迎页面
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_return) {
			this.frame.showCard("welcome");
		}
	}
}
