package com.project.adapter;
/**
 * ¶ÔÏóÊÊÅäÆ÷
 * @author chaixf
 *
 */
public class ObjectAdapter implements Target{
	private Adaptee adaptee;

	public ObjectAdapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {
		adaptee.request();
	}
	
	
}
