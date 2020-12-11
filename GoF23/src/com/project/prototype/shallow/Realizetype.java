package com.project.prototype.shallow;

import com.project.prototype.Person;

public class Realizetype implements Cloneable{
	public Person person = new Person();
	
	public Realizetype() {
		System.out.println("具体原型创建成功！！！");
	}
	
	@Override
	protected Realizetype clone() throws CloneNotSupportedException {
		return (Realizetype) super.clone();
	}
}
