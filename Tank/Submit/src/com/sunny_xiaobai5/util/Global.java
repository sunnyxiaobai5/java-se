package com.sunny_xiaobai5.util;

public class Global {
	// ������Ϸģʽ ���˻���˫�� 1Ϊ���� 2Ϊ˫��,�����������̼߳�����ͬһʱ�佫ֻ����һ������̹�˿ɷ��ӵ�
	public static final int GAME_MODE = 2;

	// ���ý�����ӿ���
	public static final int BLOCK_WIDTH = 48;

	// ���ý�����Ӹ߶�
	public static final int BLOCK_HEIGHT = 63;

	// ������Ϸ����������
	public static final int MAP_WIDTH = 21;

	// ������Ϸ�����������
	public static final int MAP_HEIGHT = 11;

	// ���ý��������ܿ���
	public static final int BORDER_V_WIDTH = 25;

	// ���ý������ұ߿��ܿ���
	public static final int BORDER_H_WIDTH = 5;

	// ������Ϸ���������
	public static final int GAME_WIDTH = BLOCK_WIDTH * MAP_WIDTH;

	// ������Ϸ������߶�
	public static final int GAME_HEIGHT = BLOCK_HEIGHT * MAP_HEIGHT;

	// ����̹�˸߶�
	public static final int TANK_HEIGHT = 40;

	// ����̹�˿���
	public static final int TANK_WIDTH = 40;

	// ���ý����������Ϊ��
	public static final int BLOCK_NULL = 4;
	// ���ý����������Ϊ��
	public static final int BLOCK_TREE = 0;
	// ���ý����������Ϊ����
	public static final int BLOCK_BOX = 1;
	// ���ý����������Ϊ��
	public static final int BLOCK_GRASS = 2;
	// ���ý����������Ϊ�ܲ�
	public static final int BLOCK_CENTER = 3;

	// ������������ֵ
	public static final int BLOCK_LIFE_TREE = 2;
	// �������ӵ�����ֵ
	public static final int BLOCK_LIFE_BOX = 3;
	// ���òݵ�����ֵ
	public static final int BLOCK_LIFE_GRASS = 1;
	// �����ܲ�������ֵ
	public static final int BLOCK_LIFE_CENTER = 4;

	// �����ӵ��ٶ�
	public static final int BULLET_SPEED = 3;

	// ���õз�̹�˷����ӵ���С���
	public static final int TIME_MIN_FIRE = 100;

	// ���õз�̹�˷����ӵ����ʱ��
	public static final int TIME_MAX_FIRE = 200;

	// ���õз�̹�˸ı䷽����С���
	public static final int TIME_MIN_RANDDIR = 100;

	// ���õз�̹�˸ı䷽�������
	public static final int TIME_MAX_RANDDIR = 150;

	// ����ÿ���ƶ���ʱ�������߳�ͣ��ʱ��
	public static final int TIME_RANGE_SLEEP = 10;

	// �����ӵ�����
	public static final int BULLET_WIDTH = 12;

	// �����ӵ��߶�
	public static final int BULLET_HEIGHT = 12;

	// ����������̹����
	public static final int TANK_SUM_MIN = 15;

	// �������̹������
	public static final int TANK_SUM_MAX = 25;

	// ���ü���̹������
	public static final int TANK_SUM = 3;

	// ���ý������ٴ��ڵĵз�̹����
	public static final int TANK_MIN_COUNT = 5;

	// ���ý��������ڵĵз�̹����
	public static final int TANK_MAX_COUNT = 10;

	// ������̹���������ٴ�����ʱ�����������̹����Сʱ����
	public static final int TANK_LESS_CREATE_MIN = 1000;

	// ������̹���������ٴ�����ʱ�����������̹�����ʱ����
	public static final int TANK_LESS_CREATE_MAX = 3000;

	// ������̹�˴������ٴ�����ʱ�����������̹����Сʱ����
	public static final int TANK_MORE_CREATE_MAX = 5000;

	// ������̹�˴������ٴ�����ʱ�����������̹�����ʱ����
	public static final int TANK_MORE_CREATE_MIN = 8000;

	// ����̹��Ѫ������
	public static final int TANK_LIFE_WIDTH = TANK_WIDTH;

	// ����̹��Ѫ���߶�
	public static final int TANK_LIFE_HEIGHT = 3;

	// ����̹��������Ҫ���еĴ���
	public static final int TANK_BLOOD_TIME = 2;

	// ����̹��ÿ�α����м��ٵ�Ѫ������
	public static final int TANK_BLOOD_WIDTH = TANK_LIFE_WIDTH
			/ TANK_BLOOD_TIME;

	// ����bossѪ������
	public static final int BLOCK_LIFE_WIDTH = BLOCK_WIDTH;

	// ����bossѪ���߶�
	public static final int BLOCK_LIFE_HEIGHT = 5;

	// ����bossÿ�α����м��ٵ�Ѫ������
	public static final int BLOCK_BLOOD_WIDTH = BLOCK_LIFE_WIDTH
			/ BLOCK_LIFE_CENTER;

}