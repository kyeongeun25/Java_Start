package com.biz.app;

import com.biz.app.children.사각형;
import com.biz.app.parents.도형;
/*
 * 클래스의 상속
 *  1.	기존의 잘 작성된 클래스의 모든 기능을 그대로 물려받아서
 * 		별도의 코드 수정 없이 사용하는 것
 * 
 *  2.	기존 클래스의 좋은 기능은 모두 그대로 사용하면서
 * 		별도의 추가 기능을 첨가하여 사용하고 싶을 때
 * 		상속을 받은 후 기존 method를 다시 정의(재정의, Override)하거나
 * 		새로운 method, member변수 등을 추가하여 사용한다.
 * 
 *  3.	상속 후 기능을 변경하였지만 
 * 		기존 클래스를 이용하여 개발된 다른 부분에는 
 * 		어떤 영향도 미치지 않는다.
 */
public class ExtendsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		도형 poly = new 도형();
		poly.넓이();
		
		사각형 rec = new 사각형();
		rec.set가로(5);
		rec.set세로(10);
		rec.넓이();
		// 사각형의 넓이는 ~~입니다
		
	}

}
