package com.biz.op;

/*
 * 성적 처리를 위해서 아래 member변수를 갖는
 * Value Object 클래스를 디자인(proto type생성)
 * 
 *  >> 사용하려면 객체로 생성을 해야만 사용가능
 *  member 변수 명세
 *  학번 : intNum
 *  이름 : strName
 *  국어 : intKor
 *  영어 : intEng
 *  수학 : intMath
 */

public class GradeVO {

	// private : public과 반대개념으로 다른곳에서 member변수에
	//				직접 접근 할 수 없도록 정보를 은닉하는 것
	// public : 다른곳에서 GradeVO의 member변수나, method에
	//   	     접근 할 수 있도록 개방
	
	private int intNum = 0 ;
	private String strName = " " ;
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	/**
	 * @return the intNum
	 */
	
	// getter와 setter는 외부에서 member변수에
	// 접근하는 통로이므로
	// public으로 설정한다.
	public int getIntNum() {
		return intNum;
	}
	/**
	 * @param intNum the intNum to set
	 */
	
	// method도 외부에서 접근하지 못하도록
	// private로 설정 할 수 있다.
	// 이 방법은 method를 아직 테스트 중이거나 
	// 특별히 내부에서만 사용 할 수 있도록 하는 방법이다.
	private void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	
	public void 사용금지(int intNum) {
		setIntNum(intNum) ;
	}
	/**
	 * @return the strName
	 */
	public String getStrName() {
		return strName;
	}
	/**
	 * @param strName the strName to set
	 */
	public void setStrName(String strName) {
		this.strName = strName;
	}
	/**
	 * @return the intKor
	 */
	public int getIntKor() {
		return intKor;
	}
	/**
	 * @param intKor the intKor to set
	 */
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	/**
	 * @return the intEng
	 */
	public int getIntEng() {
		return intEng;
	}
	/**
	 * @param intEng the intEng to set
	 */
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	/**
	 * @return the intMath
	 */
	public int getIntMath() {
		return intMath;
	}
	/**
	 * @param intMath the intMath to set
	 */
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	
	// 외부에서 접근 할 수 있는 통로를 생성
	// getter와 setter
	
	
	
}
