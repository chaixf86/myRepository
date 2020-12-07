package com.project.singleton;
/**
 * �ڲ��൥��
 * �ŵ㣺�汸�߲������ú��ӳټ�������
 * ע:�ⲿ��û��static��̬���ԣ��򲻻������ʽ�����������ض���
 */
public class InsideSingleton {

	private static class InsideInstance {
		//��֤�ڴ���ֻ��һ��ʵ�����ڣ�����ֻ�ܸ�ֵһ�Σ���֤�̰߳�ȫ
		private static final InsideSingleton instance = new InsideSingleton();
	}
	//���췽��˽�л�
	private InsideSingleton() {}
	
	//��ȡ����
	public static InsideSingleton getInstance() {
		return InsideInstance.instance;
	}
}
