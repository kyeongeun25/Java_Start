package com.biz.ap;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 *  Text ������ ���� �� 
 *  FileWriter�ܿ� PrintWriter��� Ŭ������ ����ϱ⵵ �Ѵ�.
 */
public class Ap_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data2.txt" ;
		
		// JDK7 ���� �ַ� ����ϴ� Text ���� ��� Ŭ����
		PrintWriter printWriter = null ;
		
		try {
			printWriter = new PrintWriter(fileName) ;
			
			for(int i = 1 ; i <= 100 ; i++) {
				printWriter.print(i);
				printWriter.print(" : ");
				int kor = (int)(Math.random()*(100-50)+50) ;
				printWriter.println(kor);
			}
			printWriter.flush();
			printWriter.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
