package com.project.factory.simpleFactory;

/**
 * 简单工厂模式
 * @author chaixf
 *
 */
public class CarFactory {

	public static String AUDI = "audi";
	public static String DABEN = "daben";
	
	/**
	 * 根据参数类型，返回相应的对象
	 * 调用者无需知道有多少对象
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
