package com.project.factory.factoryMethod;
/**
 * ��������ģʽ
 * �ŵ㣺
 * 	�û�ֻ��Ҫ֪�����幤�������ƾͿɵõ���Ҫ�Ĳ�Ʒ������֪����Ʒ�ľ��崴�����̡�
 * 	�������ǿ�������²�Ʒ�Ĵ�����ֻ���дһ����Ӧ�Ĺ����ࡣ
 * 	���͵Ľ����ܡ��߲�ģ��ֻ��Ҫ֪����Ʒ�ĳ����࣬�����������ʵ���࣬��������ط�����������ԭ��������滻ԭ��
 * ȱ�㣺
 * 	��ĸ������׹��࣬���Ӹ��Ӷ�
 * 	������ϵͳ�ĳ����Ժ�����Ѷ�
 * 	�����Ʒֻ������һ�ֲ�Ʒ���˱׶˿�ʹ�ó��󹤳�ģʽ�����
 * @author chaixf
 *
 * �¼ӵ�Byd����ʵ��Car
 * �¼ӵ�BydFactory����ʵ��CarFactory
 */
public class Client {
	public static void main(String[] args) {
//		CarFactory factory = (CarFactory) ClientConfigure.getObject(ClientConfigure.AUDI);
//		Car audi = factory.createCar();
//		audi.run();
		
		//���ö˾Ϳ��Ե����¼ӵ�Byd����
		CarFactory factory = (CarFactory) ClientConfigure.getObject(ClientConfigure.BYD);
		Car byd = factory.createCar();
		byd.run();
	}
}
