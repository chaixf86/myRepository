package com.project.factory.simpleFactory;

/**
 * 无工厂模式情况下
 * @author chaixf
 *
 */
public class NoFactoryClient {//调用者
	//既要知道接口，又要知道实现类
	public static void main(String[] args) {
		Car audi = new Audi();
		Car daben = new Daben();
		
		audi.run();
		daben.run();
	}
}
