package com.biz.op_2;

public class Grade04 {
	
		// VO class�� ���鶧��
		// �ϴ� member ������ ��� private�ؼ� �����.
		
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
				System.out.println("���������� 0���� Ŀ�� �Ѵ�.");
				return ;
			}
			if(intKor>100) {
				System.out.println("���������� 100�̸����� �Է�");
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
