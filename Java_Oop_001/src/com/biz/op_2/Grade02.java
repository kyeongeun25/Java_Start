package com.biz.op_2;

public class Grade02 {
	
	// private key word�� ���۵Ǵ� member ������
	// �ٸ� Ŭ�������� ���� �Ұ���
	private int intNum = 0 ;
	private String strName = "" ;
	private int intKor = 0 ;
	private int intEng = 0 ;
	private int intMath = 0 ;
	
	// private ������ ���� �� �� ���� ������ �޼��带 ���ؼ� ����
	public void setIntKor(int intKor) {
		
		if( intKor <0 ) {
			System.out.println("���������� 0�� �̸��� �� �� �����ϴ�.");
			return ;
		}
		
		if( intKor > 100 ) {
			System.out.println("���������� 100�� �ѱ� �� �����ϴ�.");
			return ; 
		}
		
		this.intKor = intKor ; // this.intKor�� member���� intKor�� �Ű�����
		
	}
	
	
}
