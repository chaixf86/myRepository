package com.project.factory.simpleFactory;

/**
 * �򵥹���ģʽ
 * @author chaixf
 *
 */
public class CarFactory {

	public static String AUDI = "audi";
	public static String DABEN = "daben";
	
	/**
	 * ���ݲ������ͣ�������Ӧ�Ķ���
	 * ����������֪���ж��ٶ���
	 * @param type
	 * @return
	 */
	public static Car createCar(String type) {
		if(AUDI.equals(type)) {
			return new Audi();
		}else if(DABEN.equals(type)) {
			return new Daben();
		}else {
			return null;
		}
	}
}
