package com.biz.op;

import java.util.ArrayList;

public class Op_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentVO> sts = new ArrayList<StudentVO>();
		
		StudentVO vo = new StudentVO();
		vo.setIntNum(1);
		vo.setStrName("ȫ�浿");
		vo.setIntAge(22);
		sts.add(vo);
		
		vo = new StudentVO();
		vo.setIntNum(2);
		vo.setStrName("�̸���");
		vo.setIntAge(16);
		sts.add(vo);
		
		
		vo = new StudentVO();
		vo.setIntNum(3);
		vo.setStrName("������");
		vo.setIntAge(16);
		sts.add(vo);
		
		for( StudentVO v : sts) {
			System.out.println(v.toString());
		}
		
		
		
		
	}

}
