package com.biz.op;

import java.util.ArrayList;

import com.biz.op.vo.StudentVO;

public class Op_Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자형 ArrayList를 생성
		// <> : Generic 선언자
		//		int, float, char 등은 들어 갈 수 없다.
		//		클래스형 만 들어갈 수 있다.
		// 따라서 숫자(정수형) ArrayList에는 
		// int 대신 Integer를 사용해야 한다.
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		
		// 숫자형 중 실수형
		ArrayList<Float> ff = new ArrayList<Float>();
		
		ArrayList<StudentVO> vos = new ArrayList<StudentVO>();
		
		
	}

}
