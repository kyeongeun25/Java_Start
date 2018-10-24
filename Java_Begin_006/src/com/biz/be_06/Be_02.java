package com.biz.be_06;

public class Be_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "Republic of Korea" ;
		
		// strNation에 포함된 문자열의 길이를 리턴 ( 빈칸도 포함 )
		int len = strNation.length();	// length() : int - int값을 리턴한다. 
		System.out.println(len);
		
		strNation = "대한민국";
		System.out.println(strNation.length());
		
		// String.charAt(위치)
		// String에서 위치번째 문자(글자) 한개를 return
		System.out.println(strNation.charAt(0));
		
		// begin과 end 값을 매개변수로 받아서
		// begin 앞에서 자르고, end 앞에서 잘라서
		// 중간에 잘린 문자열만 return
		System.out.println(strNation.substring(0, 3));
		
		strNation = "Republic of Korea";
		
		// begin 앞에서 자르고 이후의 나머지 문자열을 return
		System.out.println(strNation.substring(5));
		
		for(int i = 0 ; i < 17 ; i++) {
			System.out.println(strNation.substring(i));
		}
		
		// 문자열에서 앞의 한글자씩 잘라내고 보여주기
		for(int i = 0 ; i < strNation.length() ; i++) {
			System.out.println(strNation.substring(i));
		}
		
		// 문자열에서 1글자씩 잘라서 보여주기
		for(int i = 0; i < strNation.length();i++) {
			System.out.println(strNation.charAt(i));
		}
		System.out.println();
		
		// 문자열에서 1글자씩 잘라서 +1을 한다음 보여주기
		for(int i = 0; i < strNation.length() ; i++) {
			System.out.print(strNation.charAt(i)+1);
		}
		System.out.println();
		

		// 영문자 A 부터 Z 까지 ASCII 코드를 화면에 표시
		for(char i = 'A'; i<'Z'; i++) {
			System.out.print(i+" : ");
			System.out.print((int)i);
			System.out.println();
		}
		
		// 문자 0부터 9까지 ASCII
		for(char i = '0' ; i<='9';i++) {
			System.out.print(i+" : ");
			System.out.println((int)i);
		}
		
		for( char i = '0'; i<='z'; i++) {
			System.out.print(i + " : ");
			System.out.println((int)i);
		}
	}

}
