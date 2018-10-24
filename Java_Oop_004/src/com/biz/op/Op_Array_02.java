package com.biz.op;

// Ctrl + Shift + O
// 자동으로 import 해주기
import com.biz.op.vo.StudentVO;

public class Op_Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// StudentVO클래스를 사용해서
		// studentVO 객체를 10개 배열로 생성
		StudentVO[] studentVO = new StudentVO[10] ;
		for(int i = 0 ; i <studentVO.length ; i++) {
			studentVO[i] = new StudentVO();
		}
		
		// 생성자
		// new 생성자[??] : 배열 생성자
		// new 생성자() : 객체 생성자
		
		// int, float, String : primitive(기본)자료형은 
		//						배열 생성만 실행해도 곧바로 읽고, 쓰기 가능
		
		// 하지만 사용자정의형 클래스는 
		// 배열 생성만으로 읽고, 쓰기가 불가능하다.
		// 클래스는 배열을 생성한 후
		// 배열 요소들을 각각 객체 생성자로 다시 생성해야 한다.
	}

}
