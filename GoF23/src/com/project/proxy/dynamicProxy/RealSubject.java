package com.project.proxy.dynamicProxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("这是真实对象操作");
	}

}
