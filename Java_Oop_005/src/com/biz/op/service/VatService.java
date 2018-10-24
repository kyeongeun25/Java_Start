package com.biz.op.service;

/*
 *  extends : 기존에 이미 만들어져 있는 클래스를 상속받아서 사용하겠다.
 *  
 *  VatService는 AddService를 상속하겠다.
 *    => vatService는 addService에 정의된 method 중에서
 * 		   public으로 선언된 것들을 모두 이어받아서 사용하겠다는 것
 */
public class VatService extends AddService {

	// 판매금액과 매입금액을 실수(float)로 전달받아서
	// vat가 제외된 이익금을 return하는 method 생성
	public int 이익금(float 판매금액, float 매입금액) {
		int 판매 = (int)(판매금액 / 1.1f) ;
		int 매입 = (int)(매입금액 / 1.1f );
		
		return (int)(판매 - 매입) ;
		
	}
	
	
	
}
