package com.test.thread.one;
/**
 * synchronized�ؼ���
 * synchronized������
 * ���������this���ٽ���Դ����Class�����
 * �ٽ���Դ���󣺶���̶߳��ܷ��ʵ��Ķ���
 * synchronized(this)��synchronized ������������ǰ����
 * 
 * @author Administrator
 *
 */
public class Test_01 {
	private int count = 0;
	private Object o= new Object();
	
	public void testSync1(){
		synchronized(o){
			System.out.println(Thread.currentThread().getName()
					+"count = "+count++);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void testSync2(){
		synchronized(this){
			System.out.println(Thread.currentThread().getName()
					+"count = "+count++);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void testSync3(){
		System.out.println(Thread.currentThread().getName()
				+"count = "+count++);
	}
	
	public static void main(String[] args) {
		Test_01 t = new Test_01();
		
		t.testSync1();
		t.testSync2();
		t.testSync3();
		
	}
	
	
}
