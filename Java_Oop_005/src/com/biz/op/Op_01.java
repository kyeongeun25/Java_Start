package com.biz.op;

import com.biz.op.service.AddService;

public class Op_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ AddService Ŭ������ ����ؼ�
		// ������ ���ͱ��� ���
		
		
		
		// 1. Ŭ������ ��ü�� ����
		AddService service = new AddService();
		
		// 2. ����method�� ȣ���ϴµ� 2���� ������ �����ϰ�
		//	  ����� intSum�� �Ҵ� �޴´�.
		int intSum = service.sum(30, 50);
		
		
		// 3. ����� ȭ�鿡 ǥ��
		System.out.println(intSum);
		

		// �Ǹűݾװ� ���Աݾ��� ���ͱ�() method�� �����ϰ�
		// ���ͱ�() method�� ȣ���ؼ� ���ͱ� ��� ����� intMargin ������ �Ҵ�
		
		// 1. �Ǹűݾװ� ���Աݾ� ���� ����
		int �Ǹűݾ� = 120000;
		int ���Աݾ� = 100000;
		
		int intMargin = service.���ͱ�(�Ǹűݾ�, ���Աݾ�);
		
		System.out.println(intMargin);
		

		
		
		
		
		
		
		
		
		
		
		
	}

}