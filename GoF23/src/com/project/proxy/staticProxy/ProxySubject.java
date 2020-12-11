package com.project.proxy.staticProxy;

public class ProxySubject implements Subject{

	private RealSubject subject;
	public ProxySubject(RealSubject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		before();
		subject.request();
		after();
	}
	
	private void before() {
		System.out.println("������֮ǰ����");
	}
	
	private void after() {
		System.out.println("������֮�����");
	}

}
