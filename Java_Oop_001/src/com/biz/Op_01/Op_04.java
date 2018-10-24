package com.biz.Op_01;

public class Op_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade g = new Grade();
		
		// 클래스를 이용해서 변수를 생성할 때는
		// 첫 글자를 소문자로 하고 클래스 이름과 같은 형태로 만든다.
		Grade grade = new Grade ();
		
		// 이 때 생성된 클래스변수를 "객체"라고 한다.
		// >> 클래스를 이용해서 객체를 만들어 사용한다.
		// >> class를 이용해서 object를 만들어 사용한다.
		
		// 생성된 객체는 점(.)연산자를 이용해서
		// member 변수나 확장된 method를 사용 할 수 있다.
		grade.num = 1 ;
		grade.name = "홍길동" ;
		grade.kor = 20 ; 
		
		System.out.println(grade);
		
	}

}
