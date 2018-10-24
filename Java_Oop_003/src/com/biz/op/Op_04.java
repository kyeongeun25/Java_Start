package com.biz.op;

/*
 * GradeVO 클래스를 이용하여
 * 10개의 성적처리 배열을 생성 
 */

public class Op_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeVO[] gs = new GradeVO[10];
		
		// 클래스는 배열로 만든다음
		// 각 요소를 다시 객체로 생성해주어야 한다.
		for(int i = 0; i <gs.length ; i++) {
			gs[i] = new GradeVO();
		}
		   
		
	}

}
