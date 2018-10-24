package com.biz.app;
/*
 *  LOTTO 번호 생성기
 */
public class App_02 {

	public static void main(String[] args) {
		// lotto 번호를 담을 정수형 배열 6개를 선언
		int[] lotto = new int[6];
		
		for(int i  = 0; i<lotto.length;i++) {
			int n = (int)(Math.random() * (45-1)+1);
			
			// 같은 번호가 생성되었나 확인
			if(numCheck(lotto,n)) {		
				// 현재 i 위치의 값을 다시 재생성
				// 일단 i 값을 1 감소시키고 
				// for를 다시 시작한다.
				i -- ; // 만약 현재 3이었다면, i를 2로 만들고
					// 반복문을 다시 시작하라
				
				// 또 같은 번호가 나오면?
				// break; 반복문을 끝내기
				continue;	// 이후의 명령들을 모두 건너뛰고 for를 다시 시작
			}
			lotto[i] = n ; 
		}
		// 번호를 정렬해서 보여주자.
		for(int i = 0 ; i < 6 ; i++) {
			for(int j = i; i<6;j++) {
				if(lotto[i] > lotto[j]) {
					int t = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = t;
				}
			}
		}
		
		
		for(int n : lotto) {
			System.out.print(n+" ");
		}
		

	}
	
	// 배열을 매개변수로 전달하는 방법
	public static boolean numCheck( int[] lotto, int n ) { 
		for(int i : lotto) {
			if(i == n) {
				return true;
			}
		}
		return false ;
	}

}
