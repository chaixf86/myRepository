package com.project.proxy.staticProxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("������ʵ�������");
	}

}
