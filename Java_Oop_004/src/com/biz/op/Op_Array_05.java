package com.biz.op;

import java.util.ArrayList;

import com.biz.op.vo.StudentVO;

/*
 * StudentVO를 ArrayList에 담아서 사용한다.
 */
public class Op_Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentVO> sts = new ArrayList<StudentVO>();
		
		// 1. 요소로 사용 할 임시 객체 생성하고
		StudentVO vo = new StudentVO() ;
		
		// 2. 객체의 member변수에 값을 추가한 후
		vo.setIntNum(1);
		vo.setStrName("홍길동");
		vo.setIntAge(12);
		vo.setStrTel("001-001");
		
		// 3. 임시 객체를 ArrayList에 추가
		sts.add(vo);
		
		// 객체를 ArrayList에 add 하기 위해
		// 새로운 값을 추가하려면
		// 반드시 객체를 다시 생성 한 후
		// member변수들을 채워 넣어야 한다.
		
		vo = new StudentVO();
		vo.setIntNum(2);
		vo.setStrName("이몽롱");
		vo.setIntAge(22);
		vo.setStrTel("001-002");
		
		sts.add(vo);
		
		// 0번 요소의 값을 읽기
		System.out.println("0번 요소 값======");
		System.out.println(sts.get(0).getIntNum());
		System.out.println(sts.get(0).getStrName());
		System.out.println(sts.get(0).getIntAge());
		System.out.println(sts.get(0).getStrTel());
		

		System.out.println("1번 요소 값======");
		System.out.println(sts.get(1).getIntNum());
		System.out.println(sts.get(1).getStrName());
		System.out.println(sts.get(1).getIntAge());
		System.out.println(sts.get(1).getStrTel());
		
		
	}

}
