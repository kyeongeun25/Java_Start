package com.biz.Op_01;

/*
 * main() method가 있는 클래스는
 * 혼자 실행이 가능하다.
 * Ctrl + F11 : run을 실행해서
 * 어떤 결과를 확인 할 수 있는 클래스
 */
public class Op_01 {

	public static void main(String[] args) {
	
		// 자바에 기본적으로 포함된
		// 자료형(변수형)인 int, String, float 등이 아닌
		// 누군가에 의해서 임의로 만들어진 자료형
		성적표 g = new 성적표();
		// 성적표 g1 = ??; = 다음에 올 수 있는 것이
								// 정해지지 않아서 String, Integer 처럼
								// 사용할 수 없는 것 뿐
								// String이나 Integer와 같이 클래스라고 부름
		
		int intNum1 = 0;
		String strName = "홍길동";
		Integer intNum2 = 0;
		
		String strName2 = new String("이몽룡");
		Integer intNum3 = new Integer(0);
		
		// 우리가 만든 Grade라는 클래스를 사용해서
		// grade라는 변수를 만든 것
		// Grade라는 클래스는 기본 값이 없기 때문에
		// Grade 변수 = ?? 형식으로 사용하지 못한다.
		Grade grade = new Grade();
		
		// 아무것도 없는 빈 클래스를 가지고 변수를 선언
		// 그런데
		// 이 변수는 String, Integer로 생성한 변수처럼
		// 여러가지 method를 사용 할 수 있도록 이ㅣㅁ
		// 만들어 놓았다.
		// 이미 만들어진 method는 "변수."으로 시작하여
		// 사용 할 수 있다.
		
		// 또한, 클래스에 만든 member 변수도 "변수.member" 형식으로
		// 사용가능하다.
		
		grade.num = 1;
		grade.name = "홍길동";
		grade.kor = 90;
		grade.eng = 80;
		grade.math = 70;
		
		System.out.println(grade.num);
		System.out.println(grade.name);
		System.out.println(grade.kor);
		System.out.println(grade.eng);
		System.out.println(grade.math);
		
	}

}
