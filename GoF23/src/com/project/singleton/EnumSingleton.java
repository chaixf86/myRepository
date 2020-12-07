package com.project.singleton;

/**
 * 枚举单例
 * 优点：实现简单，枚举本身就是单例模式
 * 由JVM从根本上提供保障，并且避免了反射和反序列化的漏洞
 * 缺点：无延迟加载
 */
public enum EnumSingleton {
	//定义枚举元素，代表singleton的一个实例，本身就是一个单例对象
	INSTANCE;
	
	//单例可以有自己的操作
	public void singletonOperation() {
		//功能处理
	}
}
