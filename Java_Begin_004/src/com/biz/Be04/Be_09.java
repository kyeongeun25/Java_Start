package com.biz.Be04;

public class Be_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2개의 정수형 숫자 변수를 만들기(선언, 초기화)
		int intNum1 = 0 ;
		int intNum2 = 0 ;
		
		// make() 메서드를 호출해서
		// 변수에 값을 할당해 본다.
		
		// 기존 변수에 저장값을 다른 변수에 할당
		intNum1 = intNum2 ;
		// intNum2에 저장된 값을 intNum1에 복사
		// 		>> 할당
		
		sum();
		intNum1 = make(30, 40);
		//intNum1 = make();
		System.out.println(intNum1);
		// 1. make() method가 있는가? 확인
		// 2. ()안에 아무런 매개변수가 없는가? 확인
		// 3. make() 호출
		// 4. make()는 return 키워드에 의해서
		// 5. 10 이라는 정수를 응답하고
		// 6. 응답된 10은 intNum1 변수에 할당된다.
		
		
	} // end main()
	
	// method를 만들 때 중간에 사용한 void 키워드에 주목!
	// void
	//		아무것도 결과가 없다는 표현
	
	
	public static void sum() {
		System.out.println(30+40);
	}
	
	// make method를 만들면서
	// void 키워드 대신에 int 사용
	public static int make(int num1, int num2) {
		return num1+num2;
		// return 0;
		
		
	}

}
