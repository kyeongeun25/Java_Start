package com.biz.op;

import com.biz.op.imp.RadioRemoCon;
import com.biz.op.imp.RemoCon;
import com.biz.op.imp.TvRemoCon;

public class Op_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TvRemoCon tv  = new TvRemoCon();
		
		tv.����();
		tv.����();
		tv.ä��();
		
		RadioRemoCon radio = new RadioRemoCon();
		
		radio.����();
		radio.����();
		radio.ä��();
		
		// �������̽��� ��ӹ��� Ŭ������
		// �������̽��� �����ϰ�
		// �ڽ�(�ڽ�Ŭ����)���� �ʱ�ȭ�Ͽ� ����ϱ⵵ �Ѵ�.
		// �̷п��� ��ü���� �������� ���߾� �ڵ带 �����ϰ�
		// �ϴ� ���̶�� �Ѵ�.
		
		// RemoCon �θ� Ŭ������ �����ϰ�
		// TvRemoCon �ڽ� Ŭ������ �ʱ�ȭ �� ��
		RemoCon tv1 = new TvRemoCon();
		tv1.����();
		tv1.����();
		tv1.ä��();
		
		RemoCon rd1 = new RadioRemoCon();
		rd1.����();
		rd1.����();
		rd1.ä��();
		
	}

}
