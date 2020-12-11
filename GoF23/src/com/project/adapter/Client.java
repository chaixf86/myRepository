package com.project.adapter;

/**
 * ¿Í»§¶ËÀà
 * @author chaixf
 *
 */
public class Client {
	public void test(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		Adaptee adaptee = new Adaptee();
		Target t = new ObjectAdapter(adaptee);
		client.test(t);
	}
}
