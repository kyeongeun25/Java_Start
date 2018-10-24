package com.biz.Be04;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 = 0;
		int intNum2 = 0;
		
		// intNum1에 30을 할당
		intNum1 = 30;
		
		// intNum1의 값을 intNum2에 '복사'
		intNum2 = intNum1 ;
		// >> intNum2에 30이라는 값이 복사 됨
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		// intNum1에 20을 할당
		intNum1 = 20 ;
		// intNum2에 값은 변함이 없다.
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		// intNum1과 intNum2가 같은지, 다른지 확인해보기
		if(intNum1==intNum2) {
			System.out.println("intNum1과 intNum2가 같다.");
		} else {
			System.out.println("intNum1과 intNum2는 같지 않다.");
		}
		
		
		
		
	}

}
