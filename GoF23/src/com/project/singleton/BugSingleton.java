package com.project.singleton;

import java.io.Serializable;

/**
 * 以懒汉式为例子
 * 写入文件的对象要实现序列化接口
 * @author chaixf
 */
public class BugSingleton  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static BugSingleton instance;
	private BugSingleton() {}
	
	//防反射漏洞
//	private BugSingleton() {
//		if(instance != null) {
//			throw new RuntimeException();
//		}
//	}
	
	public static synchronized BugSingleton getInstance() {
		if(instance == null) {
			instance = new BugSingleton();
		}
		return instance;
	}
	
	//反序列化时，如果定义了readResolve()则直接返回此方法的对象，而不需要再单独创建新对象
	private Object readResolve() {
		return instance;
	}
}
