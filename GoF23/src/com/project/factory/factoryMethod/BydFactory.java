package com.project.factory.factoryMethod;

public class BydFactory implements CarFactory{

	/**
	 * �¼ӵĲ�Ʒ����������ʵ��CarFactory
	 */
	@Override
	public Car createCar() {
		return new Byd();
	}

}
