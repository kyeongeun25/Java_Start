package com.biz.op.service;

public class HomplusService extends AddService {
	
	/*
	 *  �θ� Ŭ������ method �߿���
	 *  	�� ����� �ʿ������,
	 *  	�̸��� �״�� ����ϱ� ���ؼ�
	 *  	method�� �� �����ϴ� ��
	 *  	===> Override
	 * 
	 */
	
	
	@Override
	public int ���ͱ�(int �Ǹűݾ�, int ���Աݾ�) {
		
		int �Ǹ� = (int)(�Ǹűݾ� / 1.1f) ;
		int ���� = (int)(���Աݾ� / 1.1f );
		
		return (int)(�Ǹ� - ����) ;
	}

}
