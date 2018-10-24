package com.biz.be_06;

/*
 * JDK에 이미 만들어져 있는 method들의
 * 사용법 몇가지 익히기
 * 
 * JDK에 이미 만들어져 있는 method들을
 * 사용하려면 클래스라는 개념을 알아야 하는데,
 * 일단 클래스라는 것을 건너뛰고
 * 
 * JDK에 있는 method를 내장(include), 시스템(system) method라고 한다.
 */
public class Be_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("나는 자랑스러운");
		
		// int, float 등 소문자로 시작되는 키워드 = 예약어(Resolved word)
		// 예약어로 선언된 변수는 값을 보관하고 읽는 용도로만 사용
		int intNum = 0;
		float fNum = 0.0f;
		
		// fNum : 값을 보관하는 용도
		// intNum : 값을 읽는 용도
		fNum = intNum ;
		
		// 어떤 키워드 첫 글자가 대문자로 시작되면
		// 그것을 class라고 부른다.
		// 클래스로 선언된 변수는 JDK 내부에서 다양한 method들을
		// 첨가하여 변수를 만든다.
		// 변수가 값을 보관, 읽는 용도 외에 다양하게 쓰일 수 있다.
		String strName = "Republic of Korea";

		// 클래스는 내부에 많은, 다양한, 여러가지 method들을 포함하고 있다.
		// String 클래스로 선언된 변수를 통해서 
		// String에 포함된 다양한 method들을 사용해보자
		// 변수명.method() 형식으로 사용 할 수 있다.
		System.out.println(strName);
		System.out.println(strName.toUpperCase());
			// String.toUpperCase() 메서드는 
			// 문자열 변수에 저장된 영문자를 
			// 모두 대문자로 바꾸어서 return
		
		System.out.println(strName.toLowerCase());
		
		// 문자열 비교
		String t = "Korea";
		if(t=="Korea") {
			System.out.println("대한민국");
		}
		// >> 문자열 변수에 값을 비교하고자 할 때,
		// 		==을 사용하지 않는다.
		
		// 문자열 변수에 값을 비교하고자 할 때는,
		// String에 포함된 method를 사용해야 한다.
		
		if(t.equals("Korea")) {
			System.out.println("대한민국");
		}
		// >> String.equals() method는
		// 문자열 변수에 있는 값을 비교하고자 할 때
		// 사용하는 메서드이다.
		// String에 포함된 값이 매개변수로 전달된 값과 같으면
		// true를 리턴한다.
		
		if(t.equals("Korea")==true) {
			System.out.println("대한민국");
		}
		
		// 영문자는 대소문자가 서로 다른 문자로 인식된다.
		// 대소문자가 다르면 다른 문자열이다.
		if(t.equals("KOREA")) {	
			System.out.println("대한민국");
		}else {
			System.out.println("글쎄");
		}
		
		// 대소문자에 관계없이 구분을 하고 싶을 때
		if(t.equalsIgnoreCase("korea")) {
			System.out.println("대한");
		}else {
			System.out.println("No!");
		}
		// equals는 대소문자가 정확히 일치해야 true
		// equalsIgnoreCase는 대소문자 관계없이 
		//		문자만 일치하면 true
		
		if(t.equalsIgnoreCase("KOREA")) {
			System.out.println("yes");
		}else {
			System.out.println("nono");
		}
		
		// 문자열을 이용해서 비교를 하거나 
		// 어떤 값을 검색(찾기)를 할 때
		// 문자열 앞, 뒤에 무의식중에 추가한 " "는
		// 비교를 틀린 값으로 인식한다.
		if(t.equalsIgnoreCase(" Korea ")) {
			System.out.println("yesyes");
		}else {
			System.out.println("nonono");
		}
		
	}

}
