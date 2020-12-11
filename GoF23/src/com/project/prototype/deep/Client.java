package com.project.prototype.deep;

/**
 * 深克隆：
 * 	创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 * @author chaixf
 *
 */

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Realizetype obj1 = new Realizetype();
		obj1.person.setName("张三");
		Realizetype obj2 = obj1.clone();
		obj1.person.setName("李四");
		
		System.out.println(obj1.person.getName());
		System.out.println(obj2.person.getName());
	}
}
