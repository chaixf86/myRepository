package com.project.adapter;

/**
 * ÀàÊÊÅäÆ÷
 * @author chaixf
 *
 */
public class ClassAdapter extends Adaptee implements Target{

	@Override
	public void handleReq() {
		super.request();
	}
	
}
