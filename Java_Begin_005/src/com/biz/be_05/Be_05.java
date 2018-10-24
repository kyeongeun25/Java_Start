package com.biz.be_05;

public class Be_05 {

	 /**
	  * 정수형 변수 한개를 선언하고, 30을 할당 한 후 
	  * 
	  * add() 메서드를 만들고,
	  * add() 메서드에 변수를 전달한다.
	  * 
	  * add() 메서드는
	  * 전달 받은 값에 10을 더하여 return 한다.
	  * 
	  * return 받은 값을 콘솔에 표시한다.
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		System.out.println(num1+" + 10 = "+add(num1));
		int num2 = 20;
		System.out.println(num2+" + 10 = "+add(num2));
		
	}
	public static int add(int num1) {
		return num1+10;
	}

}
