package com.project.prototype.deep;

import com.project.prototype.Person;

public class Realizetype implements Cloneable{
	public Person person = new Person();
	
	public Realizetype() {
		System.out.println("����ԭ�ʹ����ɹ�������");
	}
	
	@Override
	protected Realizetype clone() throws CloneNotSupportedException {
		Realizetype cloneObj = (Realizetype) super.clone();
		Realizetype obj = new Realizetype();
		obj.person.setName(cloneObj.person.getName());
		return obj;
	}
}
