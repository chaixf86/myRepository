package com.project.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		ProxySubject proxy = new ProxySubject(subject);
		proxy.request();
	}
}
