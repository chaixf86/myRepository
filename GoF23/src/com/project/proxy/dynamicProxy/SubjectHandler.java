package com.project.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectHandler implements InvocationHandler{
	private RealSubject subject;
	public SubjectHandler(RealSubject subject) {
		super();
		this.subject = subject;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		method.invoke(subject, args);
		after();
		return null;
	}
	
	private void before() {
		System.out.println("动态代理类之前操作");
	}
	
	private void after() {
		System.out.println("动态代理类之后操作");
	}
	
}
