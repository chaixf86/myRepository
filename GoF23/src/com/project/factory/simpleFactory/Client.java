package com.project.factory.simpleFactory;

/**
 * ����ģʽ�����
 * �ŵ㣺
 * 	1�������������Ҫ���߼��жϣ����Ծ�����ʲôʱ�򴴽���һ����Ʒ��ʵ�����ͻ��˿������ֱ�Ӵ�����Ʒ�����ְ�𣬺ܷ���Ĵ�������Ӧ�Ĳ�Ʒ�������Ͳ�Ʒ��ְ��������ȷ��
 * 	2���ͻ�������֪�������������Ʒ��������ֻ��֪���������ɡ�
 * 	3��Ҳ�������������ļ����ڲ��޸Ŀͻ��˴��������¸���������µľ����Ʒ�ࡣ
 * ȱ�㣺
 * 	1���򵥹���ģʽ�Ĺ����൥һ���������в�Ʒ�Ĵ�����ְ����أ�һ���쳣������ϵͳ����Ӱ�졣�ҹ���������ǳ�ӷ�ף�Υ���߾ۺ�ԭ��
 * 	2��ʹ�ü򵥹���ģʽ������ϵͳ����ĸ����������µĹ����ࣩ������ϵͳ�ĸ��ӶȺ�����Ѷ�
 * 	3��ϵͳ��չ���ѣ�һ�������²�Ʒ���ò��޸Ĺ����߼����ڲ�Ʒ���ͽ϶�ʱ����������߼����ڸ���
 * 	4���򵥹���ģʽʹ���� static ������������ɹ�����ɫ�޷��γɻ��ڼ̳еĵȼ��ṹ��
 * @author chaixf
 *
 */
public class Client {//������
	//ֻ��֪���ӿں͹����࣬�Ϳ��Թ�����Ӧ�Ķ���
	public static void main(String[] args) {
		//��ͨ�򵥹���
		Car audi = CarFactory.createCar(CarFactory.AUDI);
		Car daben = CarFactory.createCar(CarFactory.DABEN);
		
		audi.run();
		daben.run();
		
		//��̬����
		Car sAudi = CarStaticFactory.createAudi();
		Car sDaben = CarStaticFactory.createDaben();
		
		sAudi.run();
		sDaben.run();
		
		
	}
}
