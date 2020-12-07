package com.project.singleton;
/**
 * 内部类单例
 * 优点：兼备高并发调用和延迟加载优势
 * 注:外部类没有static静态属性，则不会像饿汉式那样立即加载对象
 */
public class InsideSingleton {

	private static class InsideInstance {
		//保证内存中只有一个实例存在，而且只能赋值一次，保证线程安全
		private static final InsideSingleton instance = new InsideSingleton();
	}
	//构造方法私有化
	private InsideSingleton() {}
	
	//获取对象
	public static InsideSingleton getInstance() {
		return InsideInstance.instance;
	}
}
