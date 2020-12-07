package com.project.singleton;
/**
 * ˫�ؼ��������
 * 
 * ע�����ڱ������Ż�ԭ���JVM�ײ��ڲ�ģ�͵�ԭ��,ż���������
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
