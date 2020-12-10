package com.project.factory.abstractFactory;

/**
 * ����
 * @author chaixf
 *
 */
public interface Seat {
	void operation();
}

//��������
class LuxurySeat implements Seat{
	@Override
	public void operation() {
		System.out.println("�߶���Ƥ����-�綯����");
	}
}

//��������
class LowSeat implements Seat{
	@Override
	public void operation() {
		System.out.println("�Ͷ˷¸�����-�ֶ�����");
	}
	
}