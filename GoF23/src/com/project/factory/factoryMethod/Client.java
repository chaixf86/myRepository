package com.project.factory.factoryMethod;
/**
 * 工厂方法模式
 * 优点：
 * 	用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程。
 * 	灵活性增强，对于新产品的创建，只需多写一个相应的工厂类。
 * 	典型的解耦框架。高层模块只需要知道产品的抽象类，无须关心其他实现类，满足迪米特法则、依赖倒置原则和里氏替换原则。
 * 缺点：
 * 	类的个数容易过多，增加复杂度
 * 	增加了系统的抽象性和理解难度
 * 	抽象产品只能生产一种产品，此弊端可使用抽象工厂模式解决。
 * @author chaixf
 *
 * 新加的Byd类需实现Car
 * 新加的BydFactory类需实现CarFactory
 */
public class Client {
	public static void main(String[] args) {
//		CarFactory factory = (CarFactory) ClientConfigure.getObject(ClientConfigure.AUDI);
//		Car audi = factory.createCar();
//		audi.run();
		
		//调用端就可以调用新加的Byd对象
		CarFactory factory = (CarFactory) ClientConfigure.getObject(ClientConfigure.BYD);
		Car byd = factory.createCar();
		byd.run();
	}
}
