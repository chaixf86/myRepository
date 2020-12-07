package com.project.singleton;
/**
 * 双重检查锁单例
 * 
 * 注：由于编译器优化原因和JVM底层内部模型的原因,偶尔会出问题
 *
 */
public class DoubleCheckingLockSingleton {
	private static DoubleCheckingLockSingleton instance;
	
	private DoubleCheckingLockSingleton() {}
	
	public static DoubleCheckingLockSingleton getInstance() {
		if(instance == null) {
			DoubleCheckingLockSingleton doubleCheckingLock;
			synchronized(DoubleCheckingLockSingleton.class) {
				doubleCheckingLock = instance;
				if(doubleCheckingLock == null) {
					synchronized(DoubleCheckingLockSingleton.class) {
						if(doubleCheckingLock == null) {
							doubleCheckingLock = new DoubleCheckingLockSingleton();
						}
					}
					instance = doubleCheckingLock;
				}
			}
		}
		return instance;
	}
}
