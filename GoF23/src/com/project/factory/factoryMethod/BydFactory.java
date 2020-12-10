package com.project.factory.factoryMethod;

public class BydFactory implements CarFactory{

	/**
	 * 新加的产品创建工厂并实现CarFactory
	 */
	@Override
	public Car createCar() {
		return new Byd();
	}

}
