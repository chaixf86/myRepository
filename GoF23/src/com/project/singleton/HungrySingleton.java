package com.project.singleton;
/**
 * ����ʽ����
 * �е㣺Ч�ʸߣ��̰߳�ȫ
 * ȱ�㣺����������
 * @author chaixf
 *
 */
public class HungrySingleton {
	//����ؾͳ�ʼ������Ȼ�̰߳�ȫ
	private static HungrySingleton instance = new HungrySingleton();
	//˽�й�����
	private HungrySingleton() {};
	//�ⲿ���ʽӿ�
	public static HungrySingleton getInstance() {
		return instance;
	}
}
