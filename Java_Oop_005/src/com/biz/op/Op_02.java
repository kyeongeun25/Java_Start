package com.biz.op;

import com.biz.op.service.VatService;

public class Op_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VatService 클래스를 객체로 선언
		VatService vatService = new VatService();
		
		System.out.println(vatService.sum(30, 80));
		System.out.println(vatService.이익금(1200, 1000));
		
		/*
		 *  상품가격을 계산 할 때
		 *  상품가격이 부가세 별도이면
		 *  부가세는 상품가격/10 으로 단순 계산하면 된다.
		 *  	상품가격이 800원이면 부가세는 80 : 실제금액 880원
		 *  
		 *  상품가격이 부가세 포함이면
		 *  1. 상품가격을 부가세 별도 금액으로 계산해야 한다.
		 *  	상품가격 / 1.1로 계산하고,
		 *  	소수점이하 값을 버린다.
		 *  
		 */
		
		System.out.println("부가세 별도 : "+(int)(1000/1.1));
		
		
		// vatService에 새롭게 정의된 이익금() 메서드를 이용해서 
		// 부가세가 제외된 이익금을 계산
		// 새로 정의된 이익금() 메서드는 실수값을 2개 받도록 되어 있다.
		
		int 이익금 = vatService.이익금(1200f, 1000f);
		System.out.println("부가세 별도 이익금 : "+이익금);
		
		
		
		
		
	}

}
