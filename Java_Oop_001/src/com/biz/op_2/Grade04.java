package com.biz.op_2;

public class Grade04 {
	
		// VO class를 만들때는
		// 일단 member 변수를 모두 private해서 감춘다.
		
		private int intNum = 0 ;
		private String strName = "" ;
		private int intKor = 0 ;
		private int intEng = 0 ;
		private int intMath = 0 ;
		
		public int getIntNum() {
			return intNum;
		}
		public void setIntNum(int intNum) {
			this.intNum = intNum;
		}
		public String getStrName() {
			return strName;
		}
		public void setStrName(String strName) {
			this.strName = strName;
		}
		public int getIntKor() {
			return intKor;
		}
		public void setIntKor(int intKor) {
			if(intKor<0) {
				System.out.println("국어점수는 0보다 커야 한다.");
				return ;
			}
			if(intKor>100) {
				System.out.println("국어점수는 100미만으로 입력");
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
		
		
}
