package com.sunny_xiaobai5.entities;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.sunny_xiaobai5.controller.HelpController;
import com.sunny_xiaobai5.util.ResourseUtil;

public class Help extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TankFrame frame;
	private JButton btn_return;

	public Help(TankFrame frame) {
		super();
		this.frame = frame;
		this.setIcon(ResourseUtil.bg_help);
		this.addReturn();
		addListener();
	}

	//添加返回欢迎界面的按钮
	private void addReturn() {
		btn_return = new JButton(ResourseUtil.ico_return);
		btn_return.setSize(110, 43);
		btn_return.setBounds(660, 480, 110, 43);
		this.add(btn_return);
	}

	//为返回按钮添加控制器
	private void addListener() {
		btn_return.addActionListener(new HelpController(this.frame,
				this.btn_return));
	}
}
