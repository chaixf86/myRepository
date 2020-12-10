package com.project.builde;
/**
 * �������
 * @author chaixf
 *
 */
public abstract class CarBuilder {
	//����������
	protected Car car = new Car();
	
	abstract void builderTyre();
	abstract void builderCarframe();
	abstract void builderEngine();
	
	//���ض���
	public Car getCar() {
		return car;
	}
}
