package com.biz.op.imp;

/*
 *  interface
 *  		method만을 갖는 특별한 class
 *  		혼자는 아무일도 못한다.
 *  		반드시 누군가가 상속을 받아야만 사용 할 수 있다.
 *  
 *  interface에 선언된 method는 몸체( {} )가 없이 정의
 *  interface를 상속받은 클래스에서는
 *  반드시 interface에 선언된 method를 다시 재정의해야 한다.
 *  반드시 method를 작성해야 한다.
 *   
 */

public interface RemoCon {

	public void 볼륨();
	public void 채널();
	public void 전원();
	
}
