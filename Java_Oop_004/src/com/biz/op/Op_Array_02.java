package com.biz.op;

// Ctrl + Shift + O
// �ڵ����� import ���ֱ�
import com.biz.op.vo.StudentVO;

public class Op_Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// StudentVOŬ������ ����ؼ�
		// studentVO ��ü�� 10�� �迭�� ����
		StudentVO[] studentVO = new StudentVO[10] ;
		for(int i = 0 ; i <studentVO.length ; i++) {
			studentVO[i] = new StudentVO();
		}
		
		// ������
		// new ������[??] : �迭 ������
		// new ������() : ��ü ������
		
		// int, float, String : primitive(�⺻)�ڷ����� 
		//						�迭 ������ �����ص� ��ٷ� �а�, ���� ����
		
		// ������ ����������� Ŭ������ 
		// �迭 ���������� �а�, ���Ⱑ �Ұ����ϴ�.
		// Ŭ������ �迭�� ������ ��
		// �迭 ��ҵ��� ���� ��ü �����ڷ� �ٽ� �����ؾ� �Ѵ�.
	}

}
