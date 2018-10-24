package com.biz.op.animal;

public class CatChild extends AnimalParent {

	@Override
	public void 다리개수() {
		// TODO Auto-generated method stub
		System.out.println("우리집 나비는 다리가 4개");
		
		// 부모 클래스에 정의된 method를 호출하는 것
		super.다리개수();
	}

	
	
}
