 package com.biz.op_2;

public class Grade05 {


		private int intNum = 0 ;
		private String strName = "" ;
		private int intKor = 0 ;
		private int intEng = 0 ;
		private int intMath = 0 ;
		
		public int getIntNum() {
			if(intNum<0 || intNum>100) {				// || OR연산 둘 중에 하나라도 조건이 참이면 실행
				System.out.println("학번을 확인하세요");
				
			}
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
			if( intKor >= 0 && intKor <= 100) {		// AND연산 둘 다 참이면 실행
				this.intKor = intKor;
			}else {
				System.out.println("국어점수는 0~100 까지만 가능");
			}
			
			
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
