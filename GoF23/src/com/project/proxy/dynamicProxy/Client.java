package com.project.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		SubjectHandler handler = new SubjectHandler(subject);
		Subject proxy = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, handler);
		proxy.request();
	}
}
