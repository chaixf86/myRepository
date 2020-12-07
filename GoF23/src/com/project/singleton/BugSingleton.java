package com.project.singleton;

import java.io.Serializable;

/**
 * ������ʽΪ����
 * д���ļ��Ķ���Ҫʵ�����л��ӿ�
 * @author chaixf
 */
public class BugSingleton  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static BugSingleton instance;
	private BugSingleton() {}
	
	//������©��
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
	
	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷����Ķ��󣬶�����Ҫ�ٵ��������¶���
	private Object readResolve() {
		return instance;
	}
}
