package com.biz.op;

public class Op_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentVO student = new StudentVO();
		
		student.setIntNum(100);
		student.setStrName("ȫ�浿");
		student.setIntAge(22);
		
		System.out.println(student.getIntNum());
		System.out.println(student.getStrName());
		System.out.println(student.getIntAge());
		
		System.out.println(student.toString());
		
	}

}
