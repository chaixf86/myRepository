package com.project.singleton;

/**
 * ����ʽ����
 * �ŵ㣺�����ء��ӳټ��أ���һ�ε���ʱ������������
 * ȱ�㣺Ϊ���̰߳�ȫ����ȡ������������������Ч�ʵ�
 *
 */
public class LazySingleton {
	//����ز���������
	private static LazySingleton instance;
	//������˽�л�
	private LazySingleton() {}
	
	//δ�̰߳�ȫ��������һ�μ��ش�����������
	//�������ڸ߲�������¿��ܴ����������
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
