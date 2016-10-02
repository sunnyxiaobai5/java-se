package com.sunny_xiaobai5.entities;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.sunny_xiaobai5.controller.WelcomeController;
import com.sunny_xiaobai5.util.ResourseUtil;

public class Welcome extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TankFrame frame;
	private JButton btn_start;
	private JButton btn_help;
	private JButton btn_exit;
	private WelcomeController welcomeController;

	@Override
	protected void paintComponent(Graphics e) {
		// TODO Auto-generated method stub
		super.paintComponent(e);
		// e.drawImage(ResourseUtil.bg_welcome1, 0, 0, null);
	}

	public Welcome(TankFrame frame) {
		this.frame = frame;
		this.setIcon(ResourseUtil.bg_welcome);
		this.AddMenu();
		this.addListener();
		this.repaint();
	}

	// 设置添加三个按钮
	private void AddMenu() {
		btn_start = new JButton(ResourseUtil.ico_start);
		btn_help = new JButton(ResourseUtil.ico_help);
		btn_exit = new JButton(ResourseUtil.ico_exit);
		btn_start.setSize(205, 60);
		btn_help.setSize(205, 60);
		btn_exit.setSize(205, 60);
		btn_start.setLocation(80, 200);
		btn_help.setLocation(80, 270);
		btn_exit.setLocation(80, 340);
		this.add(btn_start);
		this.add(btn_help);
		this.add(btn_exit);
	}

	// 为按钮添加监听器
	private void addListener() {
		welcomeController = new WelcomeController(this.frame, btn_start,
				btn_help, btn_exit);
		btn_start.addActionListener(welcomeController);
		btn_help.addActionListener(welcomeController);
		btn_exit.addActionListener(welcomeController);
	}
}