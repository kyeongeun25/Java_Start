package com.biz.op.imp;

public class RadioRemoCon implements RemoCon{

	@Override
	public void 볼륨() {
		// TODO Auto-generated method stub
		System.out.println("라디오 볼륨 조정");
	}

	@Override
	public void 채널() {
		// TODO Auto-generated method stub
		System.out.println("라디오 채널 조정");
	}

	@Override
	public void 전원() {
		// TODO Auto-generated method stub
		System.out.println("라디오 전원 온오프");
	}

}
