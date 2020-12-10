package com.project.factory.factoryMethod;

public class Byd implements Car{

	/**
	 * 新加的产品只需要实现Car
	 */
	@Override
	public void run() {
		System.out.println("这是新加的比亚迪");
	}

}
