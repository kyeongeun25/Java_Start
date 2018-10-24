package com.biz.op;

import com.biz.op.imp.RadioRemoCon;
import com.biz.op.imp.RemoCon;
import com.biz.op.imp.TvRemoCon;

public class Op_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TvRemoCon tv  = new TvRemoCon();
		
		tv.전원();
		tv.볼륨();
		tv.채널();
		
		RadioRemoCon radio = new RadioRemoCon();
		
		radio.전원();
		radio.볼륨();
		radio.채널();
		
		// 인터페이스를 상속받은 클래스는
		// 인터페이스로 선언하고
		// 자신(자식클래스)으로 초기화하여 사용하기도 한다.
		// 이론에서 객체간의 응집도를 낮추어 코드를 유연하게
		// 하는 것이라고 한다.
		
		// RemoCon 부모 클래스로 선언하고
		// TvRemoCon 자식 클래스로 초기화 한 것
		RemoCon tv1 = new TvRemoCon();
		tv1.전원();
		tv1.볼륨();
		tv1.채널();
		
		RemoCon rd1 = new RadioRemoCon();
		rd1.전원();
		rd1.볼륨();
		rd1.채널();
		
	}

}
