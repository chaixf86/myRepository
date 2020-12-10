package com.project.factory.simpleFactory;

/**
 * �򵥹���ģʽ(��̬����)
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
