package com.sunny_xiaobai5.util;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ResourseUtil {

	// ��ȡĬ�Ϲ�����
	public static Toolkit toolkit = Toolkit.getDefaultToolkit();

	// ��ȡ��ҳ�汳��
	public static Icon bg_welcome = new ImageIcon(ResourseUtil.class
			.getResource("images/bg_welcome.jpg"));

	// ��ȡ��Ϸ����
	public static Icon bg_game = new ImageIcon(ResourseUtil.class
			.getResource("images/bg_game.jpg"));

	// ��ȡ����ҳ����
	public static Icon bg_help = new ImageIcon(ResourseUtil.class
			.getResource("images/bg_help.jpg"));

	// ��ȡ��Ϸ��������
	public static Icon bg_gameOver = new ImageIcon(ResourseUtil.class
			.getResource("images/bg_gameover.gif"));

	// ��ȡ��ʼ��ť
	public static Icon ico_start = new ImageIcon(ResourseUtil.class
			.getResource("images/btn_start.jpg"));

	// ��ȡ������ť
	public static Icon ico_help = new ImageIcon(ResourseUtil.class
			.getResource("images/btn_help.jpg"));

	// ��ȡ�˳���ť
	public static Icon ico_exit = new ImageIcon(ResourseUtil.class
			.getResource("images/btn_exit.jpg"));

	// ��ȡ���ذ�ť
	public static Icon ico_return = new ImageIcon(ResourseUtil.class
			.getResource("images/btn_return.jpg"));

	// ��ȡ̹��ͼƬ����
	public static Image[] tankC = {
			toolkit
					.getImage(ResourseUtil.class
							.getResource("images/tankU.gif")),
			toolkit
					.getImage(ResourseUtil.class
							.getResource("images/tankD.gif")),
			toolkit
					.getImage(ResourseUtil.class
							.getResource("images/tankL.gif")),
			toolkit
					.getImage(ResourseUtil.class
							.getResource("images/tankR.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/tankU01.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/tankD01.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/tankL01.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/tankR01.gif")) };

	// ��ȡ��ͼͼƬ����
	public static Image[] roadBlockC = {
			toolkit.getImage(ResourseUtil.class
					.getResource("images/block_tree.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/block_box.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/block_grass.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/block_center1.png")) };

	// ��ȡ�ӵ�����
	public static Image[] bulletC = {
			toolkit.getImage(ResourseUtil.class
					.getResource("images/missileU.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/missileD.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/missileL.gif")),
			toolkit.getImage(ResourseUtil.class
					.getResource("images/missileR.gif")) };

	// ��ȡ��ըЧ��ͼ����
	public static Image[] exploedC = {
			toolkit.getImage(ResourseUtil.class.getResource("images/1.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/2.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/3.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/4.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/5.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/6.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/7.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/8.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/9.gif")),
			toolkit.getImage(ResourseUtil.class.getResource("images/10.gif")) };

	// ��ȡ��������
	public static AudioClip sound_bg = Applet.newAudioClip(ResourseUtil.class
			.getResource("media/begin.wav"));
	// ��ȡ�������
	public static AudioClip sound_fire = Applet.newAudioClip(ResourseUtil.class
			.getResource("media/fire.wav"));
	// ��ȡ��ը����
	public static AudioClip sound_explode = Applet
			.newAudioClip(ResourseUtil.class.getResource("media/explode.wav"));

	// ��ȡ��ը����
	public static AudioClip sound_explode_enemy = Applet
			.newAudioClip(ResourseUtil.class
					.getResource("media/explode_enemy.wav"));
}
