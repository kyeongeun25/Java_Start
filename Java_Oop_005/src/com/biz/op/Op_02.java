package com.biz.op;

import com.biz.op.service.VatService;

public class Op_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VatService Ŭ������ ��ü�� ����
		VatService vatService = new VatService();
		
		System.out.println(vatService.sum(30, 80));
		System.out.println(vatService.���ͱ�(1200, 1000));
		
		/*
		 *  ��ǰ������ ��� �� ��
		 *  ��ǰ������ �ΰ��� �����̸�
		 *  �ΰ����� ��ǰ����/10 ���� �ܼ� ����ϸ� �ȴ�.
		 *  	��ǰ������ 800���̸� �ΰ����� 80 : �����ݾ� 880��
		 *  
		 *  ��ǰ������ �ΰ��� �����̸�
		 *  1. ��ǰ������ �ΰ��� ���� �ݾ����� ����ؾ� �Ѵ�.
		 *  	��ǰ���� / 1.1�� ����ϰ�,
		 *  	�Ҽ������� ���� ������.
		 *  
		 */
		
		System.out.println("�ΰ��� ���� : "+(int)(1000/1.1));
		
		
		// vatService�� ���Ӱ� ���ǵ� ���ͱ�() �޼��带 �̿��ؼ� 
		// �ΰ����� ���ܵ� ���ͱ��� ���
		// ���� ���ǵ� ���ͱ�() �޼���� �Ǽ����� 2�� �޵��� �Ǿ� �ִ�.
		
		int ���ͱ� = vatService.���ͱ�(1200f, 1000f);
		System.out.println("�ΰ��� ���� ���ͱ� : "+���ͱ�);
		
		
		
		
		
	}

}
