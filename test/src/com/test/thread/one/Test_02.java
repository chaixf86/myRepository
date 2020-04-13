package com.test.thread.one;

/**
 * synchronized �ؼ���
 * ͬ������ -static
 * ��̬ͬ�������������ǵ�ǰ���͵������
 * @author Administrator
 *
 */
public class Test_02 {
	private static int staticCount = 0;
	
	public static synchronized void testSych1(){
		System.out.println(Thread.currentThread().getName()
				+"staticCount = "+staticCount++);
	}
	
	public static void testSych2(){
		synchronized(Test_02.class){
			System.out.println(Thread.currentThread().getName()
					+"staticCount = "+staticCount++);
		}
	}
}
