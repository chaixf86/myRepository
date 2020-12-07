package com.project.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class ClientSingleton2 {
	public static void main(String[] args) {
		//�����ƽ�
		try {
			BugSingleton s1 = BugSingleton.getInstance();
			
			//������
			Class<BugSingleton> clazz = (Class<BugSingleton>) Class.forName("com.project.singleton.BugSingleton");
			//����������
			Constructor<BugSingleton> constructor =  clazz.getDeclaredConstructor(null);
			//����У��˽�й�����
			constructor.setAccessible(true);
			//��������
			BugSingleton s2 = constructor.newInstance();
			
			System.out.println(s1 + "\n" + s2);//���������ͬ�Ķ��������˵���
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//�����л��ƽ�
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
//			System.out.println(s1 + "\n" + s2);//���������ͬ�Ķ��������˵���
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
	}
}
