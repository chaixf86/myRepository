package com.project.factory.factoryMethod;

public class AudiFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Audi();
	}

}
