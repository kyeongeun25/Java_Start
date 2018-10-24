package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 어떤 회사에서 
 * 새로운 회원을 모집을 했다.
 * 
 * 회원모집을 하면서 이벤트를 걸었는데
 * 추첨을 통해서 
 * 상품권을 지급한다고 약속을 했다.
 * 
 * 마감이 되어서 추첨을 해야 하는데
 * 손으로 하려니 복잡하고 
 * 신뢰성에 문제를 제기하는 사람 있을 것 같다.
 * 
 * 추첨 조건은 특별한 것이 없다.
 * 
 * 회원 중에 상품권을 받을 사람을 추첨하는 코드를 작성한다.
 * 
 * >> Raffle 코드
 * 
 */

public class App {
	
	public static void main(String[] args) {
		
		// ArrayList에 가입한 회원들의 이름을 등록
		ArrayList<String> members = new ArrayList<String>();
		
		// 회원이름을 추가
		members.add("홍길동");
		members.add("이몽룡");
		members.add("성춘향");
		members.add("장보고");
		members.add("장영실");
		members.add("임꺽정");
		members.add("정도전");
		members.add("장보고");
		members.add("장영실");
		members.add("임꺽정");
		members.add("정도전");
		
		
		// shuffle
		Collections.shuffle(members);
		
		// 위 명단 중 2명만 뽑기
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println(i+" 번 당첨 : "+members.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
