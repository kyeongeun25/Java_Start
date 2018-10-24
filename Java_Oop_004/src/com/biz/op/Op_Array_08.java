package com.biz.op;

public class Op_Array_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strName = new String[] {
				"홍길동",
				"이몽룡",
				"성춘향",
				"장보고",
				"장영실",
				"임꺽정",
				"정도전",
				"이몽룡",
				"성춘향",
				"장보고",
				"장영실"
				
		}; // 문자열 배열 초기값을 지정하고 생성하는 방법
			// 요소 초기 값 개수를 세어서 배열을 생성해 준다.
			// 중괄호({}) 다음에 반드시 세미콜론(;)을 찍어야 한다.
		
		// 성춘향 이름이 배열의 몇 번째에 있는지 확인
		// 최초에 발견된 위치 알기
		System.out.println("최초위치===============");
		for(int i = 0; i < strName.length ; i++) {
			if(strName[i].equals("성춘향")){
				System.out.println("성춘향은 "+i+"번째 있음");
				break;		// for 반복문 중단
			}
		}
		System.out.println("전체위치============");
		// 전체 어디어디 있는지 알기
		for(int i = 0; i < strName.length ; i++) {
			if(strName[i].equals("성춘향")){
				System.out.println("성춘향은 "+i+"번째 있음");
				
			}
		}
		
	}

}
