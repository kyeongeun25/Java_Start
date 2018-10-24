package com.biz.op_2;

public class GradeVO_1 {

	int intNum = 0 ;
	String strName = new String() ;
	int intKor = 0; 
	int intEng = 0;
	int intMath = 0;
	
	// method »ý¼º
	public int ÃÑÁ¡() {
		
		int intSum = intKor ;
		intSum += intEng;
		intSum += intMath;
		
		return intSum;
	}
	
}
