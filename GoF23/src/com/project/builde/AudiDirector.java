package com.project.builde;

public class AudiDirector implements CarDirector{

	private CarBuilder builder;
	public AudiDirector(CarBuilder builder) {
		this.builder = builder;
	}

	//产品构建与产品组装
	@Override
	public Car directCar() {
		builder.builderTyre();
		builder.builderCarframe();
		builder.builderEngine();
		return builder.getCar();
	}


}
