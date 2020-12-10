package com.project.factory.simpleFactory;

/**
 * 工厂模式情况下
 * 优点：
 * 	1、工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责，很方便的创建出相应的产品。工厂和产品的职责区分明确。
 * 	2、客户端无需知道所创建具体产品的类名，只需知道参数即可。
 * 	3、也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。
 * 缺点：
 * 	1、简单工厂模式的工厂类单一，负责所有产品的创建，职责过重，一旦异常，整个系统将受影响。且工厂类代码会非常臃肿，违背高聚合原则。
 * 	2、使用简单工厂模式会增加系统中类的个数（引入新的工厂类），增加系统的复杂度和理解难度
 * 	3、系统扩展困难，一旦增加新产品不得不修改工厂逻辑，在产品类型较多时，可能造成逻辑过于复杂
 * 	4、简单工厂模式使用了 static 工厂方法，造成工厂角色无法形成基于继承的等级结构。
 * @author chaixf
 *
 */
public class Client {//调用者
	//只需知道接口和工厂类，就可以构建相应的对象
	public static void main(String[] args) {
		//普通简单工厂
		Car audi = CarFactory.createCar(CarFactory.AUDI);
		Car daben = CarFactory.createCar(CarFactory.DABEN);
		
		audi.run();
		daben.run();
		
		//静态工厂
		Car sAudi = CarStaticFactory.createAudi();
		Car sDaben = CarStaticFactory.createDaben();
		
		sAudi.run();
		sDaben.run();
		
		
	}
}
