package com.project.factory.abstractFactory;

/**
 * ������
 * @author chaixf
 *
 */
public interface Engine {
	void run();
}

//���䷢����
class LuxuryEngine implements Engine{
	@Override
	public void run() {
		System.out.println("���䷢����-2.0T");
	}
}

//���䷢����
class LowEngine implements Engine{
	@Override
	public void run() {
		System.out.println("���䷢����-1.5T");
	}
}