package com.biz.op;

import java.util.ArrayList;

import com.biz.op.vo.StudentVO;

/*
 * StudentVO�� ArrayList�� ��Ƽ� ����Ѵ�.
 */
public class Op_Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentVO> sts = new ArrayList<StudentVO>();
		
		// 1. ��ҷ� ��� �� �ӽ� ��ü �����ϰ�
		StudentVO vo = new StudentVO() ;
		
		// 2. ��ü�� member������ ���� �߰��� ��
		vo.setIntNum(1);
		vo.setStrName("ȫ�浿");
		vo.setIntAge(12);
		vo.setStrTel("001-001");
		
		// 3. �ӽ� ��ü�� ArrayList�� �߰�
		sts.add(vo);
		
		// ��ü�� ArrayList�� add �ϱ� ����
		// ���ο� ���� �߰��Ϸ���
		// �ݵ�� ��ü�� �ٽ� ���� �� ��
		// member�������� ä�� �־�� �Ѵ�.
		
		vo = new StudentVO();
		vo.setIntNum(2);
		vo.setStrName("�̸���");
		vo.setIntAge(22);
		vo.setStrTel("001-002");
		
		sts.add(vo);
		
		// 0�� ����� ���� �б�
		System.out.println("0�� ��� ��======");
		System.out.println(sts.get(0).getIntNum());
		System.out.println(sts.get(0).getStrName());
		System.out.println(sts.get(0).getIntAge());
		System.out.println(sts.get(0).getStrTel());
		

		System.out.println("1�� ��� ��======");
		System.out.println(sts.get(1).getIntNum());
		System.out.println(sts.get(1).getStrName());
		System.out.println(sts.get(1).getIntAge());
		System.out.println(sts.get(1).getStrTel());
		
		
	}

}
