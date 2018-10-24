package com.biz.op.imp;
/*
 *  RemoCom 인터페이스를 상속받은
 *  TvRemoCon은 RemoCon에 정의된
 *  구조만 있는 method들을 반드시 재정의해야
 *  문법 오류가 나지 않는다.
 */


public class TvRemoCon implements RemoCon {

	@Override
	public void 볼륨() {
		// TODO Auto-generated method stub
		System.out.println("볼륨조정");
	}

	@Override
	public void 채널() {
		// TODO Auto-generated method stub
		System.out.println("채널조정");
	}

	@Override
	public void 전원() {
		// TODO Auto-generated method stub
		System.out.println("전원ON/OFF");
	}

}
