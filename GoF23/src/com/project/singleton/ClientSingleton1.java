package com.project.singleton;

public class ClientSingleton1 {
	public static void main(String[] args) {
		//����ʽ
//		HungrySingleton s1 = HungrySingleton.getInstance();
//		HungrySingleton s2 = HungrySingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//����ʽ
//		LazySingleton s1 = LazySingleton.getInstance();
//		LazySingleton s2 = LazySingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//˫�ؼ����
//		DoubleCheckingLockSingleton s1 = DoubleCheckingLockSingleton.getInstance();
//		DoubleCheckingLockSingleton s2 = DoubleCheckingLockSingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//�ڲ���
//		InsideSingleton s1 = InsideSingleton.getInstance();
//		InsideSingleton s2 = InsideSingleton.getInstance();
//		System.out.println(s1 + "\n" + s2);
		
		//ö��
		EnumSingleton s1 = EnumSingleton.INSTANCE;
		EnumSingleton s2 = EnumSingleton.INSTANCE;
		System.out.println(s1 + "\n" + s2);
		
		
	}
}
