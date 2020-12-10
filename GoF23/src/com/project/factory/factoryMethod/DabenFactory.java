package com.project.factory.factoryMethod;

public class DabenFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Daben();
	}
	
}
