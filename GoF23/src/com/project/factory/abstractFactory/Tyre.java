package com.project.factory.abstractFactory;

/**
 * ��̥
 * @author chaixf
 *
 */
public interface Tyre {
	void revolve();
}

//�߶���̥
class LuxuryTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("�߶���̥-������ת��ĥ��");
	}
}

//�Ͷ���̥
class LowTyre implements Tyre {
	@Override
	public void revolve() {
		System.out.println("�Ͷ���̥-��תĥ��");
	}
}