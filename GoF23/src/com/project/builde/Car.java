package com.project.builde;

public class Car {
	private Tyre tyre;
	private Carframe carframe;
	private Engine engine;
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Carframe getCarframe() {
		return carframe;
	}

	public void setCarframe(Carframe carframe) {
		this.carframe = carframe;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void show() {
		System.out.println("����װ����");
	}
}

//��̥
class Tyre{
	private String name;
	public Tyre(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
//����
class Carframe{
	private String name;
	public Carframe(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
//������
class Engine{
	private String name;
	public Engine(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

