package com.project.prototype.deep;

/**
 * ���¡��
 * 	����һ���¶������������õ���������Ҳ�ᱻ��¡������ָ��ԭ�ж����ַ��
 * @author chaixf
 *
 */

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Realizetype obj1 = new Realizetype();
		obj1.person.setName("����");
		Realizetype obj2 = obj1.clone();
		obj1.person.setName("����");
		
		System.out.println(obj1.person.getName());
		System.out.println(obj2.person.getName());
	}
}
