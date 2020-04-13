package com.test;

import java.util.concurrent.TimeUnit;

public class Test {
	volatile boolean flog = false;
	volatile Integer inter = new Integer(0);
	int i = 0;
	
	
	void add(){
		synchronized(this){
			while(true){
				if(flog)return;
				inter = new Integer(++i);
				System.out.println("---"+inter+"---");
				
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	} 
	
	void size(){
		while(true){
			if(inter >= 5){
				System.out.println("size,жуж╧");
				flog = true;
				return;
			}
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		final Test t = new Test();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				t.add();
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				t.size();
				
			}
		}).start();
		
		
	}
}
