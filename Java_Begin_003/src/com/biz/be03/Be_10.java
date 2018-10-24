package com.biz.be03;
/*
 * 메서드(method)
 * 		복잡하고, 반복되는 코드를 main 외부에 별도로 선언하고
 * 		main에서 호출하여 사용하는 방법
 * 
 * 메서드 생성
 * 		메서드 이름()
 * 		- 변수 이름 짓기와 같다.
 * 		- 첫글자 소문자
 * 		- 이후에는 영문자, 숫자, _
 * 		- 맨 끝에는 ()가 나온다.
 * 		- 괄호안에는 변수를 선언 할 수 있다.
 * 			>> 괄호안의 변수를 특별히 "매개변수, 파라메터" 라고 한다.
 * 
 * 호출하는 곳에서는 메서드의 매개변수에 따라
 * 		값, 변수를 전달한다.
 * 		- 호출하는 곳에서 전달하는 변수 값을 "아규먼트"라고 한다.
 * 		- 호출하는 곳에서 전달하는 변수나 값은 
 * 		- 메서드 생성할 때 만든 변수 개수, 형태가 같아야 한다.
 * 
 */
public class Be_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(1,100);
		sum(100,1000);
		sum(5, 50);
		sum(0,100,2); // 짝수의 합
		sum(1,100,2); // 홀수의 합
		sum("홀수의 합",1,100,2);
		sum("짝수의 합",0,100,2);
		
		for( int i=1;i<10;i++) {
			for(int x=5-i;x>0;x--) {
				System.out.print(" ");
			}
			for(int y=1;y==i;y+=2) {
				if(y%2!=0) {
					System.out.println("*");
					
				}
			}
		}
	}

	// 매개변수가 없는 method
	public static void sum() {
		
	}
	
	// 매개변수가 정수형 2개 있는 method
	public static void sum(int num1, int num2) {
		
		int intSum = 0;
		for(int i=num1; i<num2; i++) {
			intSum += i;
			
		}
		System.out.println(num1+"부터 "+ num2 + "까지의 합 : "+intSum);
	}
	
	// 매개변수가 정수형 3개 있는 method
	public static void sum(int start, int end, int step) {
		int intSum = 0;
		for(int i =start; i<=end;i +=step){
			intSum+=i;
		}
		System.out.println("합 : "+intSum);
	}
	
	// 매개변수가 문자열형 1개, 정수형 3개 있는 method
	public static void sum(String title, int start, int end, int step) {
		int intSum = 0;
		for(int i = start ; i<=end; i+= step) {
			intSum += i;
		}
		System.out.println(start+"부터 "+end+"까지의 "+title+"="+intSum);
	}
}
