package com.test.thread.one;

/**
 * synchronized �ؼ���
 * ͬ������ - ԭ����
 * ������Ŀ�ģ�����Ϊ�˱�֤������ԭ����
 * @author Administrator
 *
 */
public class Test_03 implements Runnable{
	private int count = 0 ;

	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName()
				+ " count = " + count++ );
	}
	
	public static void main(String[] args) {
		Test_03 t = new Test_03();
		
		for (int i=0;i<5;i++){
			new Thread(t,"Thread - "+ i).start();
		}
		
	}
	
}
