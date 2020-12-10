package com.project.builde;
/**
 * 构造对象
 * @author chaixf
 *
 */
public abstract class CarBuilder {
	//创建车对象
	protected Car car = new Car();
	
	abstract void builderTyre();
	abstract void builderCarframe();
	abstract void builderEngine();
	
	//返回对象
	public Car getCar() {
		return car;
	}
}
