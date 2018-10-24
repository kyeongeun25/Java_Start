package com.biz.op;

import com.biz.op.animal.AnimalParent;

public class Op_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalParent animal = new AnimalParent();
		
		
		// hashCode : 고유한 정수값을 출력해주는 메소드
		System.out.println("hashCode : "+animal.hashCode());
		System.out.println("toString() : "+animal.toString());
		
	}

}
