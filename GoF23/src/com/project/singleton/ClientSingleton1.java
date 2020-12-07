package com.project.singleton;

public class ClientSingleton1 {
	public static void main(String[] args) {
		//饿汉式
//		HungrySingleton s1 = HungrySingleton.getInstance();
//		HungrySingleton s2 = HungrySingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//懒汉式
//		LazySingleton s1 = LazySingleton.getInstance();
//		LazySingleton s2 = LazySingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//双重检查锁
//		DoubleCheckingLockSingleton s1 = DoubleCheckingLockSingleton.getInstance();
//		DoubleCheckingLockSingleton s2 = DoubleCheckingLockSingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//内部类
//		InsideSingleton s1 = InsideSingleton.getInstance();
//		InsideSingleton s2 = InsideSingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//枚举
		EnumSingleton s1 = EnumSingleton.INSTANCE;
		EnumSingleton s2 = EnumSingleton.INSTANCE;
		System.out.println(s1 + "\n" + s2);
		
		
	}
}
