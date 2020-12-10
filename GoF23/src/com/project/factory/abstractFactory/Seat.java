package com.project.factory.abstractFactory;

/**
 * 座椅
 * @author chaixf
 *
 */
public interface Seat {
	void operation();
}

//高配座椅
class LuxurySeat implements Seat{
	@Override
	public void operation() {
		System.out.println("高端真皮座椅-电动操作");
	}
}

//低配座椅
class LowSeat implements Seat{
	@Override
	public void operation() {
		System.out.println("低端仿革座椅-手动操作");
	}
	
}