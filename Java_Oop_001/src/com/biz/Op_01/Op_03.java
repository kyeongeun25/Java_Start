package com.biz.Op_01;

public class Op_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intAge = 20 ;
		int intYear = 2018 ;
		int intBirth = 1995 ;
		
		표시(intAge, intYear, intBirth);
		
		// HappyBirth라는 클래스를 이용해서
		// b 변수를 생성하라
		HappyBirth b = new HappyBirth ();
		b.intYear = 2018 ;
		b.intAge = 20 ;
		b.intBirth = 1998 ;
		표시(b);
		
	}
	static void 표시(HappyBirth a) {
		System.out.println(
				"올해는 "+a.intYear + "이고, "+"당신이 태어난 해는 "+a.intBirth+"이며 "+a.intAge+"세 입니다."
				
				);
	}
	static void 표시(int intAge, int intYear, int intBirth) {
		System.out.println("올해는 "+intYear+"이고,"+" 당신이 태어난 해는 "+intBirth+"이며 "+intAge+"세 입니다.");
	}

}
