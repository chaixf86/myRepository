package com.project.builde;

public class Client {
	public static void main(String[] args) {
		CarBuilder builder = new AudiBuilder();
		CarDirector director = new AudiDirector(builder);
		Car car = director.directCar();
		car.show();
	}
}
