package com.project.singleton;
/**
 * 饿汉式单例
 * 有点：效率高，线程安全
 * 缺点：不能懒加载
 *
 */
public class HungrySingleton {
	//类加载就初始化，天然线程安全
	private static HungrySingleton instance = new HungrySingleton();
	//私有构造器
	private HungrySingleton() {};
	//外部访问接口
	public static HungrySingleton getInstance() {
		return instance;
	}
}
