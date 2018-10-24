package com.biz.app.children;

import com.biz.app.parents.도형;

public class 사각형 extends 도형 {

	private int 가로 = 0;
	private int 세로 = 0;
	
	
	public int get가로() {
		return 가로;
	}
	public void set가로(int 가로) {
		this.가로 = 가로;
	}
	public int get세로() {
		return 세로;
	}
	public void set세로(int 세로) {
		this.세로 = 세로;
	}
	
	public void 넓이() {
		System.out.println("가로 : " + this.가로);
		System.out.println("세로 : "+this.세로);
		System.out.println("사각형의 넓이 : "+ (this.가로 * this.세로));
	}
	
	
}
