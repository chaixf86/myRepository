package com.project.factory.simpleFactory;

/**
 * 简单工厂模式(静态工厂)
 * @author chaixf
 *
 */
public class CarStaticFactory {

	public static Car createAudi() {
		return new Audi();
	}
	
	public static Car createDaben() {
		return new Daben();
	}
}
