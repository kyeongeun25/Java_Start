 package com.biz.op;

 /*
  * 성적표를 담을 value object ( member변수 + getter,setter ) 생성
  * member 명세
  * 학번		: intNum
  * 국어점수	: intKor
  * 영어점수	: intEng
  * 수학점수	: intMath
  * 총점		: intSum
  * 평균		: intAvg
  * 
  * member 명세에 맞도록 member 변수를 생성하고
  * getter와 setter를 작성하시오
  */
 
public class Grade02 {

	private int intNum = 0;
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private int intAvg = 0;
	
	
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	public int getIntKor() {
		return intKor;
	}
	
	// intKor member변수에
	// 불필요한 값이 입력(추가, 할당)되는 것을 막기 위한 조치
	public void setIntKor(int intKor) {
		if(intKor <0 || intKor >100) {
			System.out.println("입력된 점수 : "+intKor);
			System.out.println("국어점수는 0~100까지만 입력 가능합니다.");
			return ;
		}
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	
	
	
}
