package com.project.prototype.deep;

import com.project.prototype.Person;

public class Realizetype implements Cloneable{
	public Person person = new Person();
	
	public Realizetype() {
		System.out.println("具体原型创建成功！！！");
	}
	
	@Override
	protected Realizetype clone() throws CloneNotSupportedException {
		Realizetype cloneObj = (Realizetype) super.clone();
		Realizetype obj = new Realizetype();
		obj.person.setName(cloneObj.person.getName());
		return obj;
	}
}
