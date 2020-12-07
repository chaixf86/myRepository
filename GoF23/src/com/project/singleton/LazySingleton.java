package com.project.singleton;

/**
 * 懒汉式单例
 * 优点：懒加载、延迟加载，第一次调用时创建单例对象
 * 缺点：为了线程安全，获取单例方法加锁，所以效率低
 *
 */
public class LazySingleton {
	//类加载不创建对象
	private static LazySingleton instance;
	//构造器私有化
	private LazySingleton() {}
	
	//未线程安全加锁，第一次加载创建单例对象
	//不加锁在高并发情况下可能创建多个对象
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
