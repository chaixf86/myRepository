package com.project.builde;

public class AudiBuilder extends CarBuilder{

	@Override
	public void builderTyre() {
		car.setTyre(new Tyre("°ÂµÏÂÖÌ¥"));
	}

	@Override
	public void builderCarframe() {
		car.setCarframe(new Carframe("°ÂµÏ³µ¼Ü"));
	}

	@Override
	public void builderEngine() {
		car.setEngine(new Engine("°ÂµÏ·¢¶¯»ú"));
	}

}
