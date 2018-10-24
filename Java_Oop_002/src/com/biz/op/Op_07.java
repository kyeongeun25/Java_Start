package com.biz.op;

public class Op_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자형 배열을 만들고 for를 이용해서 반복할 때,
		// 배열의 개수를 항상 기억해야 하는 문제가 있다.
		
		// 예) 10개의 정수형 배열을 만들고
		int[] intNums = new int[10] ;
		
		// 배열에 임의 값을 할당
		for(int i = 0 ; i < 10 ; i ++) {
			intNums[i] = (int)(Math.random() * 100);
		}
		
		// 할당된 값을 확인
		//for ( int i = 0 ; i < 100 ; i++) {
		//	System.out.println(intNums[i]);
		//}
		
		// 만약 위 코드에서 배열의 개수를 바꾸려면
		// 선언부분, 할당부분, 확인부분 3곳을 같이 바꾸어야 한다.
		// 한가지를 변경하는데 여러 곳의 코드를 수정하는 것은 
		// 오류 발생 확률을 높인다.
		// 그래서 최소한의 코드를 바꾸어 기능 변경을 할 수 있도록
		// 코드를 작성해야 한다.
		
		// 첫번째 방법
		// 배열의 경우에 배열 개수를 변수로 선언
		int nCnt = 100;
		int[] intNum2 = new int[nCnt];
		for(int i = 0; i <nCnt ; i++) {
			intNum2[i] = (int)(Math.random() * 100);
		}
		for( int i = 0 ; i < nCnt ; i++) {
			System.out.println(intNum2[i]);
		}
		System.out.println();
		
		// 클래스의 확장을 사용하는 방법
		int[] intNum3 = new int[199];
		// 배열.length는 배열의 크기를 갖는 속성(변수)다.
		// 다만 배열.length는 읽기 전용
		// intNum3.length = 10 : 불가한 코드(=읽기전용)
		System.out.println(intNum3.length);
		
		// 000.method() : 이때 000을 객체라고 불러도 무방
		// 000.method()의 괄호안에 값을 전달하면
		// 			값을 setting 하라는 지시
		// 변수 = 000.method()는 값을 읽기(getting) 하라는 지시
		
		// 000.property : property는 변수와 역할이 같다.
		// 000.property = 값 : 값을 전달(쓰기, 할당) 하라는 지시
		// 변수 = 000.property : 값을 읽기 지시
		// 그런데 000.property는 읽기전용, 쓰기전용이 있다.
		
		// 배열의 크기가 바뀌었을 때 코드를 최소한 수정하는
		// 두번째 방법
		// 배열의 length 속성을 이용하는 방법
		
		// 값 할당
		for(int i = 0 ; i < intNum3.length ; i++) {
			intNum3[i] = (int)(Math.random()*100);
		}
		
		// 값 읽기
		for( int i = 0 ; i < intNum3.length ; i++) {
			System.out.println(intNum3[i]);
		}
		
		
		

		
		
	
		
		
	}

}
