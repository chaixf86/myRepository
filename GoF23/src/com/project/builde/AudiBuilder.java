package com.project.builde;

public class AudiBuilder extends CarBuilder{

	@Override
	public void builderTyre() {
		car.setTyre(new Tyre("�µ���̥"));
	}

	@Override
	public void builderCarframe() {
		car.setCarframe(new Carframe("�µϳ���"));
	}

	@Override
	public void builderEngine() {
		car.setEngine(new Engine("�µϷ�����"));
	}

}
