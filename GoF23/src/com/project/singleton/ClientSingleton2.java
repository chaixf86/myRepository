package com.project.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class ClientSingleton2 {
	public static void main(String[] args) {
		//反射破解
		try {
			BugSingleton s1 = BugSingleton.getInstance();
			
			//加载类
			Class<BugSingleton> clazz = (Class<BugSingleton>) Class.forName("com.project.singleton.BugSingleton");
			//创建构造器
			Constructor<BugSingleton> constructor =  clazz.getDeclaredConstructor(null);
			//跳过校验私有构造器
			constructor.setAccessible(true);
			//创建对象
			BugSingleton s2 = constructor.newInstance();
			
			System.out.println(s1 + "\n" + s2);//输出两个不同的对象，跳过了单例
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//反序列化破解
//		try {
//			FileOutputStream fos = new FileOutputStream("d:/a.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(s1);
//			oos.close();
//			fos.close();
//			
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
//			BugSingleton s2 = (BugSingleton) ois.readObject();
//			ois.close();
//			System.out.println(s1 + "\n" + s2);//输出两个不同的对象，跳过了单例
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
	}
}
