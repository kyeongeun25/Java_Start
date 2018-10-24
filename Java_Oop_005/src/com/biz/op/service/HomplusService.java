package com.biz.op.service;

public class HomplusService extends AddService {
	
	/*
	 *  부모 클래스의 method 중에서
	 *  	그 기능이 필요없으나,
	 *  	이름은 그대로 사용하기 위해서
	 *  	method를 재 정의하는 것
	 *  	===> Override
	 * 
	 */
	
	
	@Override
	public int 이익금(int 판매금액, int 매입금액) {
		
		int 판매 = (int)(판매금액 / 1.1f) ;
		int 매입 = (int)(매입금액 / 1.1f );
		
		return (int)(판매 - 매입) ;
	}

}
