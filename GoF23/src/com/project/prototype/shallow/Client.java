package com.project.prototype.shallow;
/**
 * 浅克隆：
 * 	创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
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
