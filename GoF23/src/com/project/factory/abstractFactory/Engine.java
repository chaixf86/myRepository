package com.project.factory.abstractFactory;

/**
 * 发动机
 * @author chaixf
 *
 */
public interface Engine {
	void run();
}

//高配发动机
class LuxuryEngine implements Engine{
	@Override
	public void run() {
		System.out.println("高配发动机-2.0T");
	}
}

//低配发动机
class LowEngine implements Engine{
	@Override
	public void run() {
		System.out.println("低配发动机-1.5T");
	}
}