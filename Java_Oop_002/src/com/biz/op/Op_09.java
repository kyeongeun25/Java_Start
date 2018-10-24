package com.biz.op;

public class Op_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 배열 생성과 초기화
		GradeVO[] gs = new GradeVO[100]; 		// 배열 생성
		
		for( int i = 0 ; i < gs.length ; i++) {
			gs[i] = new GradeVO();
		}
		
		// >> 이후에는 읽기, 쓰기 등이 모두 가능
		
	}

}
