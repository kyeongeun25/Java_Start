package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;
/*
 *  동명이인을 구별하기 위해 전화번호를 추가해서
 *  전화번호까지 같이 표기 해 보기
 */
public class App_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MemberVO> members = new ArrayList<MemberVO>();

		// 회원이름을 추가
		members.add(new MemberVO("홍길동", "111"));
		members.add(new MemberVO("이몽룡", "112"));
		members.add(new MemberVO("성춘향","113"));
		members.add(new MemberVO("장보고","114"));
		members.add(new MemberVO("장영실","115"));
		members.add(new MemberVO("임꺽정","116"));
		members.add(new MemberVO("정도전","117"));
		members.add(new MemberVO("장보고","118"));
		members.add(new MemberVO("장영실","119"));
		members.add(new MemberVO("임꺽정","120"));
		members.add(new MemberVO("정도전","121"));
		
		MemberVO vo = new MemberVO("장보고","122");
		members.add(vo);
		vo = new MemberVO("장영실","123");
		members.add(vo);
		vo = new MemberVO("임꺽정","124");
		members.add(vo);
		
		Collections.shuffle(members);
		for(int i = 0 ; i < 3 ; i ++) {
			System.out.println((i+1)+"번째 당첨자 : "+members.get(i) );
															// = members.get(i).toString()
															// memgers.get(i)는 members에 포함된
															// 어떤 VO가 추출된다.
															// 객체를 println()으로 콘솔에 출력하도록 하면
															// 자동으로 객체.toString() 메서드를 호출한다.
			
		}
	}

}
