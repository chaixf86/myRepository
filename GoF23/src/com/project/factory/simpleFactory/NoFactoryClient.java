package com.project.factory.simpleFactory;

/**
 * �޹���ģʽ�����
 * @author chaixf
 *
 */
public class NoFactoryClient {//������
	//��Ҫ֪���ӿڣ���Ҫ֪��ʵ����
	public static void main(String[] args) {
		Car audi = new Audi();
		Car daben = new Daben();
		
		audi.run();
		daben.run();
	}
}
