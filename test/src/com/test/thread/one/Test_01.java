package com.test.thread.one;
/**
 * synchronized关键字
 * synchronized锁对象
 * 对象包含：this，临界资源对象，Class类对象
 * 临界资源对象：多个线程都能访问到的对象
 * synchronized(this)和synchronized 方法都是锁当前对象
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
